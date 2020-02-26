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
public class BagliListe {
    
    public Node head;
    public Node tail;

    public BagliListe() {
        this.head = null;
        this.tail = null;
    }
    
    public void basaEkle(int sayi){
        Node eleman = new Node(sayi);
        
        if(head == null){
            this.head = eleman;
            this.tail = eleman;
        }
    }
    
}
