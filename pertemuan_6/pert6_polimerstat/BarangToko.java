/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6_polimerstat;

/**
 *
 * @author isna
 */
public class BarangToko {
    //Method Overloading
    public void tambahBarang (String nama, double harga){
        System.out.println("Barang:"+nama+ ",Harga:"+harga);
    }
    public void tambahBarang (String nama, double harga, int stok){
        System.out.println("Barang:"+nama+",Harga:"+harga+",Stok:"+stok);
    }
    public void tambahBarang (String nama, double harga, String kategori){
        System.out.println("Barang:"+nama+",Harga:"+harga+",Kategori:"+kategori);
    }
}
