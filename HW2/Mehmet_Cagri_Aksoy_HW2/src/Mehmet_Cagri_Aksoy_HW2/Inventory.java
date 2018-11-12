package Mehmet_Cagri_Aksoy_HW2;
/**
 *
 * @author Mehmet Çağrı Aksoy
 */

public class Inventory implements InventoryInterface { //I implemented Inventory interface
    Node current;
    Node head; //I have defined current and head nodes here.
     
    @Override
    public void addResistor(String val, Integer cnt) {
        //Add a node at the front: (We need to add resistor to first node
        //Later, it will be help us to print inventory for desired order.
        Node src = head;
        while(src.next != null){
            if(src.next.Value.equals(val)){
                int x = src.next.Count + cnt;
                Node tmp= new Node("Resistor:","res",val,x);
                tmp.next=src.next.next;
                src.next=tmp;
                return;
                
            }
            src=src.next;
        }
        current= new Node("Resistor:","res",val,cnt);
            current.next=head;
            head=current;
                                      
    }

    @Override
    public void addCapacitor(String val, String typ, Integer cnt) {
	//Add a node after resistor, before Inductor
        //This code block checks, node next name
        //if it is inductor, add capacitor here:
        if (head == null){
            current= new Node("Capacitor:",typ,val,cnt);
            current.next=head;
            head=current;
        }
        Node src = head;      
        while(src.next != null ){
            //If our capacitor value is equal to value that already listed cap.
            //x = previous cap count + cnt 
            if(src.next.Value.equals(val)){
                int x = src.next.Count + cnt;
                Node tmp= new Node("Capacitor:",typ,val,x);
                tmp.next=src.next.next;
                src.next=tmp;
                return;
            }
            if(("Transistor:").equals(src.next.Name)){
                Node tmp=new Node("Capacitor:",typ,val,cnt);
                tmp.next=src.next;
                src.next = tmp;
                return; 
            }
                src=src.next; 
        }     
    }
    
    @Override
    public void addInductor(String val, Integer cnt) {
        //Add a node before, transistor's nodes !
        Node src = head;
        if (head == null){
            current= new Node("Inductor:","ind",val,cnt);
            current.next=head;
            head=current;
            }
        while(src.next != null ){
            
            if(src.next.Value.equals(val)){
                int x = src.next.Count + cnt;
                Node tmp= new Node("Inductor:","ind",val,x);
                tmp.next=src.next.next;
                src.next=tmp;
                return;
            }
            if(("Transistor:").equals(src.next.Name)){
                Node tmp=new Node("Inductor:","ind",val,cnt);
                tmp.next=src.next;
                src.next = tmp;
                return;
            }
                src=src.next;
        }                 
        
    }

    @Override
    public void addTransistor(String typ, Integer cnt) {
         //It adds transistors to last node, cause we need to put
         //transistors last order.
         Node tmp2=new Node("Transistor:",typ,"-",cnt);       
         if (head == null) {
             head = new Node("Transistor:",typ,"-",cnt);
             return;
         }
         tmp2.next=null;
         Node last = head;
         while(last.next!=null){
             if(last.next.Type.equals(typ)){
//if there is a transistor with the same type added to the list, 
//it increases the number of old transistors instead of adding a new transistor.
                int x = last.next.Count + cnt;
                Node tmp= new Node("Transistor:",typ,"-",x);;
                tmp.next=last.next.next;
                last.next=tmp;
                return;
            }
             last=last.next;
         }
         last.next=tmp2;
    }  
    @Override
    //Deletion operations:
    
    public int deleteResistor(String val, Integer cnt) {       
        if(head==null) return -1; //If list is empty return -1
        current = head;
        //checks all nodes:
        while(current.next!=null){
             if((current.Value.equals(val))){
                 int x = current.Count-cnt;                 
                 if(x>0) return x;
                 //If current.Count-cnt >0 return our value
                 //Else result will be -1
             }            
             current=current.next;         
         }
       return -1; 
    }   
    @Override
    public int deleteCapacitor(String val, String typ, Integer cnt) {    
        if(head==null) return -1; //If list is empty return -1
        current = head;
        while(current.next!=null){
             if((current.Value.equals(val))){
                 int x = current.Count-cnt;            
                 if(x<0){
                    return -1;
                 }else return x;
                 //If current.Count-cnt >0 return our value
                 //Else result will be -1
             }
             current=current.next;            
         }
       return -1; 
    }
    @Override
    public int deleteInductor(String val, Integer cnt) {
        
        if(head==null) return -1; //If list is empty return -1
        current = head;
        while(current.next!=null){
             if((current.Value.equals(val))){
                 int x = current.Count-cnt;
                 if(x<0){
                    return -1;
                 }       
             }
             current=current.next;            
         }
       return -1; 
    }
    @Override
    public int deleteTransistor(String typ, Integer cnt) {
       int x=0;
        if(head==null) return -1; //If list is empty return -1
        current = head;
        while(current.next!=null){
             if(current.Type.equals(typ)){
                 x = current.Count-cnt;

                 if(x<0){
                    return -1;
                 }
                 return x; 
                 //If current.Count-cnt >=0 return our value
                 //Else result will be -1
             }
             current=current.next;            
         }
       return -1; 
    }

    @Override
    public void printInventory() {
        current = head;
        while(current != null){   //It searches all of list and prints datas from llist.
            System.out.println(current.Name+" "+current.Type+" "+current.Value+" "+current.Count);               
            current=current.next;  
        }
    }  
}