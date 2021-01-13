/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_atm;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.CollationElementIterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class FXML_menu_principaleController implements Initializable {

    @FXML
    private Button retour_m_r;
    @FXML
    private AnchorPane main_menu_retrai;
    @FXML
    private Button Autre_fr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retrai10000(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai10000(FXMLDocumentController.num_cart);
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai10000.fxml"));
        main_menu_retrai.getChildren().setAll(root);
        
    }

    @FXML
    private void retrai5000(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai5000(FXMLDocumentController.num_cart);
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai5000.fxml"));
        main_menu_retrai.getChildren().setAll(root);
    }

    @FXML
    private void retrai2000(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai2000(FXMLDocumentController.num_cart);
    Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai2000.fxml"));
    main_menu_retrai.getChildren().setAll(root);
    }

    @FXML
    private void retour_m_r_fr(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        main_menu_retrai.getChildren().setAll(root);
    }

    @FXML
    private void retrai1000(ActionEvent event) throws SQLException, IOException {
        BDD_jdbc.BDD_jdbc1.retrai1000(FXMLDocumentController.num_cart);
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Retrai1000.fxml"));
        main_menu_retrai.getChildren().setAll(root);
        
        
    }
    @FXML
    private void autre_fr1(ActionEvent event) throws IOException {
         Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_autre_fr.fxml"));
         main_menu_retrai.getChildren().setAll(root);
        
    }

    @FXML
    private void demande_fr(ActionEvent event) throws IOException {
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXML_demande_fr.fxml"));
         main_menu_retrai.getChildren().setAll(root);
    }

    
    
}
