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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class FXML_autre_frController implements Initializable {

    @FXML
    private AnchorPane main_retrai_fr2;
    @FXML
    private TextField valeur_R;
    @FXML
    private TextField Num_compte_fr;
    @FXML
    private Label label_compte2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     
    @FXML
    private void Validation_retrai(ActionEvent event) throws SQLException, IOException {
        String Num_compte2 = Num_compte_fr.getText();
       if(BDD_jdbc.BDD_jdbc1.verify_account(Num_compte2)){
       BDD_jdbc.BDD_jdbc1.valeur_RBDD(FXMLDocumentController.num_cart,valeur_R.getText(),Num_compte_fr.getText());
       Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_merci.fxml"));
       main_retrai_fr2.getChildren().setAll(root);
    }else if(Num_compte2.equals("")){
          label_compte2.setText("insérer le numéro de compte");
       }else{
          label_compte2.setText("Numéro de compte est incorrecte");
       }
    }
    @FXML
    private void retour_fr2(ActionEvent event) throws IOException {
        //valeur_retrai=
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        main_retrai_fr2.getChildren().setAll(root);
    }
    
}
