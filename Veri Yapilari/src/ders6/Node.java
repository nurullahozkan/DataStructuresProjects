/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders6;

/**
 *
 * @author Nurullah
 */
public class Node {
    public int a;
    public Node next;
    public Node previous;
    
    public Node(int a){
        this.a = a;
        this.next = null;
        this.previous = null;
    }
}
