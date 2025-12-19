/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert8_poldinms;

/**
 *
 * @author isna
 */
class Pakaian extends Mall {
    public Pakaian (String nama, double harga, int jumlah){
            super(nama, harga, jumlah);
    }
    
    @Override
    public void Invoice(){
        System.out.println("Pakaian"+ nama + "x" + jumlah + " =Rp "+ hitungTotal());
    }
    
}
