package pert2_object;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isna
 */
class BarangToko {
   int hitungAset(int[]harga, int[]stok){
       int total = 0;
       for (int i=0; i< harga.length; i++){
           total += harga [i]*stok[i];
       }
       return total;
   } 
   //Barang harga tertinggi
    int barangTermahal(int[]harga){
        int max = harga[0];
        for (int h : harga){
            if(h>max)max =h;
        }
        return max;
    }
    int barangTermurah (int []harga){
        int min = harga [0];
        for (int h : harga){
            if(h<min)min=h;
        }
        return min;
    }  
   
   
}
