/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders12_lab;

/**
 *
 * @author Nurullah
 */
public class heapSort {
    
    int[] dizi;
    int n;

    public heapSort(int[] dizi, int n) {
        this.dizi = dizi;
        this.n = n;
    }
    
    
    
    public void heapSort(){
        
        for(int i = n / 2 - 1; i >= 0; i--)
            heapify( i);
        for(int i = n - 1; i >= 0; i-- ){
            int tmp = dizi[0];
            dizi[0] = dizi[i];
            dizi[i] = tmp;
            heapify( 0);
        }
            
    }
    
    public void heapify( int i){
        int enbuyuk = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if(l < n && dizi[l] < dizi[enbuyuk])
           enbuyuk = l;
        if(r < n && dizi[r] < dizi[enbuyuk])
            enbuyuk = r;
        if(enbuyuk != i){
            int tmp = dizi[i];
            dizi[i] = dizi[enbuyuk];
            dizi[enbuyuk] = tmp;
            heapify(enbuyuk);
        }
    }
    
    public int delete(){
        int lastElement = dizi[n-1];
        dizi[0] = lastElement;
        n = n-1;
        heapify( 0);
        return n;
    }
    
    public void yazdir(){
        for(int i = 0 ; i < n ; ++i){
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");
    }

}
