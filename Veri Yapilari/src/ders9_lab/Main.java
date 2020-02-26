/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9_lab;

/**
 *
 * @author nurullah
 */
public class Main {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree(); 
        infixToprefix a = new infixToprefix();
        String s = "(A+B)*(C-D)";
        s=a.infixToPrefix(s);
        t.setRoot(new Node (s.charAt(0)));//*
        t.getRoot().setLeft(new Node (s.charAt(1)));//+
        t.getRoot().getLeft().setLeft(new Node (s.charAt(2)));//A
        t.getRoot().getLeft().setRight(new Node (s.charAt(3)));//B
        t.getRoot().setRight(new Node (s.charAt(4)));//-
        t.getRoot().getRight().setLeft(new Node (s.charAt(5)));//C
        t.getRoot().getRight().setRight(new Node (s.charAt(6)));//D
        t.traverseInOrder(t.getRoot());
        System.out.println("");
        t.traversePreOrder(t.getRoot());
        System.out.println("");
        t.traversePostOrder(t.getRoot());
    }

}
