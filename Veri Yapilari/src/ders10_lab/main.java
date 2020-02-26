/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders10_lab;

/**
 *
 * @author Nurullah
 */
public class main {
    public static void main(String[] args) {
        AVLTree agac = new AVLTree();

        agac.DegerEkle(15);
        agac.DegerEkle(20);
        agac.DegerEkle(24);
        agac.DegerEkle(25);
        agac.DegerEkle(13);
        agac.DegerEkle(7);
        agac.DegerEkle(30);
        agac.DegerEkle(36);
        agac.DegerEkle(25);
        
           agac.InOrder(agac.kok);
           System.out.println("");
        
        System.out.println("Bulundu : "+agac.araRecursive(agac.kok, 40));
        
     
        
    }
}
