package afterglowJar;
//AUTHOR: Jakob Endrestad Kielland

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BulletAnimation {
	int direction;
	int speed;
	Pane root;
	DropShadow dropShadow;
	
	public BulletAnimation(Pane root, int direction) {
		this.root = root;
		this.direction = direction;
		this.speed = 1;
		dropShadow = new DropShadow(); //makes a motion blur-like effect by casting a drop shadow in the direction the bullet is travelling from
		dropShadow.setColor(Color.web("#00d9ff"));
		dropShadow.setSpread(0.12);
		createAnimation();
	}
	
	public BulletAnimation(Pane root, int direction, int speed) {
		this.root = root;
		this.direction = direction;
		this.speed = speed;
		dropShadow = new DropShadow(); //makes a motion blur-like effect by casting a drop shadow in the direction the bullet is travelling from
		dropShadow.setColor(Color.web("#00d9ff"));
		dropShadow.setSpread(0.12);
		createAnimation();
	}
	
	private void createAnimation() {
		

		
		Circle cir = new Circle();
		cir.setFill(Color.web("#00d9ff"));
		cir.setRadius(10);
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(820));
		
		switch(direction) {
		case 0:
			/*dropShadow.setHeight(50);
			dropShadow.setWidth(0);
			dropShadow.setOffsetY(-10);*/
			
			cir.setLayoutX(400);
			cir.setLayoutY(-15);
			transition.setToX(0);
			transition.setToY(390);
			break;
		case 1:
			/*dropShadow.setHeight(0);
			dropShadow.setWidth(50);
			dropShadow.setOffsetX(10);*/
			
			cir.setLayoutX(815);
			cir.setLayoutY(400);
			transition.setToX(-390);
			transition.setToY(0);
			break;
		case 2:
			/*dropShadow.setHeight(50);
			dropShadow.setWidth(0);
			dropShadow.setOffsetY(10);*/
			
			cir.setLayoutX(400);
			cir.setLayoutY(815);
			transition.setToX(0);
			transition.setToY(-390);
			break;
		case 3:
			/*dropShadow.setHeight(0);
			dropShadow.setWidth(50);
			dropShadow.setOffsetX(-10);*/
			
			cir.setLayoutX(-15);
			cir.setLayoutY(400);
			transition.setToX(390);
			transition.setToY(0);
			break;
		case 5:
			cir.setVisible(false);
			break;
		default:
			throw new IllegalArgumentException("An animation from direction :" + direction + "was requested");
		}
		
		//cir.setEffect(dropShadow);
		root.getChildren().add(cir);
		cir.toBack();
		transition.setNode(cir);
		transition.play();
		
		//source for this solution: https://java-buddy.blogspot.no/2012/03/implement-setonfinished-to-handle-end.html
		transition.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				root.getChildren().remove(cir);
			}
		});
	}
}
