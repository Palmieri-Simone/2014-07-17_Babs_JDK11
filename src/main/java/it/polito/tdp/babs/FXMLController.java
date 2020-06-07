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
    private ComboBox<?> boxStazione;

    @FXML
    private Button btnConta;

    @FXML
    private TextField txtDistanza;

    @FXML
    private Button btnCerca;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert boxStazione != null : "fx:id=\"boxStazione\" was not injected: check your FXML file 'Bike.fxml'.";
        assert btnConta != null : "fx:id=\"btnConta\" was not injected: check your FXML file 'Bike.fxml'.";
        assert txtDistanza != null : "fx:id=\"txtDistanza\" was not injected: check your FXML file 'Bike.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Bike.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Bike.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
