/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert4_modifier;

/**
 *
 * @author isna
 */
public class utama1 {
    public static void main(String[] args) {
        mahasiswa1 M1= new mahasiswa1("2455533342","Adi","Ilmu Komunikasi",3.71); //M1 adl objek class dr mahasiswa
        
        M1.tampilData();
        M1.updateIPK(4.0);
        
        System.out.println("IPK Terbaru: "+ M1.IPK);
       
}}

