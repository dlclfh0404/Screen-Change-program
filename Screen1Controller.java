package application;
	
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Screen1Controller implements Initializable {
	@FXML Label lblText;
	@FXML Button btnNewChange, btnChange, btnClose;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	//새 창 전환
	public void btnNewChangeAction(ActionEvent event) {
		try {
//			BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
			Stage stage = new Stage();
			stage.setTitle("새 창으로 전환된 프로그램");
			stage.setScene(new Scene(root, 600, 400));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//같은 창 전환
	public void btnChangeAction(ActionEvent event) {
		Stage stage = (Stage) btnChange.getScene().getWindow();
		try {
			Parent root2 = FXMLLoader.load(getClass().getResource("Screen3.fxml"));
			Scene sc = new Scene(root2);
			stage.setTitle("같은 창으로 전환된 프로그램");
			stage.setScene(sc);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//창 닫기
	public void btnCloseAction(ActionEvent event) {
		Stage stage = (Stage) btnClose.getScene().getWindow();
		stage.close();
	}

}
