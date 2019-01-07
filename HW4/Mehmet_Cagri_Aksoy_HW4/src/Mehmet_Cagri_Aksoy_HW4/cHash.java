/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mehmet_Cagri_Aksoy_HW4;

import java.io.BufferedReader;
import java.util.*;
import java.io.*;

/**
 *
 * @author Mehmet Çağrı Aksoy
 */

public class cHash implements HW4_Interface{

    Hashtable dictionary = new Hashtable();
    private Scanner readCodes;
    public int size;
    int size_table;
    Integer val;
    
    
    @Override
    public void  BuildHash(String filename, int size) {
        HashTableLList hll = new HashTableLList(size);
        size_table = size;
        hll.size = size_table;
        try{
            BufferedReader readCodes = new BufferedReader(new FileReader(filename));
            //Pattern pattern = Pattern.compile("\\s+");
            String line = null;
            while((line = readCodes.readLine()) != null) {
                String[] words = line.split("\\s+");
                if(line.equals(""))
                    continue;
                for(String word: words) {
                    word = word.replace(".", ""); // Remove any commas and dots.
                    word = word.replace(",", "");                    
                    if(dictionary.containsKey(word)) {
                        val = (Integer) dictionary.get(word);
                        dictionary.put(word, val + 1);
                        hll.insert(word, val+1);
                    }else
                        dictionary.put(word, 1);
                        hll.insert(word, 1);
                    }  
                }
            
            //hll.printHashTable();
            readCodes.close(); 
             
        } catch (FileNotFoundException e) {
		System.out.println("Unable to open the file");
	}
	catch(IOException e) {
		System.out.println("Unable to open the file");
        }
        
    }
    @Override
    public long ConvertInt(String mystring) {
        return (long) mystring.hashCode();
    }
    @Override
    public int FindHash(long myvalue) {
       myvalue %=  size_table; 
       if (myvalue < 0)
            myvalue += size_table;
       return (int)myvalue;      
    }
    @Override
    public void InsertHash(String mystring) {
        HashTableLList hll = new HashTableLList(size);
        int tmp = FindHash(ConvertInt(mystring));
                hll.add(mystring, tmp); 
    }
    @Override
    public void Display(String Outputfile) {
        try (PrintStream out = new PrintStream(new FileOutputStream(Outputfile))){
            
            for(Object key: dictionary.keySet()){
                
                out.println(key + ": " + dictionary.get(key));
                //System.out.println(key + ": " + dictionary.get(key));
            }
        }catch (Exception e){
        }  
    }
    @Override
    public int NumofWord(String myword) {
        if (dictionary.containsKey(myword)){
            val=(Integer) dictionary.get(myword);
            return val;
        }else
            return -1;
    }
    @Override
    public String ShowMax() {
        HashTableLList hll = new HashTableLList();
        return hll.search(size);
        
    }
    @Override
    public int CheckWord(String myword) {
        if(dictionary.containsKey(myword)){
            return 0;
        }else
            return 1;
    }

}
