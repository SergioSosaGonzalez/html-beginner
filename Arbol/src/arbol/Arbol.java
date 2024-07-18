/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author vichy
 */
public class Arbol {

    Nodo par;

    public Arbol() {

    }

    public void add(int value) {
        par = add(value, par);
    }

    public Nodo add(int value, Nodo parent) {
        if (parent == null) {
            parent = new Nodo();
            parent.value = value;
        } else {
            if (parent.value > value) {
                parent.left = add(value, parent.left);
            } else if (parent.value < value) {
                parent.right = add(value, parent.right);
            }
        }
        return parent;
    }
    public Nodo add(Nodo toAdd, Nodo parent){
        if (parent==null){
            parent=new Nodo();
            parent=toAdd;
            System.out.println("parent value"+parent.value);
        }else{
            if (parent.value < toAdd.value){
                parent.right=add(toAdd, parent.right);
            }else if(parent.value > toAdd.value) {
                parent.right=add(toAdd, parent.right);
            }
        }
        
        return parent;
    }

    public Nodo remove(int value, Nodo parent) {
        if (parent != null) {
            if (parent.value == value) {
                Nodo parLeft = new Nodo();
                Nodo parRight = new Nodo();
                if (parent.left != null) {
                    System.out.println("parent left"+parLeft.value);
                    parLeft = parent.left;    
                    par=add(parLeft,par );
                }
                if (parent.right != null) {
                    parRight = parent.right;
                    par=add(parRight,par );
                    System.out.println("parent right"+parRight.value);
                }
                parent = null;
            }
            else if(parent.value < value){
                parent.right=remove(value, parent.right);
            }else{
                parent.left=remove(value, parent.left);
            }
        }
        return parent;
    }

    
    public void inorder(Nodo parent) {
        if (parent != null) {
            inorder(parent.left);
            System.out.println(parent.value);
            inorder(parent.right);
        }

    }

    public void deorder(Nodo parent) {
        if (parent != null) {
            inorder(parent.right);
            System.out.println(parent.value);
            inorder(parent.left);
        }
    }
}
