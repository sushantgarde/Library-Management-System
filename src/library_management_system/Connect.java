/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HP
*/

public class Connect {
    static Connection con=null;
    public static Connection ConnectToDB() {
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3307/library_management_system","root","Sushant@01");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}


