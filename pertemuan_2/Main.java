package pert2_object;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isna
 */
import pert2_object.BarangToko;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BarangToko toko = new BarangToko();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        String[]nama = new String[jumlah];
        int[] harga = new int[jumlah];
        int[] stok = new int[jumlah];
        
        
        //input barang
         for (int i = 0; i < jumlah; i++) {
            System.out.println("\nBarang ke-" + (i + 1));
            System.out.print("Nama Barang : ");
            nama[i] = input.nextLine();

            System.out.print("Harga (Rp)  : ");
            harga[i] = input.nextInt();

            System.out.print("Stok        : ");
            stok[i] = input.nextInt();
            input.nextLine();
        }
         //tampilan data
        System.out.println("\n=== DAFTAR BARANG TOKO ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + nama[i] +
                    " | Harga: Rp" + harga[i] +
                    " | Stok: " + stok[i]);
        }

        int totalAset = toko.hitungAset(harga, stok);
        int barangTermahal = toko.barangTermahal(harga);
        int barangTermurah = toko.barangTermurah(harga);

        System.out.println("\n=== RINGKASAN TOKO ===");
        System.out.println("Total nilai aset       : Rp" + totalAset);
        System.out.println("Harga barang termahal  : Rp" + barangTermahal);
        System.out.println("Harga barang termurah  : Rp" + barangTermurah);

        input.close();
          
    }
}
