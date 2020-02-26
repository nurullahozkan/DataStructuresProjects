
package ders7_lab;

import java.util.Scanner;

public class QuickSort {

   
    int partition(char arr[], int low, int high) 
    { 
       char pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
           
            if (arr[j] < pivot) 
            { 
                i++; 
  
 
             char temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }  
        char temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    void sort(char arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int pi = partition(arr, low, high); 
  
          
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
   public void printArray(char arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       String dizi;
        System.out.println("isim giriniz");
       dizi=s.nextLine();
         int n=dizi.length();
        char dizi2[]=new char[n];
         for (int i = 0; i < n; i++) {
            dizi2[i]=dizi.charAt(i);
        }
       
      QuickSort sirala = new QuickSort(); 
        sirala.sort(dizi2, 0, n-1); 
        sirala.printArray(dizi2); 
    
}
}