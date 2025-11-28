/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6_constructor;

/**
 *
 * @author isna
 */
import java.text.NumberFormat;
import java.util.Locale;

public class BarangToko {
    String kode;
    String nama;
    double harga;
    int stok;
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("id","ID")); 
    
    //konstruktor
    public BarangToko(String kode, String nama, double harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok =stok;
    }
    
    public void tampilanInfo(){
        System.out.println("Kode barang     :"+kode);
        System.out.println("Nama barang     :"+nama);
        System.out.println("Harga barang    :Rp"+ nf.format(harga));
        System.out.println("Stok tersedia   : "+stok);
    }
   
}
