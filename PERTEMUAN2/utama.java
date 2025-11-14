/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pert2_pengumpulan;

/**
 *
 * @author isna
 */
public class utama {
    public static void main(String[] args) {
        mahasiswa M1= new mahasiswa("2455533342","Adi","Ilmu Komunikasi",3.71); //M1 adl objek class dr mahasiswa
        mahasiswa M2= new mahasiswa("2455533365","Dika","Teknik Mesin",3.25);
        
        M1.tampilData(M1.NIM, M1.nama,M1.prodi, M1.IPK);
        M1.updateIPK(4.0);
        System.out.println("IPK Terbaru: "+M1.IPK);
        M1.CekSPP(true);
        M1.tampilkanStatus();
       
        M2.tampilData(M2.NIM, M2.nama,M2.prodi, M2.IPK);
        M2.updateIPK(3.50);
        System.out.println("IPK Terbaru: "+M2.IPK);
        M2.CekSPP(false);
        M2.tampilkanStatus();
        
       
        
        // System.out.println("Predikat yang diperolah: "+M1.predikat);
        //System.out.println("Predikat yang diperoleh    : "+ M2.predikat);
        // M1.tampilData(M1.NIM, M1.nama,M1.prodi, M1.IPK);  //M2.tampilData(M2.NIM, M2.nama, M2.prodi,M2.IPK);
        //M2.Predikat(M2.IPK);
         
    }

   
}
