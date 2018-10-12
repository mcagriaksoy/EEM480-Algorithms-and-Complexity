/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders;

import java.util.Scanner;

/**
 *
 * @author Mehmet
 */


public class Student {
    private String Name;
    private String Surname;
    private int Year;
  
    
    private void read_name(){
        System.out.println("İsim giriniz:");
        Scanner mysc = new Scanner(System.in);
        Name = mysc.nextLine();
    }
    private void read_surname(){
        System.out.println("Soyisim Giriniz:");
        Scanner mysc = new Scanner(System.in);
        Surname = mysc.nextLine();
    }
    private void read_year(){
        System.out.println("Yıl Giriniz:");
        Scanner mysc = new Scanner(System.in);
        Year = mysc.nextInt();
   
    }
    public void write_data(){
        
        System.out.println(Name+" "+Surname+"\n"+Year);
        
    }
    public void read_data(){
        read_name();
        read_surname();
        read_year();
    }
    
    
    
   
    
}
