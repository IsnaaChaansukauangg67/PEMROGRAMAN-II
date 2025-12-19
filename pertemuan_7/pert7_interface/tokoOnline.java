/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert7_interface;


import java.util.Scanner;

/**
 *
 * @author isna
 */
public class tokoOnline implements Produk {
    Scanner input = new Scanner(System.in);
    
    private String nama;
    private int harga;
    private hargaDiskon diskon;
    private boolean isNamaProduk = false;
  
    
   

        public tokoOnline(){ //konstruktor
            this.nama = "";
            this.harga = 0;
            this.diskon = null;
            this.isNamaProduk = false ;
            
}
         
         public void inputProduk(){
            
            System.out.print("Nama Produk: ");
            this.nama = input.nextLine();              //membaca string
            
            System.out.print("Harga Produk:Rp ");
            this.harga = input.nextInt();              //membaca integer
            input.nextLine(); //clear buffer agar input berikutnya tdk lompat
            
            //buat objek diskon berdasar harga produk
            this.diskon = new hargaDiskon(this.harga);
            
            this.isNamaProduk = true;               //produk sudah input
            System.out.println("Product added");                          
        }
        
    @Override
    public void namaProduk() {
       if (isNamaProduk){
        System.out.println("Nama Produk: "+nama); 
    }else{
        System.out.println("Belum ada produk dilist");
       }
    }
    
    @Override
    public void cekHarga() {
          if (isNamaProduk){
               System.out.println("Harga Produk:Rp "+this.harga); 
               
               if (diskon.getHargaAfterDisc()!=harga){
                   System.out.println("Harga Diskon:Rp "+diskon.getHargaAfterDisc());
               }
         }else{
           System.out.println("Belum ada produk dilist");
       }
    }

    public void kodeDisc(int persen) {
        if (!isNamaProduk){
            System.out.println("Belum ada produk dilist");
            return;
        }
        diskon.setDisc(persen);
        
        System.out.println("Diskon "+ persen + "%diterapkan!");
        System.out.println("Harga setelah diskon:Rp "+diskon.getHargaAfterDisc());
        
    }
            /*(isNamaProduk){
            diskon.setDisc(20); //diskon 20%
        System.out.println("Mid Year Sale!!");
        System.out.println("kode voucher: 12.12.FORYOU");
        
     
        System.out.println("Harga Produk:Rp "+hargaDiskon);
            System.out.println("Voucher dilist");
        }else{
           System.out.println("Belum ada produk dilist");
       } */  
    

    @Override
     public void hapusDisc() {
        if(isNamaProduk){
            System.out.println("Product haven't voucher");
            return;
        }
        diskon = new hargaDiskon(harga);
        
           System.out.println("Discond cleared. Price normal: "+ harga);       
        }

    @Override
    public void kodeDisc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
    }
    
