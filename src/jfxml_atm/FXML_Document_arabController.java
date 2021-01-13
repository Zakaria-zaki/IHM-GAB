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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import static jfxml_atm.FXMLDocumentController.num_cart;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class FXML_Document_arabController implements Initializable {

    @FXML
    private AnchorPane main_inséré_Ar;
    @FXML
    private Button Enter_Ar;
    @FXML
    private TextField Num_carte_Ar;
    @FXML
    private Label message_invalida_Ar;

    /**
     * Initializes the controller class.
     */
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Arabe_Pin(ActionEvent event) throws IOException, SQLException {
        num_cart= Num_carte_Ar.getText();
        
        if(BDD_jdbc.BDD_jdbc1.verify_account(FXMLDocumentController.num_cart)){
          
            Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_PIN_Ar.fxml"));
            main_inséré_Ar.getChildren().setAll(root);
            
        } else if(num_cart.equals("")) {
            message_invalida_Ar.setText("ادخل البطاقة من فضلك");
        }else{
            message_invalida_Ar.setText("بطاقتك غير صالحة");
        }
        
    }

    @FXML
    private void retour_langue_fr(MouseEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("langues.fxml"));
        main_inséré_Ar.getChildren().setAll(root);
    }
    
}
