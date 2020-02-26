
package ders8_lab;

import java.util.Arrays;

/*
      radix sort sıralama algoritması kullanılması
*/
public class RadixSort {
    
    private static int enBuyuk(int dizi[], int n){
        
        int eb = dizi[0];
        
        for(int i = 0; i < n; i++)
            if(dizi[i] > eb)
                eb = dizi[i];
                return eb;
    }
    
    private static void Sirala(int dizi[], int n, int a){
        
        int cikti[] = new int[n];
        int i;
        int toplam[] = new int[7];
        Arrays.fill(toplam, 0);
        
        for(i = 0; i < 7; i++){
            toplam[ (dizi[i]/a)%7]++;
        }
        for(i = 1; i < 7; i++){
            toplam[i] += toplam[i - 1];
        }
        for(i = n-1; i >= 0; i--){
            cikti[toplam[(dizi[i]/a)%7] - 1] = dizi[i];
            toplam[(dizi[i]/a)%7]--;
        }
        for(i = 0; i < n; i++){
            dizi[i] = cikti[i];
        }
        
    }
    
    private static void radixSort(int dizi[], int n){
        
        int m = enBuyuk(dizi, n);
        
        for(int a = 1; m/a > 0; m *=10){
            Sirala(dizi, n, a);
        }
    }
    
    private static void yazdir(int dizi[]){
        for(int i = 0; i < dizi.length; i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int dizi[]= {106, 16, 24, 28, 123, 1024, 1};
        yazdir(dizi);
        radixSort(dizi, dizi.length);
        yazdir(dizi);
 
    
    }
    
}
