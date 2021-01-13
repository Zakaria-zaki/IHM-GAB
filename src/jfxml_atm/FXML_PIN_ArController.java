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
public class FXML_PIN_ArController implements Initializable {

    @FXML
    private AnchorPane main_PIN_Ar;
    @FXML
    private PasswordField pin_code_ar;
    @FXML
    private Label pin_invalida_ar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void valider_PIN_ar(ActionEvent event) throws SQLException, IOException {
        if(BDD_jdbc.BDD_jdbc1.verify_PIN(FXMLDocumentController.num_cart,pin_code_ar.getText())){
            
    
            Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_menu_principale_ar.fxml"));
            main_PIN_Ar.getChildren().setAll(root);
            
            System.err.println("valide");
        }else if(pin_code_ar.getText().equals("")){
            pin_invalida_ar.setText("ادخل رقمك السري من فضلك");
        }else {
            pin_invalida_ar.setText("الرمز السري الخاص بك غير صحيح");
        }
    }

    @FXML
    private void annulation_menu_ar(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_Document_arab.fxml"));
        main_PIN_Ar.getChildren().setAll(root);
    }
    
}
