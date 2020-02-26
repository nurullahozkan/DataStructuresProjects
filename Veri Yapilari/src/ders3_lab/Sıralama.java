/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders3_lab;

/**
 *
 * @author Nurullah
 */
public class Sıralama {

   private int dizi[];

    public Sıralama(int[] dizi){
        this.dizi = dizi;
    }
    
    public int[] Bubble_Sort(int dizi[]) {

        for (int i = dizi.length - 1; i >= 0; i--) { // dizinin sıralanmış halini bir daha kontrol etmemek için i = n den başlar

            for (int j = 0; j < i; j++) {
                
                if (dizi[j] > dizi[j+1]) { // küçükten büyüğe srılama için bir sonraki elemandan büyükse swap işlemine girsin
                    int tmp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = tmp;
                }
            }
        }

        return dizi;
    }

    public int[] Selection_Sort(int dizi[]) {

        return dizi;
    }

    public int[] Insertion_Sort(int dizi[]) {

        return dizi;
    }
    
    public void yazdir(int dizi[]){
            for (int k = 0; k < 10; k++) { 
                    System.out.print(dizi[k] + "-");
                }
                System.out.println("");
    }

}
