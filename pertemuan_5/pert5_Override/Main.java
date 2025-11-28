/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert5_Override;

/**
 *
 * @author isna
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===SISTEM INPUT BARANG TOKO===");
        System.out.println("1. Barang Biasa");
        System.out.println("2. Barang Diskon");
        System.out.println("3. Barang Grosir");
        System.out.println("4. Barang Import");
        System.out.print("Input Barang (1-4): ");
        
       int jenis = input.nextInt();
            input.nextLine();
            
        Barang barang;
        
        switch (jenis){
            case 2 -> barang = new BarangDiskon();
            case 3 -> barang = new BarangImport();
            case 4 -> barang = new BarangGrosir();
            default -> barang = new Barang();
        }
        
        System.out.print("Nama barang: ");
        barang.nama = input.nextLine();
        
        System.out.print("Harga barang: ");
        barang.harga = input.nextDouble();
        
        if (barang instanceof BarangDiskon){
            System.out.print("Diskon (0,2 = 20%): ");
            ((BarangDiskon)barang).diskon = input.nextDouble();
        }
        else if (barang instanceof BarangImport){
            System.out.print("Pajak (0,2=20%): ");
            ((BarangImport)barang).pajak = input.nextDouble();
        }
        else if (barang instanceof BarangGrosir){
            System.out.print("Jumlah beli: ");
            ((BarangGrosir)barang).jumlah = input.nextInt();
        }
        barang.hitungHargaAkhir();
        
        System.out.println("\n===INFORMASI BARANG===");
        System.out.println("Nama Barang : "+barang.nama);
        System.out.println("Harga Awal  : "+barang.harga);
        System.out.println("Harga Akhir : "+barang.hitungHargaAkhir());
        
        input.close();
    }
}
