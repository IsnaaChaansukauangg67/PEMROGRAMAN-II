/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert5_Override;

/**
 *
 * @author isna
 */
public class BarangImport extends Barang {
    double pajak; //0.15 = 15%
    
    @Override
    double hitungHargaAkhir(){
        return harga + (harga*pajak);
        
    }
    
}
