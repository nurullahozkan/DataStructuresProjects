/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9_AVLTree;

/**
 *
 * @author Nurullah
 */
public class Main {

    public static void main(String args[]) {
        Tree agac = new Tree();

        agac.DegerEkle(15);
        agac.DegerEkle(20);
        agac.DegerEkle(24);
        agac.DegerEkle(10);
        agac.DegerEkle(13);
        agac.DegerEkle(7);
        agac.DegerEkle(30);
        agac.DegerEkle(36);
        agac.DegerEkle(25);
        
        System.out.println("Eleman sayıs : " + agac.countNode(agac.kok));
        
        
        agac.InOrder(agac.kok);

        Node aranan = agac.AraRecursive(agac.kok, 5);
        if (aranan != null) {
            System.out.println("Bulundu = " + aranan.deger);

        } else {
            System.out.println("Bulunamadı  ");
        }
    }
    
    
}
