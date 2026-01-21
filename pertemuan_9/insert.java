/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert9_mysql;

//import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author isna
 */
public class insert {
    koneksi konek = new koneksi();
   

    public void insert(int nim, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + gender + "')";
              String sql = "insert into datamahasiswa values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
       
    }
    public static void main(String[] args) {
        insert tambah = new insert();
        tambah.insert(1013, "Isnaa Chaan", "Gandusari", "P");
        tambah.insert(1000, "Chaan", "Blitar", "P");
        tambah.insert(1100, "Hamid", "Sumber", "L");
    }
}
