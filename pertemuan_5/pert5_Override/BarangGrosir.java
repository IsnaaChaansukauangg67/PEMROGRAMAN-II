/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert5_Override;

/**
 *
 * @author isna
 */
public class BarangGrosir extends Barang {
    int jumlah;
    
    @Override
    double hitungHargaAkhir(){
        if (jumlah > 12){
            return (harga*jumlah)- 5000; //potongan tetap
        }
        return harga*jumlah;
    }
    
}
