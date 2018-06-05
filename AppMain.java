import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utild.ConnectionUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class AppMain {
    public static int curTrx, curQty;
    public static Connection conn;
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        conn = ConnectionUtils.getConnection();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanUtama().setVisible(true);
            }
        });
    }
}
