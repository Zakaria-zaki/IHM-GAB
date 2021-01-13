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
public class FXML_demande_arController implements Initializable {

    @FXML
    private Label demande_valeur_ar;
    @FXML
    private Label demande_n_carte_ar;
    @FXML
    private Label demande_date_ar;
    @FXML
    private Label demande_time_ar;
    @FXML
    private AnchorPane main_demande_ar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Date d = new Date();
        SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd");
        demande_date_ar.setText(s.format(d));
        Date t = new Date();
        SimpleDateFormat r= new SimpleDateFormat("ss:mm:hh");
        demande_time_ar.setText(r.format(d));
        
        String num_card = FXMLDocumentController.num_cart;
        demande_n_carte_ar.setText(FXMLDocumentController.num_cart);
        try{
        Connection cnx = connecterDB();
        Statement st;
             ResultSet rst;
            st=cnx.createStatement();
            rst=st.executeQuery("select balance from compte where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ");
            while(rst.next()){
            demande_valeur_ar.setText(" "+rst.getInt("balance")+"دينار   ");
            }
            // TODO
    }   catch (SQLException ex) {    
            Logger.getLogger(FXML_demande_frController.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        
    
}
        // TODO

    @FXML
    private void retour_demande_ar(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_menu_principale_ar.fxml"));
        main_demande_ar.getChildren().setAll(root);
    }
}    
    

