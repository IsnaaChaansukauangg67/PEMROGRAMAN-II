/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert8_poldinms;



/**
 *
 * @author isna
 */
public class Mall {
    protected String nama;
    protected double harga;
    protected int jumlah;
    
    
public Mall (String nama, double harga, int jumlah){
    this.nama = nama;
    this.harga = harga;
    this.jumlah = jumlah;
    
}
 public void Invoice (){
     System.out.println("Nama: "+ nama);
     System.out.println("Harga:Rp "+ harga);
     System.out.println("Jumlah: "+ jumlah);

 }
    //polimorfisme dinamis
 
 public double hitungTotal(){
     return harga*jumlah;
 }
}
