/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseBaglanti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ConnectionYonetim {

    public static Connection connection;
   // String url = "jdbc:derby://localhost:1527/db;create=true;user=Administrator";

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = (Connection) DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Adalet.321");
                //connection = DriverManager.getConnection("jdbc:derby://localhost:1527/busenaz", "buse", "buse");
                connection.setAutoCommit(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    protected void closeConnection() {
        try {
            connection.rollback();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionYonetim.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    protected void close(PreparedStatement stmt, ResultSet rs) {
        close(rs);
        close(stmt);
        
    }

    private void close(ResultSet rs) {

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void close(PreparedStatement stmt) {

        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionYonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


/**
 *
 * @author GAMZE
 */

