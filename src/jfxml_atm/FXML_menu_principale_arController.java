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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class FXML_menu_principale_arController implements Initializable {

    @FXML
    private Button retour_m_r_ar;
    @FXML
    private AnchorPane main_menu_retrai_ar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retrai10000_ar(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai10000(FXMLDocumentController.num_cart);
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai10000_ar.fxml"));
        main_menu_retrai_ar.getChildren().setAll(root);
    }

    @FXML
    private void retrai5000_ar(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai5000(FXMLDocumentController.num_cart);
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai5000_ar.fxml"));
        main_menu_retrai_ar.getChildren().setAll(root);
    }

    @FXML
    private void retrai2000_ar(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai2000(FXMLDocumentController.num_cart);
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai2000_ar.fxml"));
        main_menu_retrai_ar.getChildren().setAll(root);
    }

    @FXML
    private void retrai1000_ar(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai1000(FXMLDocumentController.num_cart);
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai1000_ar.fxml"));
        main_menu_retrai_ar.getChildren().setAll(root);
    }

    @FXML
    private void retour_m_r_ar(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_Document_arab.fxml"));
        main_menu_retrai_ar.getChildren().setAll(root);
    }

    @FXML
    private void autre_ar(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_autre_ar.fxml"));
        main_menu_retrai_ar.getChildren().setAll(root);
    }

    @FXML
    private void demande_ar(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_demande_ar.fxml"));
         main_menu_retrai_ar.getChildren().setAll(root);
    }
    
}
