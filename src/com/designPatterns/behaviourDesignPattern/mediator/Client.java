package com.designPatterns.behaviourDesignPattern.mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

/**
 * In Mediator design pattern. Object whose state has changed and objects which are listening to other
 * object state change, need not implement same interface.
 *
 * //Good example of mediator design pattern is chat application.
 * https://www.journaldev.com/1730/mediator-design-pattern-java
 *
 * @see java.util.Timer scheduleXXX() methods is example for Mediator Design Pattern.
 * @see java.util.TimerTask when ever we want to execute a TimerTask job.
 * We give this TimerTask job to Timer class and ask it execute this job at regular intervals(Based on the schedule method we call)
 * When ever timer class executes the timerTask job it call run method in TimerTask job.
 * So here basically Timer class is acting as mediator for executing the TimerTask jobs.
 *
 * All below are example of Mediator Design Pattern.
 * java.util.Timer (all scheduleXXX() methods)
 * java.util.concurrent.Executor#execute()
 * java.util.concurrent.ExecutorService (the invokeXXX() and submit() methods)
 * java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
 * java.lang.reflect.Method#invoke()
 */
public class Client extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		UIMediator mediator = new UIMediator();
		Slider slider = new Slider(mediator);
		TextBox box = new TextBox(mediator);
		Label label = new Label(mediator);
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(20);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.add(label, 0, 0);
		grid.add(slider, 0, 1);
		grid.add(box, 0, 2);
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setTitle("Mediator Pattern");
		primaryStage.setScene(scene);
		primaryStage.show();


		//JDK example of Mediator Design pattern
		Timer timer = new Timer();
		TimerTask job = new TimerTask() {
			@Override
			public void run() {
				//Perform Some Operation
			}
		};
		timer.scheduleAtFixedRate(job, 0, 10);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
