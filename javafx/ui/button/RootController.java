package javafx.ui.button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;
	@FXML private Button btnExit;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}

		
	}


