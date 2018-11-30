package recitation_december;

import java.util.Iterator;
/**
 *
 * @author Mehmet Çağrı Aksoy
 * 
 */
public class Database implements Iterable{
    
    public static Student [] stu = new Student[40];
    public static int sira = 0 ;
    @Override
    public Iterator iterator() {
        return new MyIterator(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Add( Student incomingData){
        stu[sira++]= incomingData;
    }
    
    public Student FindMax(){
        
      Student st = stu[0];
      Student dummy;
      Iterator it = new MyIterator();
      while(it.hasNext()) {
          dummy = (Student) it.next();
          if (st.compareTo(dummy) > 0)
          st = dummy;
      }
      return st;
    }
    
    public static final class MyIterator implements Iterator{
                
        public static int count = 0;

        @Override
        public boolean hasNext() {
            
            return (stu[count] != null) ;  
        }
        
        @Override
        public Student next() {
            return stu[count++];
         }
        
            

    }
  
}