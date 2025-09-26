package main.launcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Launcher extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Chess");
		Label label = new Label("pic");
		Scene scene = new Scene(label, 100, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
