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

/*
    hem yığıt hem kuyruk 
 */
public class main {

    public static void main(String[] args) {

        kuyruk1 q1 = new kuyruk1(3);
        q1.push(10);
        // q1.yazdir();
        q1.push(20);
        // q1.yazdir();
        q1.push(30);
        // q1.yazdir();
        q1.push(40);
        //  q1.yazdir();
        q1.push(50);

        q1.push(60);
        q1.push(70);
        q1.push(80);
        q1.push(90);

        q1.yazdir();
        q1.push(100);
    }
}
