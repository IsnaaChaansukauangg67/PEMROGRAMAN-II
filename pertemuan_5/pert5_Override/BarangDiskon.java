/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert5_Override;

/**
 *
 * @author isna
 */
public class BarangDiskon extends Barang {
    double diskon; //0.10 = 10%
    
    @Override
    double hitungHargaAkhir(){
        return harga - (harga*diskon);
        
    }
    
}
