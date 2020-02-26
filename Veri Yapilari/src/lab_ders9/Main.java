/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ders9;

/**
 *
 * @author Nurullah
 */
public class Main {
    
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        infixToprefix i = new infixToprefix();
        
        String s = "(A+B)*(C-D)";
        s = i.infixToPrefix(s);
        
        bt.root = new Node(s.charAt(0));//*
        bt.root.left = new Node(s.charAt(1));//+
        bt.root.left.left = new Node(s.charAt(2));//A
        bt.root.left.right = new Node(s.charAt(3));//B
        bt.root.right = new Node(s.charAt(4));//-
        bt.root.right.left = new Node(s.charAt(5));//C
        bt.root.right.right = new Node(s.charAt(6));//D
        
        bt.inOrder(bt.root);
        System.out.println("");
        
        bt.preOrder(bt.root);
        System.out.println("");
        
        bt.postOrder(bt.root);
        System.out.println("");
        
//        
//        System.out.println("");
//        System.out.println("En Küçük Eleman : "+bt.findMin(bt.root));
//        System.out.println("En Büyük Eleman : "+bt.findMax(bt.root));
//        System.out.println("Bulundu : "+ bt.Search(65));
    }
}
