/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author Sahani
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Statement getStatement() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS", "root", "");
            Statement stat = con.createStatement();
            return stat;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
   /* public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS", "root", "");
            Statement stat=con.createStatement();
            return stat;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/

}
