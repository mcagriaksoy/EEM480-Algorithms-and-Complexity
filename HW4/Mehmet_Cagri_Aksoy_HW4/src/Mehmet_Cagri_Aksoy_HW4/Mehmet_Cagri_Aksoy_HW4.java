/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mehmet_Cagri_Aksoy_HW4;
import java.util.Scanner;
/**
 *
 * @author Mehmet Çağrı Aksoy
 */
public class Mehmet_Cagri_Aksoy_HW4 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String desired_word;
        String add_word;
        String filename;
        int size;

        cHash cHash = new cHash();
            
            System.out.println("Enter File Location (PATH of File):");
            Scanner scanner = new Scanner(System.in); //I used scanner func. to get path from keyboard.
            filename = scanner.nextLine();
            System.out.println("Enter the size of hash:");
            Scanner in = new Scanner(System.in);


            size = in.nextInt();
            cHash.BuildHash(filename, size);
            System.out.println("In background hashtable is saved your disk with (Output.txt) name...");
            cHash.Display("Output.txt");
            
            System.out.println("Enter the word that you want to search:");
            desired_word = scanner.nextLine();       
            System.out.println("Number of"+" '"+desired_word+"' "+" : "+cHash.NumofWord(desired_word));
            
            System.out.println("Enter the word that you want to ADD your hash table:");
            add_word = scanner.nextLine();  
            cHash.ConvertInt(add_word);
            System.out.println("The word is succesfully added..."); 
            
            System.out.println("The most repeated element in hashtable is:"); 
            System.out.println(cHash.ShowMax());

            
     
    }

}
