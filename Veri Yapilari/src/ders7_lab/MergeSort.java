/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders7_lab;

/**
 *
 * @author Nurullah
 */

/*
    soyadımızı ascii karşılığı alıp merge sorta göre sıralayınız
*/
public class MergeSort {
    int[] arr;
    public MergeSort(String a){
        arr=new int[a.length()];
        for(int  i=0;i<a.length();i++){
            arr[i]=a.charAt(i);
        }
    }
    private  void merge( int l, int m, int r){
        
       int n1 = m-l +1;  // sürekli ikiye böleceğimiz için dizinin boyutunu belirliyoruz
        int n2 = r-m;
        
        int L[] = new int[n1]; // yukarıda boyutunu belirlediğimiz şekilde geçici sol ve sağ alt dizilerimizi oluşturuyoruz.
        int R[] = new int[n2];
        
        
        for(int i = 0; i < n1; i++) // geçici dizilere gerçek dizideki sayıları kopyalıyoruz.
            L[i] = arr[l+ i];
        for(int j = 0; j < n2; j++)
            R[j] = arr[m+ 1+ j]; 
        
        
        int i = 0, j = 0, k =l;
        while(i < n1 && j < n2){
            
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){ // L dizisindeki sıralanmış elemanları gerçek dizimide kopyaladık
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
      void sort( int l, int r){
        if(l < r){
            
            int m = (l+r)/2;            
            sort( l, m);
            sort( m+1, r);
            
            merge( l, m, r);
        }
    }
    
      void print(){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print((char)arr[i]+" ");
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        String ad ="nurullah";
        MergeSort m = new MergeSort(ad);
        m.sort(0, ad.length()-1);
        m.print();
        
    }
    
}
