package afterglowJar;
//AUTHOR: Jakob Endrestad Kielland

public class Game {
	
	private PlayerPiece playerPiece;
	private PlayerScore playerScore;
	private PlayerHealth playerHealth;
	
	public Game() {
		playerPiece = new PlayerPiece();
		playerScore = new PlayerScore();
		playerHealth = new PlayerHealth();
	}
	
	//Methods concerning the players cake slice
	
	public void movePlayer (int direction) {
		playerPiece.setDirection(direction);
	}
	
	public int getPlayerPieceDirection() {
		return playerPiece.getDirection();
	}
	
	//Methods concerning the score and combo system
	
	public void addScore() {
		playerScore.addScore();
	}
	
	public int getScore() {
		return playerScore.getScore();
	}
	
	public int getCombo() {
		return playerScore.getCombo();
	}
	
	public void killCombo() {
		playerScore.killCombo();
	}
	
	//Methods concerning the health system
	
	public int getHealth() {
		return playerHealth.getHealth();
	}
	
	public void hurtPlayer() {
		playerHealth.hurtPlayer();
	}
	
	public void healPlayer() {
		playerHealth.healPlayer();
	}
	
	public String getHitPercentage() {
		return playerHealth.getHitPercentage();
	}
}
