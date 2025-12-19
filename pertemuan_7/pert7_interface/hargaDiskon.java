/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert7_interface;

/**
 *
 * @author isna
 */
class hargaDiskon {
    
    private int hargaNormal;
    private int hargaAfterDisc;
    private int persen;
   
    //konstruktor harga normal
    public hargaDiskon(int hargaNormal){
        
        this.hargaNormal = hargaNormal;
        this.hargaAfterDisc = hargaNormal;
    }
    // setter diskon dlm persen
    public void setDisc(int persen){
        this.persen = persen;
        hitungDisc();
    }
    //rumus disc
    private void hitungDisc(){
        hargaAfterDisc = (int) (hargaNormal - (hargaNormal *persen  / 100.0));
    }
    public int getHargaNormal(){
        return hargaNormal;
    }
    public int getHargaAfterDisc(){
        return hargaAfterDisc;
    }
    public int getPersen(){
        return persen;
    }
}
