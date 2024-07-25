/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtable;

import java.lang.reflect.Array;

/**
 *
 * @author vichy
 */
public class Main {
    
    
    public static void main(String args[]){
       Table tabla = new Table();
        tabla.insert("apple", 0);
        tabla.insert("elppa", 1);
        tabla.insert("ppale", 6);
        tabla.insert("!!!", 2);
        tabla.insert("k", 3);
        tabla.insert("5", 5);
        tabla.insert("8", 4);
        tabla.print();
   
        
        tabla.get("elppa");
        tabla.remove("elppa");
        tabla.print();
        
    }
}
