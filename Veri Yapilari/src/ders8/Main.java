/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders8;

/**
 *
 * @author Nurullah
 */
public class Main {
    
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        
        bt.add(12);
        bt.add(20);
        bt.add(5);
        bt.add(4);
        bt.add(3);
        bt.add(13);
        bt.add(25);
        
        bt.inOrder(bt.root);
        System.out.println("");
        bt.postOrder(bt.root);
        System.out.println("");
        bt.preOrder(bt.root);
        
        bt.delete(3);
        bt.delete(5);
        System.out.println("");
        bt.inOrder(bt.root);
        
        System.out.println("");
        System.out.println("En Küçük Eleman : "+bt.findMin(bt.root));
        System.out.println("En Büyük Eleman : "+bt.findMax(bt.root));
        System.out.println("Bulundu : "+ bt.Search(12));
    }
}
