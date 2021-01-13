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
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class FXMLDocumentController implements Initializable {
           public static String num_cart ;
    @FXML
    public TextField Num_carte;
    @FXML
    private Button Entrer;
    @FXML
    private AnchorPane main_inserer_fr;
    private Object Pin_fr;
    @FXML
    private Label message_invalida_fr;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void Enter_fr(ActionEvent event) throws IOException, SQLException {
        num_cart= Num_carte.getText();
        
        if(BDD_jdbc.BDD_jdbc1.verify_account(FXMLDocumentController.num_cart)){
            
    
            Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_PIN_fr.fxml"));
            main_inserer_fr.getChildren().setAll(root);
            
            //System.err.println("valide");
        }else if(num_cart.equals("")) {
            message_invalida_fr.setText("inseré votre carte SVP");
        }else {
            message_invalida_fr.setText("Votre carte est invalide");
        }
    }

    @FXML
    private void valider(TouchEvent event) {
    }

    @FXML
    private void retour_langue(MouseEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("langues.fxml"));
        main_inserer_fr.getChildren().setAll(root);

    }

    
}