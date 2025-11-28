/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6_constructor;

/**
 *
 * @author isna
 */
public class Main {
    public static void main(String[] args) {
        BarangToko b1 = new BarangToko("BT023", "Pulpen", 5000, 24);
        BarangToko b2 = new BarangToko("BT067", "Pensil", 9000, 90);
       
        
        
        b1.tampilanInfo();
        System.out.println();
        b2.tampilanInfo();
        System.out.println();
    }
}
