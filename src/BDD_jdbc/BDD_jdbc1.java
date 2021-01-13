/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD_jdbc;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import jfxml_atm.FXMLDocumentController;
import jfxml_atm.FXML_demande_frController;

public class BDD_jdbc1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    try{
        Connection cnx = connecterDB();
        Statement st;
             ResultSet rst;
            st=cnx.createStatement();
            rst=st.executeQuery("select prenom from client where num_carte="+123456789+"");
            while(rst.next()){
                System.out.println(rst.getString("prenom"));
            }     
    }catch(Exception e){
          e.printStackTrace();
        
    }
        // TODO
    
    }    
    

    public static Connection connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver oki");
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gab","root","");
            System.out.println("connection faitt");
            Statement state = cnx.createStatement();
            
            
            
            
            return cnx;
            
    }catch(Exception e){
          e.printStackTrace();
        return null;
    }
        
    
    }
    
    

    
    public static boolean verify_account(String num_card) throws SQLException{
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="SELECT * FROM carte WHERE Num_carte ='"+num_card+"'";
            stm.executeQuery(str);
            while(stm.getResultSet().next()){
                return true;
            }
        }
        return false ;
    }
    public static boolean verify_PIN(String num_card,String pass) throws SQLException{
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="SELECT * FROM carte WHERE Num_carte ='"+num_card+"' and PIN='"+pass+"'";
            stm.executeQuery(str);
            while(stm.getResultSet().next()){
                System.out.println("compte_id");
                return true;
            }
        }
        return false ;
    }
    public static void retrai10000(String num_card) throws SQLException{
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="update compte set balance = balance - 10000 where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ";
            stm.execute(str);
            
        }
    }
    public static void retrai2000(String num_card) throws SQLException{
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="update compte set balance = balance - 2000 where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ";
            stm.execute(str);
            
        }
    }
    public static void retrai1000(String num_card) throws SQLException{
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="update compte set balance = balance - 1000 where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ";
            stm.execute(str);
            
    
               
       }
            
        
    }
    public static void retrai5000(String num_card) throws SQLException{
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="update compte set balance = balance - 5000 where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ";
            stm.execute(str);
            
        }
    }
    public static void valeur_RBDD(String num_card,String valeur_retrai,String Num_compte_fr) throws SQLException{
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="update compte set balance = balance - '"+valeur_retrai+"' where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ";
            stm.execute(str);
            
        }
        try (Connection cnx = connecterDB()) {
            Statement stm=cnx.createStatement();
            String str="update compte set balance = balance +'"+valeur_retrai+"' where compte_id in (select compte_id from client where client.num_carte=\""+Num_compte_fr+"\"); ";
            stm.execute(str);
            
        }
    }
    public static void  valeur_demande(String num_card) throws SQLException{
        try (Connection cnx = connecterDB()) {
            //rst=st.executeQuery
            Statement st;
             ResultSet rst;
            st=cnx.createStatement();
            rst=st.executeQuery("select balance from compte where compte_id in (select compte_id from client where client.num_carte=\""+num_card+"\"); ");
            while(rst.next()){
                System.out.println(rst.getInt("balance"));
            }
            
                
        }
    
    }

    
    
    
}

    
