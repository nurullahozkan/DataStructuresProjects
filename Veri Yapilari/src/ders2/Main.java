/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders2;

import java.util.Scanner;

/**
 *
 * @author Nurullah
 */
public class Main {

    public static void main(String args[]) {

        int[] dizi = new int[10];

        Scanner sn = new Scanner(System.in);

        int j = 0;
        while (j < 10) {

            System.out.println("Lütfen bir sayı giriniz");
            int tmp = sn.nextInt();
            
            for(int k = 0; k < j+1; k++){
                if(tmp < dizi[k] || dizi[k] == 0){
                    int a = tmp;
                    tmp = dizi[k];
                    dizi[k] = a;
                }
            }
            j++;
          
        

            for (int i = 0; i < 10; i++) {
                System.out.print(dizi[i] + " ");
            }
            
    }
}
}
