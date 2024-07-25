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
public class Table {

    LinkedList arr[];

    public Table() {
        arr = new LinkedList[100];

    }

    public void insert(String key, int value) {
        int llave = loseloseHash(key);
        insert(llave, value);
    }

    public void insert(int key, int value) {
        if(arr[key]==null){
            LinkedList lista= new LinkedList();
            arr[key]=lista;
        }
            
        arr[key].add(key, value);
        
    }

    public int loseloseHash(String key) {
        int len= key.length();
        int hash=0;
        for (int i=0; i<len; i++){
            hash+=(int)key.charAt(i);
        }
        hash= hash%100;
        return hash;
    }

    public void print(){
        for(LinkedList lin : arr){
            if(lin!=null){
                lin.print();
            }
        }
    }
    
    public void get( int key){
        if(arr[key]!= null){
            LinkedList temp= new LinkedList();
            temp=arr[key];
            System.out.println("El valor de KEY: "+temp.top.key+" es : "+temp.top.value);
            System.out.println("VALORES:");
            temp.print();
        }
        else {
            System.out.println("No existe el KEY ");
        }
    }
    public void get(String key){
        int llave= loseloseHash(key);
        get(llave);
    }
    public void remove (){
        
    }
}
