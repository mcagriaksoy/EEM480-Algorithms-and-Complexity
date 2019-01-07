package Mehmet_Cagri_Aksoy_HW4;

import java.io.FileOutputStream;
import java.io.PrintStream;

/* Node for singly linked list */
class SLLNode{
    
    SLLNode next;
    String data;
    int val;
 
    /* Constructor */
    public SLLNode(String x, int y){
        data = x;
        val = y;
        next = null;
    }
}

public class HashTableLList{
    public SLLNode[] table;
    public SLLNode nptr; 
    public int size ;
    String max = null;
    /* Constructor */
    cHash ch = new cHash();
    
   public HashTableLList(){
        
    }
    public HashTableLList(int size){
        table = new SLLNode[size]; 
    }
    
    public void insert(String key, int val){
        int pos = myhash(key);        
                       
        nptr = new SLLNode(key,val);
        if (table[pos] == null)
            table[pos] = nptr;            
        else{
            nptr.next = table[pos];
            table[pos] = nptr;
        }    
    }
    public void add(String key2, int int_hash){
        
        SLLNode nptr2 = new SLLNode(key2,1);        
        if (table[int_hash] == null){
            table[int_hash] = nptr2;            
        }else{  
            nptr2.next = table[int_hash];
            table[int_hash] = nptr2;
        }    
    }

    public int myhash(String x ){
        
        int hashVal = x.hashCode( );
        hashVal %= table.length;
        if (hashVal < 0)
            hashVal += table.length;
        return hashVal;
    }
    public void sort_hash (String Outputfile) {
        try (PrintStream out = new PrintStream(new FileOutputStream(Outputfile))){

        }catch (Exception e){
        } 
    }
    public String search(int s) {
        for (int i = 0; i < s ; i++){
            SLLNode start = table[i];
            while(start.next != null){ 
                if(start.val > start.next.val){
                    max=start.data;
                }else{
                    max=start.next.data;
                }
                start = start.next;
            } 
        }
    return max;
    }
}