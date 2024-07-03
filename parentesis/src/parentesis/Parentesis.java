/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parentesis;

/**
 *
 * @author vichy
 */
public class Parentesis {

    Stack simbolos;
    Stack parentesis;
    Stack llaves;
    Stack corchetes;

    public Parentesis(String texto) {
        simbolos = new Stack();
        parentesis = new Stack();
        llaves = new Stack();
        corchetes = new Stack();
        int size = texto.length();
        for (int i = 0; i < size; i++) {
            //System.out.println(texto.charAt(i));
            simbolos.push(texto.charAt(i));
        }
    }

    public void separar() {
        char temp = simbolos.pop();
        if (temp == ')' || temp == '(') {
            parentesis.push(temp);
        }
        if (temp == '{' || temp == '}') {
            llaves.push(temp);
        }
        if (temp == '[' || temp == ']') {
            corchetes.push(temp);
        }
        if (simbolos.size > 0) {
            separar();
        }
        //System.out.println("Parentesis"+parentesis.size);
        //System.out.println("corchetes"+corchetes.size);
        //System.out.println("llaves"+llaves.size);
    }

    public Stack verificar(Stack stack, Stack tipo) {
        if(tipo.size>0){
        char temp = tipo.pop();
        if (temp == '(' || temp == '[' || temp == '{') {
            stack.push(temp);
        } else if (temp == ')' || temp == ']' || temp == '}') {
            if (stack.size > 0) {
                stack.pop();
            } else {
                System.out.println("falta abrir");
                return stack;
            }
        }
        if (tipo.size > 0) {
            stack = verificar(stack, tipo);
        } else {
            if (stack.size > 0) {
                System.out.println("falta cerrar");
            } else {
                System.out.println("Existen simbolos de abrir y cerrar");
            }
        }
        }
        return stack;
    }

    public static void main(String[] args) {
        Parentesis parent = new Parentesis("[()]([){}]");
        //System.out.println(parent.caracteres.pop());
        //System.out.println(parent.caracteres.pop());
        parent.separar();

        Stack temp = new Stack();
        //System.out.println("temp size"+temp.size);
        //parent.verificar(temp, parent.parentesis);
        System.out.print("Parentesis: ");
        parent.verificar(temp, parent.parentesis);
        temp.clear();
        System.out.print("Corchetes: ");
        parent.verificar(temp, parent.corchetes);
        temp.clear();
        System.out.print("Llaves: ");
        parent.verificar(temp, parent.llaves);

        //System.out.println("numero de parentesis: "+parent.parentesis.size);
        //parent.parentesis.print();
    }
}
