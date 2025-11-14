/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pert2_pengumpulan; //package

/**
 *
 * @author isna
 */
public class Pasien1 { //kelas
    private final String name; //atribute
    private final int bed;
    private final String room;
    private final String condition;
        
        
        
        
        //konstruktor
    public Pasien1(String name,int bed, String room, String condition){
        this.name = name;
        this.bed = bed;
        this.room = room;
        this.condition = condition;
    }
    
    
    
    public void daftarPasien(){
        System.out.println("NAME        :" + name);
        System.out.println("NO. BED     :" + bed);
        System.out.println("LOC.ROOM    :" + room);
        System.out.println("KONDISI     :" + condition);
    }
    }
            

