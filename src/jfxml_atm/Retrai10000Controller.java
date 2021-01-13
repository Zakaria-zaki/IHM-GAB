/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_atm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class Retrai10000Controller implements Initializable {

    @FXML
    private AnchorPane main_retrai10000;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prendre10000(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_merci.fxml"));
        main_retrai10000.getChildren().setAll(root);
    }
    
}
