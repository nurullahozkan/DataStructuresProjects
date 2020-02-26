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
public class bubbleSort1 {
    public static int[] bubbleSort(int arr[]){
        
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++ ){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        
        
        return arr;
    }
    
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        bubbleSort(arr); 
        System.out.println("Sorted array"); 
        printArray(arr); 
    } 
}
