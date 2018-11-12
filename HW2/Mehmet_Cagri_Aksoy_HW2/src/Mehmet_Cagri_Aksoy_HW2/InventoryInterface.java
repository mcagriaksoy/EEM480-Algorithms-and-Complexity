/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mehmet_Cagri_Aksoy_HW2;
/**
 *
 * @author Mehmet Çağrı Aksoy
 */

public interface InventoryInterface {
    
public void addResistor(String val, Integer cnt );
public void addCapacitor(String val, String typ, Integer cnt );
public void addInductor(String val, Integer cnt );
public void addTransistor(String typ, Integer cnt );
public int deleteResistor(String val, Integer cnt ); 
public int deleteCapacitor(String val, String typ, Integer cnt);
public int deleteInductor(String val, Integer cnt ); 
public int deleteTransistor(String typ, Integer cnt ); 
public void printInventory(); 

}