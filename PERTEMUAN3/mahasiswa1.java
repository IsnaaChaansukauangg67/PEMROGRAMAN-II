/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert4_modifier;

/*
 *
 * @author isna_chaan
 */
public class mahasiswa1 {
    public String NIM=" ";
    private String nama=" ";
    private String prodi=" ";
    double IPK  =0;
    private String predikat=" ";
    // private boolean cekSPP = false;
    
  //konstruktor adl method yg dibuat saat objek baru dibuat u/ menginisialisasi objek tersebut  
public mahasiswa1 (String NIM, String nama, String prodi, double IPK){
    this.NIM = NIM;
    this.nama= nama;
    this.prodi= prodi;
    this.IPK= IPK;
   
    
}
void tampilData(){
            System.out.println("NIM     : "+ NIM);
            System.out.println("nama    : "+ nama);
            System.out.println("prodi   : "+ prodi);
            System.out.println("IPK     : "+ IPK);
            System.out.println("Predikat yang diperoleh: "+ Predikat(this.IPK));
 }   
private String Predikat(double IPK){
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
 }}
//modifier (tingkatan akses)-- class, method, variable
 //                         --public, private, protected, no modifier