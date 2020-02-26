/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders3;

/**
 *
 * @author Nurullah
 */
public class main {

    public static void main(String[] args) {

        int[] dizi = {2, 5, 1, 0};
        Sirala s = new Sirala(dizi);

        s.Bubble_Sort(dizi);
        System.out.println("---------------------------------");
        s.Selection_Sort(dizi);
        System.out.println("---------------------------------");
        s.Insertion_Sort(dizi);
    }

}
