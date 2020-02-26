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
public class BubbleSort {
    
    public static int[] Bubble_Sort(int dizi[]){
        
        for(int i = dizi.length-1; i >= 0 ; i--){
            
            for(int j = 0; j < dizi.length; j++ )
                if(dizi[j] > dizi[j+1]){
                    
                    for(int k = 0; k < dizi.length; k++){
            System.out.print(dizi[k]+"--");
        }
        System.out.println("");
                    
                    int tmp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = tmp;
                }
        }
        
        return dizi;
    }
    
    public static void yazdir(int[] dizi){
        for(int k = 0; k < dizi.length; k++){
            System.out.print(dizi[k]+"--");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] dizi = {1,5,7,9,2,0,8};
        //yazdir(dizi);
        Bubble_Sort(dizi);
        //yazdir(dizi);
    }
}
