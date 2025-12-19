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
public class main_produk {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        tokoOnline toko = new tokoOnline();
        
        int pilih;
        do{
            System.out.println("\n===Toko Online===");
            System.out.println("===== by CHAAN =====");
            System.out.println("1. Lihat Nama Produk");
            System.out.println("2. Cek Harga");
            System.out.println("3. Terapkan Diskon");
            System.out.println("4. Hapus Diskon");
            System.out.println("5. Produk Baru");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch(pilih){
                case 1:
                    toko.namaProduk();
                    break;
                case 2:
                    toko.cekHarga();
                    break;
                case 3:
                    System.out.println("Diskon sebesar: ");
                    int persen = sc.nextInt();
                    toko.kodeDisc(persen);
                    break;
                case 4:
                    toko.hapusDisc();
                    break;
                case 5:
                    toko.inputProduk();
                    break;
                case 6:
                System.out.println("Bye...");
                System.out.println("Wrong choice!");
            }
            
        }while (pilih !=6);
        
        sc.close();
    }
} 
