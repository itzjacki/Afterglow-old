package afterglowJar;
//AUTHOR: Jakob Endrestad Kielland

import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.text.Text;

public class GameController {
	
	//XML elements that will be interacted with
	@FXML
	private Arc playerPiece;
	@FXML
	private Pane rootPane;
	@FXML 
	private Pane startPane;
	@FXML
	private Text comboDisplay;
	@FXML
	private Text scoreDisplay;
	@FXML
	private Text healthDisplay;
	@FXML
	private Pane endPane;
	@FXML
	private Text endTitle;
	@FXML
	private Text endScore;
	@FXML
	private Text endAccuracy;
	@FXML
	private Pane aboutPane;
	
	//Declaration of various controller classes
	private HitboxController hc = new HitboxController();
	private Game game = new Game();
	
	//Declatation of the mediaplayer that plays the music
	private Clip backgroundMusic;
	
	Timer timer;
	
	@FXML
	public void startGame() {
		//removes the title screen
		startPane.setVisible(false);
		

		try {
			//imports music, creates a clip and assigns the music to the clip, then lowers the volume and plays it
			URL songUrl = getClass().getResource("BrainPower.wav");
			AudioInputStream inStream = AudioSystem.getAudioInputStream(songUrl);
			backgroundMusic = AudioSystem.getClip();
			backgroundMusic.open(inStream);
			
			//necessary to avoid future lawsuits about serious hearing damage caused by my background music
			//http://www.java2s.com/Code/Java/Development-Class/SettingtheVolumeofaSampledAudioPlayer.htm
			FloatControl gainControl = (FloatControl) backgroundMusic.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-17);
			
			backgroundMusic.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
		
		//responsible for making a new bullet every so often
		timer = new Timer();
		timer.schedule(new GameTick(), (long) 0, (long) 87.21);
		//the last number on the line above is the tick frequency the game runs on. it is 1/4th of the time between beats on the song used.
		//the reason it is 1/4th is cause 4 balls in one beat is the quickest i want them to spawn at any one period in the song.
		rootPane.requestFocus();
	}
	
	private void endGame(Boolean playerDied) {
		timer.cancel();
		backgroundMusic.stop();
		backgroundMusic.close();
		
		//In rare cases one or more of these have gotten stuck during a round (it is purely a visual bug, but annoying nonetheless. This helps prevent this issue from transferring over runs.
		scoreDisplay.setText("0");
		healthDisplay.setText("100");
		comboDisplay.setText("1");
		
		if (playerDied) {
			endTitle.setText("Game Over");
		}
		else {
			endTitle.setText("Game Completed");
		}
		endScore.setText(game.getScore() + ""); 
		endAccuracy.setText(game.getHitPercentage());
		endPane.setVisible(true);
		//TODO: Highscore system, globalt eller lokalt
	}
	
	@FXML
	private void endGameButton() {
		endGame(true);
	}
	
	@FXML
	private void restartGame() {
		BulletController.resetBulletController();
		hc = new HitboxController();
		game = new Game();
		endPane.setVisible(false);
		playerPiece.setStartAngle(45);
		startGame();
	}
	
	@FXML
	private void toggleAbout() {
		aboutPane.setVisible(! aboutPane.isVisible());
	}
	
	public class GameTick extends TimerTask{
		//The stuff that happens every tick is in the "run" method here
		@Override
		public void run() {
			//reads out which direction the next bullet should spawn from. There shouldnt spawn a bullet if the direction is -1 so 'action = -1'.
			int action = BulletController.getNextAction();
			
			if (action == 5) {
				endGame(false);
			}
			
			//checks if there's a bullet that will hit the player this game tick
			int imminentBullet = hc.hitboxPoll(action);
			
			//if there is a bullet that hits this tick, check if the player is facing the correct way to catch it
			if (imminentBullet != -1) {
				if (game.getPlayerPieceDirection() == imminentBullet) {
					game.addScore();
					game.healPlayer();
				}
				else {
					game.killCombo();
					game.hurtPlayer();
				}
			}
			
			//This used Platform.runLater so that the timer can interact with the platform thread which javafx uses. Otherwise it doesn't spawn any visible bullets.
			//https://stackoverflow.com/questions/16764549/timers-and-javafx
			Platform.runLater(new Runnable() {
	            public void run() {
	            	if (action != -1) {
	    				new BulletAnimation(rootPane, action);
	    			}
	            }
	        });
			if(game.getHealth() == 0) {
				endGame(true);
			}
			updateUI();
		}
	}
	
	
	private void updateUI() {
		healthDisplay.setText(game.getHealth() + "");
		comboDisplay.setText(game.getCombo() + "");
		scoreDisplay.setText(game.getScore() + "");
	}
	
	//Key listener that triggers every time a key is pressed with the anchor pane in focus
	@FXML
	public void keyListener(KeyEvent e) {
		if (e.getEventType() == KeyEvent.KEY_PRESSED) {
			switch (e.getCode()) {
				case UP:
				case W:
					game.movePlayer(0);
					playerPiece.setStartAngle(45);
					break;
				case RIGHT:
				case D:
					game.movePlayer(1);
					playerPiece.setStartAngle(315);
					break;
				case DOWN:
				case S:
					game.movePlayer(2);
					playerPiece.setStartAngle(225);
					break;
				case LEFT:
				case A:
					game.movePlayer(3);
					playerPiece.setStartAngle(135);
					break;
				default:
					break;
			}
		}
	}
}
