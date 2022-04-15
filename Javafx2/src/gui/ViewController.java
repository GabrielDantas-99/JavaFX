package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
		Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.INFORMATION); // ERROR, CONFIRMATION
		//Alerts.showAlert("Alert title", null, "Hello", AlertType.INFORMATION); // Alerta menor
	}
	
}
