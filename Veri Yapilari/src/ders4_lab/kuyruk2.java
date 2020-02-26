/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4_lab;

/**
 *
 * @author Nurullah
 */
public class kuyruk2 {

    public int[] dizi;
    public int count;
    public int diziboyutu;

    public kuyruk2(int diziboyutu) {
        this.diziboyutu = diziboyutu;
        this.dizi = new int[diziboyutu];
        this.count = 0;
    }

    public void push(int a) {
        if (this.count == diziboyutu) {
            System.out.println("Dolu!!!!!!");
        } else {
            this.dizi[count] = a;
            count++;
        }
    }
}
