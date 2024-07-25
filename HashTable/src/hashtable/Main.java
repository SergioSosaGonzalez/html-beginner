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
        tabla.insert("hola", 0);
        tabla.insert("mundo", 1);
        tabla.insert("!!!", 2);
        tabla.insert("hola", 3);
        tabla.insert("hola", 5);
        tabla.insert("hol", 4);
        tabla.print();
        
        tabla.get("hol");
        
    }
}
