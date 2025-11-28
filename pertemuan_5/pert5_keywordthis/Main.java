/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert5_keywordthis;

/**
 *
 * @author isna
 */
public class Main {
    
    public static void main(String[] args){
        keretaApi KAI = new keretaApi("Bangunkarta","Argo",932);
        keretaApi Bandara = new keretaApi("Kualanamu","Bandara",523);
        
        System.out.println("=====DATA KERETA=====");
        KAI.tampilanInfo();
        
        System.out.println("=====DATA KERETA=====");
        Bandara.tampilanInfo();
    }
}
/*

# 🚆 **DAFTAR NAMA KERETA API DI INDONESIA**


## ⭐ **1. Kereta Kelas Eksekutif (Argo & Premium)**

Ini kereta premium/eksekutif, biasanya cepat dan nyaman.

* Argo Bromo Anggrek
* Argo Wilis
* Argo Lawu
* Argo Dwipangga
* Argo Parahyangan
* Argo Sindoro
* Argo Muria
* Bima
* Sembrani
* Gajayana
* Taksaka
* Turangga
* Gumarang (campuran)
* Bangunkarta
* Sancaka Utara

---

## ⭐ **2. Kereta Kelas Ekonomi / Campuran (Eksekutif–Ekonomi)**

Sering digunakan penumpang jarak jauh dengan harga terjangkau.

* Matarmaja
* Brantas
* Singasari
* Majapahit
* Jayabaya
* Kertajaya
* Bogowonto
* Gaya Baru Malam Selatan
* Kahuripan
* Progo
* Bengawan
* Logawa
* Pasundan
* Serayu
* Sri Tanjung
* Kutojaya Utara
* Kutojaya Selatan

---

## ⭐ **3. Kereta Khusus / Bisnis / Wisata**

Kereta dengan konsep khusus, rute tertentu, atau untuk wisata.

* Prameks (Prambanan Ekspres)
* Sri Wedari
* Joglosemarkerto
* Pandanwangi
* Siliwangi
* Tawang Jaya / Tawang Jaya Premium
* Sawunggalih
* Fajar Utama
* Senja Utama

---

## ⭐ **4. Kereta Bandara**

Untuk akses bandara.

* Railink Kualanamu
* Railink Soekarno–Hatta
* KA Bandara Yogyakarta
* KA Bandara Minangkabau

---

## ⭐ **5. KRL / Commuter Line (Jabodetabek & Jawa)**

Kereta listrik perkotaan.

* KRL Commuter Line Jabodetabek
* KRL Yogyakarta–Solo
* KRL Bandung (uji coba)

---

## ⭐ **6. LRT & MRT (Kereta modern perkotaan)**

* MRT Jakarta
* LRT Jabodebek
* LRT Palembang
*/