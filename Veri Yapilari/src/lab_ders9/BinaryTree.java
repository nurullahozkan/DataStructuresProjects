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
public class BinaryTree {

    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    private Node addRecursive(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        } else {

            if (data < root.data) {
                root.left = addRecursive(root.left, data);
            } else {
                root.right = addRecursive(root.right, data);
            }
        }
        return root;
    }

    public void add(int data) {
        this.root = addRecursive(this.root, data);
    }

    public Node findMin(Node root) {
        if (root.left == null) {
            return root;
        } else {
            return findMin(root.left);
        }

    }
    
    public Node findMax(Node root){
        if(root.right == null){
            return root;
        }else{
            return findMax(root.right);
        }
    }

    private Node searchRecursive(Node root, int search ){
        
        if(root.data == search){
            return root;
        }else if(root.data != search){
            return null;
        }
        else{
            if(search < root.data){
                return searchRecursive(root.left, search);
            }else{
               return  searchRecursive(root.right, search);
            }
        }
        
        
    }
    
    public Node Search(int search){
         return searchRecursive(root, search);
    }
    
    private Node deleteRecursive(Node root, int data){
        
        if ( root == null){
            return null;
        }
        if(data < root.data){
            root.left = deleteRecursive(root.left, data);
        }
        else if(data > root.data){
            root.right = deleteRecursive(root.right, data);
        }else{
            if(root.left != null && root.right != null){
                
                Node max = findMax(root.left);
                root.data = max.data;
                root.left = deleteRecursive(root.left, root.data);
                
            }else if (root.left != null){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        
        return root;
    }
    
    public Node delete(int data){
        return deleteRecursive(root, data);
    }
            
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print((char)root.data + " ");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print((char)root.data+" ");
        }
    }
    
    public void preOrder(Node root){
        if(root != null){
            System.out.print((char)root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
