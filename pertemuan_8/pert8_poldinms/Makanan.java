/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert8_poldinms;

/**
 *
 * @author isna
 */
class Makanan extends Mall {
    public Makanan(String nama, double harga, int jumlah){
        super(nama, harga, jumlah);
    }
     @Override
    public void Invoice(){
        System.out.println("Makanan "+ nama + "x" + jumlah + " =Rp "+ hitungTotal());
    }
}
