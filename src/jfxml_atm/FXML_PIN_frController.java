/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_atm;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class FXML_PIN_frController implements Initializable {

    @FXML
    private AnchorPane main_PIN_fr1;
    @FXML
    private PasswordField pin_code_fr1;
    @FXML
    private Label pin_invalida_fr1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void valider_PIN_fr1(ActionEvent event) throws SQLException, IOException {
        if(BDD_jdbc.BDD_jdbc1.verify_PIN(FXMLDocumentController.num_cart,pin_code_fr1.getText())){
            Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_menu_principale.fxml"));
            main_PIN_fr1.getChildren().setAll(root);
            
            //System.err.println("valide");
        }else if(pin_code_fr1.getText().equals("")){
            pin_invalida_fr1.setText("entrer votre code PIN SVP");
        }
        else {
            pin_invalida_fr1.setText("votre code PIN est incorrecte");
        }
    }
    

    @FXML
    private void annulation_menu_fr1(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        main_PIN_fr1.getChildren().setAll(root);
    }
    
}
