/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortAlgorithms;

/**
 *
 * @author Nurullah
 */
public class SelectionSort {

    public static int[] Selection_Sort(int dizi[]) {

        for (int i = 0; i < dizi.length - 1; i++) {
            int min = i;

            for (int j = i+1; j < dizi.length; j++) {

                if (dizi[j] < dizi[min]) {
                    min = j;
                }
            }
                int tmp = dizi[i];
                dizi[i] = dizi[min];
                dizi[min] = tmp;
        }

        return dizi;
    }

    public static void yazdir(int[] dizi) {
        for (int k = 0; k < dizi.length; k++) {
            System.out.print(dizi[k] + "--");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] dizi = {1, 5, 7, 9, 2, 0, 8};
        yazdir(dizi);
        Selection_Sort(dizi);
        yazdir(dizi);

    }
}
