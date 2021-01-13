/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_atm;

import BDD_jdbc.BDD_jdbc1;
import static BDD_jdbc.BDD_jdbc1.connecterDB;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class FXML_demande_frController implements Initializable {

    @FXML
    private AnchorPane main_demande;
    @FXML
    private Label demande_valeur;
    @FXML
    private Label demande_n_carte;
    @FXML
    private Label demande_date;
    @FXML
    private Label demande_time;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Date d = new Date();
        SimpleDateFormat s= new SimpleDateFormat("dd-MM-yyyy");
        demande_date.setText(s.format(d));
        Date t = new Date();
        SimpleDateFormat r= new SimpleDateFormat("hh:mm:ss");
        demande_time.setText(r.format(d));
        
        String num_card = FXMLDocumentController.num_cart;
        demande_n_carte.setText(FXMLDocumentController.num_cart);
        try{
        Connection cnx = connecterDB();
        Statement st;
             ResultSet rst;
            st=cnx.createStatement();
            rst=st.executeQuery("select balance from compte where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ");
            while(rst.next()){
            demande_valeur.setText(""+rst.getInt("balance")+" DA");
            }
            // TODO
    }   catch (SQLException ex) {    
            Logger.getLogger(FXML_demande_frController.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        
    
}

    @FXML
    private void retour_demande_fr(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_menu_principale.fxml"));
        main_demande.getChildren().setAll(root);
    }
}