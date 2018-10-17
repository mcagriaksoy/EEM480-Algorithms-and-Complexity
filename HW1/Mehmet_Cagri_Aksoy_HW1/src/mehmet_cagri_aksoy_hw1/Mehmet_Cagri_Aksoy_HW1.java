
package mehmet_cagri_aksoy_hw1;

import java.io.FileNotFoundException;


/**
 *
 * @author Mehmet Mehmet Çağrı Aksoy
 */
public class Mehmet_Cagri_Aksoy_HW1 {

    
    public static void main(String[] args) throws FileNotFoundException {
       StudentDbase sdb = new StudentDbase();
       Student stu = new Student();
       //Let's call our functions:
       //I have defined Student class as stu
       //Also StudentDbase class is defined as sdb

       stu.read_data();
       stu.readCodesFile();
       stu.closeCodesFile();
       
       sdb.sort_ID();
       sdb.sort_Age();
       sdb.sort_Year();
    }
    
}
