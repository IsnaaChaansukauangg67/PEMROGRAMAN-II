/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert4_inheritance;

/**
 *
 * @author isna
 */
public class main {
    public static void main(String[] args) {
     Enemy monster = new Enemy();
     zombie Zemy = new zombie();
     pocong Lupi = new pocong();
     burung Beo = new burung();
     
    monster.name ="Buto";
    monster.hp=100;
    monster.attackPoint =75;
    System.out.println(monster.name + " ," + monster.hp + " ," + monster.attackPoint+ "\nMove: ");
    monster.attack(); 
    System.out.println("--------------------------------");
        
    Zemy.name="Zemy";
    Zemy.hp=100;
    Zemy.attackPoint=35;
    System.out.println(Zemy.name+" ," +Zemy.hp+" ," +Zemy.attackPoint+" ," +"\nMove: ");
    Zemy.attack();
    Zemy.walk();
    
    System.out.println("--------------------------------");
    
    Lupi.name ="Lupi";
    Lupi.hp=100;
    Lupi.attackPoint =35;
    System.out.println(Lupi.name + " ," + Lupi.hp + " ," + Lupi.attackPoint + "\nMove: ");
    Lupi.attack();
    Lupi.jump();
    
    System.out.println("--------------------------------");
    
    Beo.name ="Beo";
    Beo.hp=100;
    Beo.attackPoint=20;
    System.out.println (Beo.name + " ," + Beo.hp + " ," + Beo.attackPoint + "\nMove: ");
    Beo.attack();
    Beo.fly();
    Beo.jump();
    Beo.walk();
    System.out.println("--------------------------------");
}
}