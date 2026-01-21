/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert9_mysql;



import java.sql.Connection; //koneksi bukan .mysql.jdbc. krn
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author isna
 */
public class koneksi {
    Connection con=null; //object from library
    public void koneksi()
    {
        try
        {   //EXCEPTION handling
            String connectionURL = "jdbc:mysql://localhost:3306/mahasiswa";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(connectionURL, username, password); //koneksi ke mysql
           JOptionPane.showMessageDialog(null, "Sukses Koneksi");
        }catch(Exception e) //error
        { 
        JOptionPane.showMessageDialog(null, e);
        System.exit(0);
        }
}
    public static void main(String[] args) {
        koneksi connect = new koneksi();
        connect.koneksi();
    }

}
