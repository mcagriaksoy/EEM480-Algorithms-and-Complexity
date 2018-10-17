
package mehmet_cagri_aksoy_hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Mehmet Mehmet Çağrı Aksoy
 */

public class Student {
    public int Age ;
    public long ID ;
    public int admYear;
    public String name;
    public String surname;
 
    public static int arrsize;
    private Scanner readCodes;
   
    //I also divided my database into different types.
    //As you see;
    public static long[] idarr = new long[40];
    public static int[]  agearr = new int[40];
    public static int[]  admarr = new int[40];
    public static String[]  namearr = new String[40];
    public static String[]  surarr = new String[40];
    //After that reading data from database can be seen on below:
    public void read_data(){

       	try {
            System.out.println("Enter Database's file Location (PATH of File):");
            Scanner scanner = new Scanner(System.in); //I used scanner func. to get path from keyboard.
            String DOSYA = scanner.nextLine();
            File file = new File(DOSYA); 
            readCodes = new Scanner(file); //File scanner code.
            System.out.println("File Opened!");

	} catch (FileNotFoundException e) {
            System.out.println("Could not locate the data file!");
            read_data(); 
            //In this line function called itself (recursive one)
            //Because we prob. enter wrong location of file, program wants true location.
	}
    }
    public void readCodesFile(){
        
        arrsize = readCodes.nextInt(); //It get first integer value of database
        
        int count=0;
            System.out.println("Here! It's our Database File:");
            while (readCodes.hasNext()){
            String t0 =  readCodes.next();
            long ID = Long.parseLong(t0.trim());
            //In these lines, I read data and convert them to their types.
            // for ex: String id to long id,
            //to convert them, I have used .parse"type" function.
            String name = readCodes.next();
            String surname = readCodes.next();
            String t1 = readCodes.next();
            int Age = Integer.parseInt(t1.trim());
            String t2 = readCodes.next();
            int admYear =  Integer.parseInt(t2.trim());
            
            //After that I printed our database and;
            System.out.println(ID+" "+name+" "+surname+" "+Age+" "+admYear);
            //Put my values in the array:
            namearr[count]=name;
            surarr[count]=surname;
            idarr[count]=ID;
            agearr[count]=Age;
            admarr[count]=admYear;
            count++; 
            }       
    }
    public void closeCodesFile() {
	readCodes.close();
}
   
}   
       
       
    
     

