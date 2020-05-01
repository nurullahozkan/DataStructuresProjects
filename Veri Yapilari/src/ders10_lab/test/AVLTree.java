/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders10_lab.test;

/**
 *
 * @author Nurullah
 */
public class AVLTree {
    public Node root;

    public AVLTree() {
        this.root = null;
    }
    
    private Node addRec(Node root, int data){
        
        if(root == null){
            root = new Node(data);
        }
        else{
            if(root.data > data){
                root.left = addRec(root.left, data);
            }
            else {
                root.right = addRec(root.right, data);
            }
        }
        
        
        return  root;
    }
    
    public void add(int data){
        this.root = addRec(this.root, data);
    }
    
}
