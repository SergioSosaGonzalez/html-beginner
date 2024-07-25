/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtable;

/**
 *
 * @author vichy
 */
public class LinkedList {
    Nodo top;
    public LinkedList(){
        
    }
    
    public void add(String key, int value){
        Nodo nuevoNodo= new Nodo();
        nuevoNodo.key=key;
        nuevoNodo.value=value;
        if(top==null){
            top= new Nodo();
            top=nuevoNodo;
        } 
        else{
           Nodo temp= new Nodo();
           temp=top;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=nuevoNodo;
        }
    }
    public void print(){
        Nodo temp= new Nodo();
        temp=top;
        while(temp!=null){
            System.out.println("KEY: "+temp.key+" - VALUE : "+temp.value);
            temp=temp.next;
        }
    }
}
