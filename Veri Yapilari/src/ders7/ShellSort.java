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
public class ShellSort {
    
    private static int sort(int arr[]){
        
        int n = arr.length;
        
        for(int gap = n/2; gap > 0; gap /= 2){
            
            for(int i = gap; i < n; i += 1){
                
                int tmp = arr[i];
                int  j;
                for(j = i; j >= gap && arr[j - gap] > tmp; j -= gap)
                   arr[j] = arr[j - gap];
                   arr[j] = tmp;
            }
        }
        
        return 0;
    }
    
    private static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int arr[] = {12, 34, 54, 2, 3};
        print(arr);
        sort(arr);
        print(arr);
    }
    
}
