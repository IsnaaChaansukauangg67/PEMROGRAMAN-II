/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert6_setget;

/**
 *
 * @author isna
 */
public class InputAbsen {
    void login(String id_absen, String password, dataUser user){
        System.out.println("========================================");
        System.out.println("                LOGIN RESULT            ");
        System.out.println("========================================");
        
        if(id_absen.equals(user.GetUsername())&& password.equals(user.GetPassword())){
            
            System.out.println("Username: "+user.GetUsername());
            System.out.println("Password: "+user.GetPassword()+"\n");
            System.out.println("           STATUS               ");
            System.out.println("    LOG IN SUCCESSFULLY >_<     ");
            System.out.println("Change your password for safe :)");
        }else {
            System.out.println("           STATUS               ");
            System.out.println("LOG IN FAILED! TRY AGAIN!!");
            System.out.println("Username: "+user.GetUsername());
            System.out.println("Password: "+user.GetPassword());
            System.out.println("---------------------------");
            
            System.out.println("    CORRECT DATA    ");
            System.out.println("=> Username: "+user.GetUsername());
            System.out.println("=> Password: "+user.GetPassword());
        }
        System.out.println("-----------------------\n");
    }
 }

