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
public class FXML_autre_arController implements Initializable {

    @FXML
    private TextField valeur_R_ar;
    @FXML
    private AnchorPane main_retrai_ar;
    @FXML
    private TextField Num_compte_ar;
    @FXML
    private Label label_compte2_ar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Validation_retrai_ar(ActionEvent event) throws SQLException, IOException {
        String Num_compte2_ar = Num_compte_ar.getText();
        if(BDD_jdbc.BDD_jdbc1.verify_account(Num_compte2_ar)){
        BDD_jdbc.BDD_jdbc1.valeur_RBDD(FXMLDocumentController.num_cart,valeur_R_ar.getText(),Num_compte_ar.getText());
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_merci_ar.fxml"));
        main_retrai_ar.getChildren().setAll(root);
    }else if(Num_compte2_ar.equals("")){
          label_compte2_ar.setText("ادخل رقم الحساب");
       }else{
          label_compte2_ar.setText("رقم الحساب غير صحيح");
       }
    }
    @FXML
    private void retour_ar(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_Document_arab.fxml"));
        main_retrai_ar.getChildren().setAll(root);
    }

   
    
}
