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
public class InsertionSort {

    public static int[] Insertion_Sort(int dizi[]) {

        for (int i = 1; i < dizi.length; i++) {

            int tmp = i;
            int sayi = dizi[tmp];

            for (int j = (i - 1); j >= 0; j--) {

                if (dizi[j] > sayi) {
                    dizi[tmp] = dizi[j];
                    tmp--;
                }
                for (int k = 0; k < dizi.length; k++) {
                    System.out.print(dizi[k] + "--");
                }
                System.out.println("");

            }

            dizi[tmp] = sayi;

            for (int k = 0; k < dizi.length; k++) {
                System.out.print(dizi[k] + "--");
            }
            System.out.println("");

        }

        return dizi;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 5, 7, 9, 2, 0, 8};
        Insertion_Sort(dizi);

    }

}
