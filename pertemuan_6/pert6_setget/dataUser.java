/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6_setget;

/**
 *
 * @author isna
 */
class dataUser {
   private String idAbsen;
   private String password;
   
   public void SetUsername (String idAbsen){
       this.idAbsen = idAbsen; 
   }
   public void SetPassword (String password){
       this.password = password;
   }
   public String GetUsername(){
       return this.idAbsen;
   }
   public String GetPassword(){
       return this.password;
   }
}
