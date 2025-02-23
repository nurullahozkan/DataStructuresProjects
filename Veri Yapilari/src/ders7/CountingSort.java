/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders7;

import java.util.Arrays;

/**
 *
 * @author Nurullah
 */
public class CountingSort {
        
        private static void sort(int arr[]){
            
            int max = Arrays.stream(arr).max().getAsInt();
            int min = Arrays.stream(arr).min().getAsInt();
            int range = max - min + 1;
            int count[] = new int[range];
            int output[] = new int[arr.length];
            
            for(int i = 0; i < arr.length; i++){
                count[arr[i] - min]++;
            }
            
            for(int i = 1; i < count.length; i++){
                count[i] += count[i - 1];
            }
            
            for(int i = arr.length-1; i >= 0; i--){
                output[count[arr[i] - min] - 1] = arr[i];
                count[arr[i] - min]--;
            }
            
            for(int i = 0; i < arr.length; i++){
                arr[i] = output[i];
            }
            
        }

     private static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int arr[] = {-5, -10, 0, -3, 8, 5, -1, 10};
        print(arr);
        sort(arr);
        print(arr);
    }
}
