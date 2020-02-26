package SortAlgorithms;

public class quickSort1 {
   
    public static int partiton(int arr[], int low, int high){
        
        int pivot = arr[high];
        int i = (low - 1);
        
        for(int j = low; j < high; j++){
            
            if(arr[j] < pivot){
                i++;
                
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                
            }
        }
        
        int tmp = arr[i +1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        
        return i + 1;
    }
    
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pi = partiton(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int arr[] = {25, 45, 10, 89, 75, 14, 9, 30};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
