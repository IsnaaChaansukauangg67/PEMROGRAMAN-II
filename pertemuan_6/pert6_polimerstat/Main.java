/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6_polimerstat;

/**
 *
 * @author isna
 */
public class Main {
     public static void main(String[] args) {
        BarangToko barang = new BarangToko();
        
        //memanggil method Overloading
        barang.tambahBarang("Buku", 300);
        barang.tambahBarang("Tipex",200,3);
        barang.tambahBarang("Penghapus", 700, "ATK");
    }
}
