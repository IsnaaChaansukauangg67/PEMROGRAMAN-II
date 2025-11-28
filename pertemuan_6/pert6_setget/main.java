/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6_setget;

/**
 *
 * @author isna
 */
public class main {
    public static void main(String[] args) {
        InputAbsen absen = new InputAbsen();
        dataUser user = new dataUser();
        
         absen.login("dwi","k980l", user);
         
         
            user.SetUsername("reni45");
            user.SetPassword("e2345adt");
        
        
          absen.login("dwi", "k980l", user);
          
          absen.login("reni45", "e2345adt", user);
        
        
    }
  
}
