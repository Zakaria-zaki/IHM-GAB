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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author msi
 */

public class LanguesController implements Initializable {
    
    

    @FXML
    private Button Francais_fr;
    @FXML
    private AnchorPane langue1;
    @FXML
    private Button arabe_ar;

    /**
     * Initializes the controller class.
     */
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   

    @FXML
    private void francais(ActionEvent event) throws IOException {
        //
        
             Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
             langue1.getChildren().setAll(root);
          // stage.initStyle(StageStyle.UNDECORATED);
        
        
        
        
        
    }

    @FXML
    private void Arabe(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_Document_arab.fxml"));
        langue1.getChildren().setAll(root);
    }
    
    
}

