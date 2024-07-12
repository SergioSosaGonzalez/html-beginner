/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author vichy
 */
public class Tarea {

    Nodo head;
    int size;

    public Tarea() {
        size = 0;
    }

    public void add(int prioridad) {
        if (prioridad > 4 || prioridad < 1) {
            System.out.println("La prioridad no es válida. Elige prioridad de 1 a 4");
        } else {
            Nodo newNode = new Nodo();
            newNode.priority = prioridad;
            insert(newNode);
        }
    }

    public void insert(Nodo nuevoNodo) {
        if (head == null || head.priority > nuevoNodo.priority) {
            nuevoNodo.next = head;
            head = nuevoNodo;
        } else {
            Nodo current = head;
            while (current.next != null && current.next.priority >= nuevoNodo.priority) {
                current = current.next;
            }
            nuevoNodo.next = current.next;
            current.next = nuevoNodo;
        }
        size++;
    }

    public void print() {
        Nodo current = new Nodo();
        current = head;
        while (current != null) {
            System.out.println("valor " + current.priority);
            current = current.next;
        }
    }

}
