package recitation_december;
/**
 *
 * @author Mehmet Çağrı Aksoy
 */
public class Student implements Comparable<Student> {
           
    public String name;
    public String surname;
    public long ID ;
    
    public Student(String name,String surname, long ID){
        this.name = name;
        this.surname = surname;
        this.ID = ID;  
    }

    
    @Override
    public int compareTo(Student o) {
         return (o.name).compareTo(this.name);
    }

   
    
    
}
