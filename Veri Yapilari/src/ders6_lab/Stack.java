package ders6_lab;

import java.util.Scanner;

public class Stack {
    
    int dizi[];
    public int stackpointer=-1;
    private int diziboyutu;
   
    public Stack(int i){
        dizi=new int[i];
       
    }
    public boolean peek(){
        if(stackpointer==dizi.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean empty(){
        if(stackpointer==-1){
            return true;
        }
        else{
            return false;
        }
    }
 
    public void push(int sayi){
        if(peek() != true){
            dizi[++stackpointer]=sayi;
        }
        else{
            System.out.println("stack Dolu");
        }
    }
    public int pop(){
        if(!empty()){
            return dizi[stackpointer--];
        }
        else{
            return 0;
        }
    }
    
       public void yazdir(){
        for(int i=stackpointer;i>=0;i--){
            System.out.print(dizi[i]+" -->");
        }
        System.out.println("");
    }
   
}
