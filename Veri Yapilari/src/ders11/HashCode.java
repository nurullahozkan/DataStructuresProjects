/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders11;

import java.util.Scanner;

/**
 *
 * @author Nurullah
 */
public class HashCode {

    Scanner klavye = new Scanner(System.in);
    int a = klavye.nextInt();

    private final int boyut = a;

    int[] tablo = new int[boyut];

    int Hash(int deger) {
        return deger % a;
    }

    void ekle(int deger) {

        tablo[Hash(deger)] = deger;
    }

    void sil(int mod) {
        tablo[mod] = 0;
    }

    int bul(int mod) {
        return tablo[Hash(mod)];
    }

    int ara(int deger) {
        for (int i = 0; i < tablo.length; i++) {
            if (tablo[i] == deger) {
                return i;
            }
        }
        return -1;
    }

    void yazdir() {
        for (int i = 0; i < boyut; i++) {
            System.out.print(tablo[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Tablonun boyutu kac sayi olsun ? ");

        HashCode tablo = new HashCode();
        tablo.ekle(34);
        tablo.ekle(54);
        tablo.ekle(10);
        tablo.ekle(20);
        tablo.ekle(75);
        System.out.println();
        tablo.yazdir();
        System.out.println();
        /*
        if (tablo.ara(20) >= 0) {
            System.out.println(" aradiginiz indexi : " + tablo.ara(20));
        } else {
            System.out.println(" aradiginiz indexi bulunmadi !!: ");
        }
        if (tablo.ara(100) >= 0) {
            System.out.println(" aradiginiz indexi : " + tablo.ara(100));
        } else {
            System.out.println(" aradiginiz indexi bulunmadi !!: ");
        }
        System.out.println("karma silmeden once :");
        tablo.yazdir();
        System.out.println();
        tablo.sil(0);
        tablo.sil(4);
        System.out.println("karma sildikten sonra :");
        tablo.yazdir();
*/
    }
}
