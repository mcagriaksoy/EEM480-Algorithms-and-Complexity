/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recitation_december;

/**
 *
 * @author Mehmet Çağrı Aksoy
 */
public class Recitation_December {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student NewStudent;
        Database dB = new Database();
        
        NewStudent = new Student ("Ali", "Hüseyin",523123123);
        dB.Add(NewStudent);
        
        NewStudent = new Student ("Veli",   "Veli",   923999993);
        dB.Add(NewStudent);
        
        NewStudent = new Student ("Zehra","Cagri",  100001101);
        dB.Add(NewStudent);
        
        System.out.println(dB.FindMax().name);
        
    }
    
}
