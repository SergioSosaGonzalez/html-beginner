/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parentesis;

/**
 *
 * @author vichy
 */
public class Stack {

    Nodo top;
    int size;

    public void push(char value) {
        Nodo newNode = new Nodo();
        newNode.dato = value;
        newNode.next = top;
        top = newNode;
        size++;
    }

    public char pop() {
        Nodo outNodo = new Nodo();
        outNodo = this.top;
        this.top = top.next;
        size--;
        return outNodo.dato;
    }

    public Stack() {
        top = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public void print() {
        Nodo node = new Nodo();
        node = top;
        for (int i = 0; i < size; i++) {
            System.out.println(node.dato);
            node = node.next;
        }
    }

    public void clear() {
        top = null;
        size = 0;
    }
}
