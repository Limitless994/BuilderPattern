package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UiMain {

	@FXML
	private Label out;
	
	public void generateRandom(ActionEvent e) {
		Random rand = new Random();
		int myRand=rand.nextInt(50)+1;
		out.setText(Integer.toString(myRand));
		//System.out.println(Integer.toString(myRand));
	}
}
