/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders8_lab;

import java.util.Arrays;

/**
 *
 * @author Nurullah
 */
public class RadixSorts {
    
    private static int enBuyukBul(int dizi[], int n){
        int eb = dizi[0];
        
        for(int i = 0; i < n; i++)
            if(dizi[i] > eb)
                eb = dizi[i];
        return eb;
    }
    
    private static void Sirala(int arr[], int n, int exp){
        
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        
        for(i = 0; i < n; i++)
            count[ (arr[i]/exp)%10]++;
        
          
        
        for(i = 1; i < 10; i++)
            count[i] += count[i - 1];
        
          
        for(i = n-1; i >= 0; i--){
            output[count[ (arr[i]/exp)%10] - 1] = arr[i];
            count[ (arr[i]/exp)%10]--;
        }
        
        for(i = 0; i < n; i++)
            arr[i] = output[i];
    }
    
    private static void radixSort(int dizi[], int n){
        
        int m = enBuyukBul(dizi, n);
        
        for(int exp = 1; m/exp > 0; exp *= 10)
            Sirala(dizi, n, exp);
    }
    
    private static void yazdir(int dizi[]){
        
        for(int i = 0; i < dizi.length; i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int dizi[] = {106, 16, 24, 28, 123, 1024, 1};
        yazdir(dizi);
        radixSort(dizi, dizi.length);
        yazdir(dizi);
    }
    
}
