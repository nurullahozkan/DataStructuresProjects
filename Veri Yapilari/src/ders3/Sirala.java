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
public class Sirala {

    int[] dizi;

    public Sirala(int[] dizi) {
        this.dizi = dizi;
    }

    public int[] Bubble_Sort(int dizi[]) {

        for (int i = dizi.length - 1; i >= 0; i--) {

            for (int j = 0; j < dizi.length - 1; j++) {

                if (dizi[j] < dizi[j + 1]) {

                    int tmp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = tmp;

                    for (int k = 0; k < dizi.length; k++) {
                        System.out.print(dizi[k] + "-");
                    }
                    System.out.println("");
                }
            }
        }

        return dizi;
    }

    public int[] Selection_Sort(int dizi[]) {

        for (int i = 0; i < dizi.length; i++) {

            int min = i;

            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[j] < dizi[min]) {
                    min = j;

                }

                for (int k = 0; k < dizi.length; k++) {
                    System.out.print(dizi[k] + "-");
                }
                System.out.println("");

                int tmp = dizi[j];
                dizi[j] = dizi[min];
                dizi[min] = tmp;

            }

        }

        return dizi;
    }

    public int[] Insertion_Sort(int dizi[]) {

        for (int i = 1; i < dizi.length; i++) {

            int tmp = i;
            int sayi = dizi[tmp];

            for (int j = (i - 1); j >=0; j--) {

                if (dizi[j] > sayi) {
                    dizi[tmp] = dizi[j];
                    tmp--;
                }
                 dizi[tmp] = sayi;
                 
                for (int k = 0; k < dizi.length; k++) {
                    System.out.print(dizi[k] + "-");
                }
                System.out.println("");

            }

        }

        return dizi;
    }
}
