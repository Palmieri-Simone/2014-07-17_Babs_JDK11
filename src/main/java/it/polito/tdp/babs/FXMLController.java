package it.polito.tdp.babs;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.babs.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

//controller turno A --> switchare al branch master_turno B per turno B

public class FXMLController {
	
	private Model model;

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> boxLandmark;

    @FXML
    private Button btnElenca;

    @FXML
    private TextField txtSimulationDate;

    @FXML
    private Button btnSimula;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert boxLandmark != null : "fx:id=\"boxLandmark\" was not injected: check your FXML file 'Bike.fxml'.";
        assert btnElenca != null : "fx:id=\"btnElenca\" was not injected: check your FXML file 'Bike.fxml'.";
        assert txtSimulationDate != null : "fx:id=\"txtSimulationDate\" was not injected: check your FXML file 'Bike.fxml'.";
        assert btnSimula != null : "fx:id=\"btnSimula\" was not injected: check your FXML file 'Bike.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Bike.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
