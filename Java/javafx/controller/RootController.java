package javafx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable{
	@FXML private Button btn1; // btn1 객체 주입
	@FXML private Button btn2; // btn2 객체 주입
	@FXML private Button btn3; // btn3 객체 주입

	@Override
	public void initialize(URL location, ResourceBundle resources) { //UI컨트롤의 초기화, 이벤트 등록, 속성 감시
		btn1.setOnAction(new EventHandler<ActionEvent>() { 

			@Override
			public void handle(ActionEvent event) { //직접 EventHandler 생성 후 등록
				handleBtn1Action(event);
			}
			
		});
		
		btn2.setOnAction(event->handleBtn2Action(event)); //람다식 이용
		btn3.setOnAction(event->handleBtn3Action(event));
	}
	
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼1 클릭");
	}
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼2 클릭");
	}
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼3 클릭");
	}
}
