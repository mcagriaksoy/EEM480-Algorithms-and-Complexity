
package Mehmet_Cagri_Aksoy_HW2;
/**
 * @author Mehmet Çağrı Aksoy
 */
public class Mehmet_Cagri_Aksoy_HW2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventory myInventory = new Inventory();

        System.out.println("\nHere! All Inventories Listed Below:\n");
        
        myInventory.addCapacitor("8F", "cs7", 31);
        myInventory.addTransistor("BC100", 40);
        
        myInventory.addTransistor("AK120", 8);
        myInventory.addResistor("12K", 10);
        
        myInventory.addResistor("27K", 8);
        myInventory.addCapacitor("100F", "cs", 10);
        myInventory.addInductor("XS101", 2);
        
        myInventory.addResistor("12K", 16);  
        myInventory.addTransistor("BC108", 45);
        
        myInventory.addInductor("KLM392", 7);
        myInventory.addCapacitor("100F", "cs", 1);
        
        myInventory.addInductor("KLM392", 5);
        myInventory.addTransistor("BC108", 110);
        //It get data from llist and order them:
        myInventory.printInventory(); //Get data from Linked List's nodes!

        System.out.println("\nAfter Delete Operations:\n");
        int remain,remain_transistor,remain_capacitor = 0;
        
        remain = myInventory.deleteResistor("27K", 1);

        if (remain >= 0){
            System.out.println("There are " + remain + " amount of 27 K resistors in Inventory");
        }else{
            System.out.println("Error! Not Enough Resistor to delete!");
        }
        
        remain_transistor = myInventory.deleteTransistor("AK120", 6);
        
        if (remain_transistor >= 0){
            System.out.println("There are " + remain_transistor + " amount of BC108 transistors in Inventory");
        }else{
            System.out.println("Error! Not Enough Transistor to delete!");
        }
        
        remain_capacitor = myInventory.deleteCapacitor("100F", "cs", 4);
        
        if (remain_capacitor >= 0){
            System.out.println("There are " + remain_capacitor + " amount of 100F capacitors in Inventory\n");
        }else{
            System.out.println("Error! Not Enough Capacitor to delete!");
        }
}
}
