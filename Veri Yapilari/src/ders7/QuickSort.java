/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders7;

/**
 *
 * @author Nurullah
 */
public class QuickSort {
    
    static int partition(int[] arr, int low, int high){
        
        int pivot = arr[high];
        int i = (low-1);  // küçük elemanın indisi
        
        for(int j = low; j < high; j++){
            
            if(arr[j] < pivot){  // mevcut eleman pivottan küçükse
                
                i++;
                
                int tmp = arr[i]; // i ile j yer değiştirdik.
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // en son pivot ile i'yi swap et.
        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        
        return i+1;
    }
    
    static void sort(int arr[], int low, int high){
        
        if(low < high){
            int pi = partition(arr, low, high);
            for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
            
        }
    }
    
    static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int[] arr = {10, 7, 8, 9, 1, 5};
        print(arr);
        sort(arr, 0, arr.length-1);
        print(arr);
    }
}
