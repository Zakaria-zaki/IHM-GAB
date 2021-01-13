/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_atm;

import static BDD_jdbc.BDD_jdbc1.connecterDB;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class FXML_merci_arController implements Initializable {

    @FXML
    private AnchorPane main_merci_ar;
    @FXML
    private Label prendre_numc_fr;
    @FXML
    private Label nom_fr;
    @FXML
    private Label prenom_fr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       String num_card = FXMLDocumentController.num_cart;
       prendre_numc_fr.setText(FXMLDocumentController.num_cart);
        try{
        Connection cnx = connecterDB();
        Statement st;
             ResultSet rst;
            st=cnx.createStatement();
            rst=st.executeQuery("select nom from client where num_carte="+num_card+"");
            while(rst.next()){
            nom_fr.setText(rst.getString("nom"));
            }     
    }catch(Exception e){
          e.printStackTrace();
        
    }
   try{
        Connection cnx = connecterDB();
        Statement st;
             ResultSet rst;
            st=cnx.createStatement();
            rst=st.executeQuery("select prenom from client where num_carte="+num_card+"");
            while(rst.next()){
            prenom_fr.setText(rst.getString("prenom"));
            }     
    }catch(Exception e){
          e.printStackTrace();
        
    }
        
        
    

        // TODO
    }    

    @FXML
    private void exit_ar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void r_merci_ar(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("langues.fxml"));
        main_merci_ar.getChildren().setAll(root);
    }
    
}
