/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author vichy
 */
public class Main {

    public static void main(String[] args) {
        Arbol arb = new Arbol();

        arb.add(10);
        arb.add(4);
        arb.add(2);
        arb.add(3);
        arb.add(5);
        arb.add(12);
        arb.add(1);
        arb.add(13);
        arb.add(8);
        arb.add(9);
        //arb.inorder(arb.par);
        arb.par=arb.remove(5, arb.par);
        //System.out.println("after removal");
        arb.inorder(arb.par);
    }
}
