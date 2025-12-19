/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert8_poldinms;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 *
 * @author isna
 */
public class mainMall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mall> daftarBelanja = new ArrayList<>();
        double totalKeseluruhan; 
        
        int pilih;
        do{
            System.out.println("===MENU BELANJA===");
            System.out.println("1. Tambah Elektronik");
            System.out.println("2. Tambah Pakaian");
            System.out.println("3. Tambah Makanan");
            System.out.println("4. Tampilkan Total Belanja");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu: ");
            pilih = input.nextInt();
         
            
            if (pilih >= 1 && pilih <= 3){
                System.out.println("Nama produk: ");
                input.nextLine();
                String nama = input.nextLine();
                
                System.out.println("Harga: ");
                double harga = input.nextDouble();
                
                System.out.println("Jumlah: ");
                int jumlah = input.nextInt();
                
                Mall p = null;                
                //polimorfisme dinamis
                switch (pilih) {
                    case 1 -> p = new Elektronik(nama, harga, jumlah);
                    case 2 -> p = new Pakaian(nama, harga, jumlah);
                    case 3 -> p = new Makanan(nama, harga, jumlah);
                }
               daftarBelanja.add(p);
                System.out.println("Produk berhasil ditambahkan!\n");
            }
          
             if (pilih == 4){
                totalKeseluruhan = 0;
                
                System.out.println("===Detail Belanja===");
                for (Mall item : daftarBelanja){
                    item.Invoice();
                System.out.println("Total Produk:Rp "+ item.hitungTotal());
                System.out.println("---------------------");
                
                totalKeseluruhan += item.hitungTotal();
                }
            System.out.println("TOTAL KESELURUHAN: Rp "+ totalKeseluruhan);
            }
        }while (pilih != 5);
    
        System.out.println("\nTerima kasih sudah berbelanja!");
    }
        } 