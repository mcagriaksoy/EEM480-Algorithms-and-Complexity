
package Mehmet_Cagri_Aksoy_HW2;

/**
 *
 * @author Mehmet Çağrı Aksoy
 */
public class Node {
    public String Name;
    public String Type;
    public String Value;
    public Integer Count;
    public Node next;
    
        public Node(){
        }
        
        public Node(String n, String t, String v, Integer c){
            this.Name = n;
            this.Type = t;
            this.Value = v;
            this.Count = c;
            
            
        }

    
}