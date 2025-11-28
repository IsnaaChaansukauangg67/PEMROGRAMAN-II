/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert5_keywordthis;

/**
 *
 * @author isna
 */
public class keretaApi {
   private final String tipe;
   private final String kelas;
   private final int kode;
   
   public keretaApi(String tipe, String kelas,int kode){
       this.tipe = tipe;
       this.kelas=kelas;
       this.kode = kode;
   }
   
   public void tampilanInfo(){
       System.out.println("Nama Kereta  : "+tipe);
       System.out.println("Kelas Kereta : "+kelas);
       System.out.println("Kode Rute    : "+kode+"ind");
       System.out.println("--------------------");
   }
}
