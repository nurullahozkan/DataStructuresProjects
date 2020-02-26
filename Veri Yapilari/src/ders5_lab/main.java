/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5_lab;

/**
 *
 * @author Nurullah
 */
public class main {
    public static void main(String[] args) {
        
    BagliListe b = new BagliListe();
    Node deger;
 
    b.basaEkle(new Node(new Human("Nurullah", 21)));
    b.yazdir();
    b.basaEkle(new Node(new Human("Ahmet", 25)));
    b.yazdir();
    b.basaEkle(new Node(new Human("Mehmet", 30)));
    b.yazdir();
    deger=b.pop();
        
    b.yazdir();
    System.out.println("donen deger -->"+deger.human.toString());
    deger=b.pop();
    b.yazdir();
    System.out.println("donen deger -->"+deger.human.toString());
     deger=b.pop();
    b.yazdir();
    System.out.println("donen deger -->"+deger.human.toString());
     deger=b.pop();
    b.yazdir();
    System.out.println("donen deger -->"+deger);
    }
}
