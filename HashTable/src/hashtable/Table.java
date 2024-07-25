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
        int posicion = loseloseHash(key);
        if (arr[posicion] == null) {
            LinkedList lista = new LinkedList();
            arr[posicion] = lista;
        }

        arr[posicion].add(key, value);

    }

    public int loseloseHash(String key) {
        int len = key.length();
        int hash = 0;
        for (int i = 0; i < len; i++) {
            hash += (int) key.charAt(i);
        }
        hash = hash % 100;
        return hash;
    }

    public void print() {
        for (LinkedList lin : arr) {
            if (lin != null) {
                lin.print();
            }
        }
    }

    public void get(String key) {
        int posicion = loseloseHash(key);
        if (arr[posicion] != null) {
            Nodo temp = new Nodo();
            temp = arr[posicion].top;

            while (temp != null) {
                if (temp.key == key) {
                    System.out.println("KEY: " + temp.key + " VALUE: " + temp.value);
                    break;
                } else {
                    if (temp.next == null) {
                        System.out.println("No existe el KEY ");
                    }
                    temp = temp.next;
                }
            }
        } else {
            System.out.println("No existe el KEY");
        }
    }

    public void remove(String key) {

        int posicion = loseloseHash(key);
        if (arr[posicion] == null) {
            System.out.println("No existe el KEY");
        } else {
            Nodo temp= new Nodo();
            temp= arr[posicion].top;
            Nodo toRemove = new Nodo();

            if (temp.key==key){
                arr[posicion].top=temp.next;
                System.out.println("Removed top key "+temp.key+ " VALUE "+ temp.value);
                return;
            }else{
            while(temp.next!= null){
                if(temp.next.key == key){
                    toRemove= temp.next;
                    temp.next=toRemove.next;
                    System.out.println("removed "+toRemove.key + " VALUE "+toRemove.value);
                    return;
                }
                else{
                    temp= temp.next;
                }
            }
            }
        }
        
    }

}
