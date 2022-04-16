package network.chatting;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ServeMain extends Application{

	
	public ServeMain() {
		System.out.println(Thread.currentThread().getName()+"AppMain()호출");
}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+"init()호출");
		super.init();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		System.out.println(Thread.currentThread().getName()+"start()호출");
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Label label = new Label();
		Button button = new Button();
		
		label.setText("Hello, JavaFx");
		label.setFont(new Font(50));
		
		button.setText("확인");
		button.setOnAction(event->Platform.exit());
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("JavaFX Test");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+"stop()호출");
		super.stop();
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"main()호출");
		launch(args);
	}

}
