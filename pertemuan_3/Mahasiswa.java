/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert3_;

/**
 *
 * @author isna
 */
public class Mahasiswa {
    String NIM=" ";
    String nama=" ";
    String prodi=" ";
    double IPK  =0;
    String predikat=" ";
    boolean cekSPP = false;
    
  //konstruktor adl method yg dibuat saat objek baru dibuat u/ menginisialisasi objek tersebut  
public Mahasiswa (String NIM, String nama, String prodi, double IPK){
    this.NIM = NIM;
    this.nama= nama;
    this.prodi= prodi;
    this.IPK= IPK;
   
    
}
void tampilData(String NIM, String nama,String prodi, double IPK){
            System.out.println("=== CEK MAHASISWA  ===");
            System.out.println("NIM     : "+ NIM);
            System.out.println("nama    : "+ nama);
            System.out.println("prodi   : "+ prodi);
            System.out.println("IPK     : "+ IPK);
            System.out.println("Predikat yang diperoleh: "+ Predikat(this.IPK));
 }   
String Predikat(double IPK){
    if (IPK >=3.70){
        predikat= "Cumlaude";
    }else if (IPK >=3.50){
        predikat= "Sangat memuaskan";
    }else if (IPK >=3.00){
        predikat= "Memuaskan";
    }
    
        return predikat;
}
 void updateIPK (double IPK){ //method prosedur
    this.IPK = IPK;
 }

 void CekSPP (boolean SPP){
     this.cekSPP = SPP;
 }
 void tampilkanStatus(){
     if(this.cekSPP){
         System.out.println("Status pembayaran      : lunas");
     }else {
         System.out.println("Status pembayaran      : belum lunas");
     }
 }

    String predikat(double IPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
