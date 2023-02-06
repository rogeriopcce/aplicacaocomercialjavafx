package gui.util;

import javax.swing.JOptionPane;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alertas {

	public static void showAlerta(String titulo, String cabecalho, String msg, AlertType tipo) {
		Alert alert = new Alert(null);
		alert.setTitle(titulo);
		alert.setHeaderText(cabecalho);
		alert.setContentText(msg);
		alert.setAlertType(tipo);
		alert.show();
		
	}
	
}
