/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4.GenericClass;

import java.util.Scanner;

/**
 *
 * @author Nurullah
 */
public class main {
    public static void main(String[] args) {
        int secim = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Olusturmak İstediğiniz VeriYapısını Secin :\n1-Kuyruk\n2-Yıgıt\nIslem ::");
        secim = sc.nextInt();
        if (secim == 1) {
            Queue<Human> que = new Queue<>(Human.class, 10);
            do {
                System.out.print("Yapmak İstediğiniz Islemi Secin :\n1-Ekle\n2-Sil\n3-Cıkıs\nIslem ::");
                secim = sc.nextInt();
                if (secim == 1) {
                    System.out.print("Insanın Adını Giriniz :");
                    Human instence = new Human(sc.next());
                    que.push(instence);
                    que.print();
                }
                if (secim == 2) {
                    que.pop();
                    que.print();
                }
            } while (secim != 3);
            
        }
        else if(secim==2){
            Stack<Human> stack= new Stack<>(Human.class,10);
            do {
                System.out.print("Yapmak İstediğiniz Islemi Secin :\n1-Ekle\n2-Sil\n3-Cıkıs\nIslem ::");
                secim = sc.nextInt();
                if (secim == 1) {
                    System.out.print("Insanın Adını Giriniz :");
                    Human instence = new Human(sc.next());
                    stack.push(instence);
                    stack.print();
                }
                if (secim == 2) {
                    stack.pop();
                    stack.print();
                }
            } while (secim != 3);
            
        }

    }

}
