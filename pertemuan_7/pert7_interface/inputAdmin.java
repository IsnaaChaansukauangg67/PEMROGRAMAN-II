/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert7_interface;

/**
 *
 * @author isna
 */
public class inputAdmin {
    private  Produk produk;
    
    public inputAdmin(Produk produk){
        this.produk = produk;
    }
    
    void LihatNamaProduk(){
        this.produk.namaProduk();
    }
    void LihatCekHarga(){
        this.produk.cekHarga();
    }
    void BeriKodeDisc(){
        this.produk.kodeDisc();
    }
    void HapusKodeDisc(){
        this.produk.hapusDisc();
    }
}
