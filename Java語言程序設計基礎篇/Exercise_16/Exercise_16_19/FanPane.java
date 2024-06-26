package Java語言程序設計基礎篇.Exercise_16.Exercise_16_19;

import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.geometry.Insets;
import javafx.beans.property.DoubleProperty;

public  class FanPane extends Pane {
	private Circle circle = new Circle();
	private double startAngle = 15; // Start angle of arcs
	private Timeline fan; // animation
	private Pane paneForBlades = new Pane(); // Create four arcs
	private Arc arc;

	/**  Construct a FanPane */
	public FanPane() {
		setPadding(new Insets(10, 10, 10, 10));
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		circle.centerXProperty().bind(widthProperty().divide(2));
		circle.centerYProperty().bind(heightProperty().divide(2));
		circle.radiusProperty().bind((heightProperty().divide(2)).multiply(.90));
		getBlades();
		getChildren().addAll(circle, paneForBlades);
		fan = new Timeline(
			new KeyFrame(Duration.millis(50), e -> spinFan()));
		fan.setCycleCount(Timeline.INDEFINITE);
		fan.play(); // Start animation
	}

	/** Animate fan blades */
	protected void spinFan() {
		ObservableList<Node> list = paneForBlades.getChildren();
		for (Node n: list) {
			((Arc)n).setStartAngle(((Arc)n).getStartAngle() + startAngle);
		}
	}

	/** Pause animation */
	public void pause() {
		fan.pause();
	}

	/** Resume animation */
	public void play() {
		fan.play();
	}

	/** Reverse the direction of fan spin */
	public void reverse() {
		startAngle *= -1;
	}

	// return rateProperty
	public DoubleProperty rateProperty() {
		return fan.rateProperty();
	} 

	/** Add four arcs to a pane and place them in a stack pane */
	private void getBlades() {
		double angle = 0;
		for (int i = 0; i < 4; i++) {
			arc = new Arc(); 
			arc.centerXProperty().bind(widthProperty().divide(2));
			arc.centerYProperty().bind(heightProperty().divide(2));
			arc.radiusXProperty().bind(circle.radiusProperty().multiply(.90));
			arc.radiusYProperty().bind(circle.radiusProperty().multiply(.90));
			arc.setStartAngle(angle + 90);
			arc.setLength(50);
			arc.setFill(Color.BLACK);
			arc.setType(ArcType.ROUND);
			paneForBlades.getChildren().add(arc);
			angle += 90;
		}
	}
}