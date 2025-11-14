package Pert2_pengumpulan;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isna
 */
public class sistemNilai {
    public static void main(String[] args) {
         // Meminta jumlah siswa
        try ( // Membuat Scanner untuk menerima input dari pengguna
                Scanner scanner = new Scanner(System.in)) {
            // Meminta jumlah siswa
            System.out.print("Masukkan jumlah siswa: ");
            int jumlahSiswa = scanner.nextInt();
            scanner.nextLine();  // Menangani newline setelah nextInt()
            // Membuat array untuk menyimpan nama dan nilai siswa
            String[] namaSiswa = new String[jumlahSiswa];
            double[] nilaiSiswa = new double[jumlahSiswa];
            // Input data siswa
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
                namaSiswa[i] = scanner.nextLine();
                System.out.print("Masukkan nilai untuk " + namaSiswa[i] + ": ");
                nilaiSiswa[i] = scanner.nextDouble();
                scanner.nextLine();  // Menangani newline setelah nextDouble()
            }   // Menghitung rata-rata nilai
            double totalNilai = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalNilai += nilaiSiswa[i];
            }   double rataRata = totalNilai / jumlahSiswa;
            // Menampilkan siswa yang memiliki nilai di atas rata-rata
            System.out.println("\nSiswa dengan nilai di atas rata-rata (" + rataRata + "):");
            boolean adaSiswaDiAtasRataRata = false;
            for (int i = 0; i < jumlahSiswa; i++) {
                if (nilaiSiswa[i] > rataRata) {
                    System.out.println(namaSiswa[i] + " dengan nilai: " + nilaiSiswa[i]);
                    adaSiswaDiAtasRataRata = true;
                }
            }   // Jika tidak ada siswa yang nilai di atas rata-rata
            if (!adaSiswaDiAtasRataRata) {
                System.out.println("Tidak ada siswa yang memiliki nilai di atas rata-rata.");
            }
            // Menutup scanner
        }
    }
}
