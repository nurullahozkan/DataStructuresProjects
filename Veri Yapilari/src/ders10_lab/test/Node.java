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
public class Node {
    public int data;
    public Node left;
    public Node right;
    public int hight;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.hight = 0;
    }

    @Override
    public String toString() {
        return "" + data + '}';
    }
    
    
}
