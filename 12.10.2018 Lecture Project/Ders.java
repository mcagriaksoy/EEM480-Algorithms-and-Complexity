
package ders;

/**
 *
 * @author Mehmet Çağrı Aksoy
 */
public class Ders {

    public static void main(String[] args) {
        // TODO code application logic here
        Database mydb = new Database();
        
        
        for(int i=0; i<2;i++){
            Student mySt = new Student ();
            mySt.read_data();
            mydb.studentarray[i] = mySt;
            
        }
        for(int j=0 ; j<2 ; j++){
            mydb.studentarray[j].write_data(); 
        }
    } 
}
