/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4;

/**
 *
 * @author Nurullah
 */
public class Queue {

    private String[] dizi;
    private int count;
    
    public void printQueue(){
        for(int i = 0; i < count; i++){
               System.out.print(dizi[i]+"-");
           }
        System.out.println("");
    }

    public boolean isFull(){
        if(count == dizi.length){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isEmpty(){
        if(count ==0){
            return true;
        }else{
            return false;
        }
    }
    
    public String pop() {
        
       if(this.isEmpty()){
           System.out.println("Kuyruk Boş");
           return null;
       }else{
           
           String tmp = this.dizi[0];
           
           for(int i = 0; i < count-1; i++){
               this.dizi[i] = this.dizi[i+1];
           }
           count --;
           return tmp;
       }
        
    }
    
    public void push(String a){
        
        if(!this.isFull()){
            this.dizi[count] =a;
            count++;
        }else{
            System.out.println("Kuyruk Dolu!!");
        }
    }

    public Queue(int N) {
        this.dizi = new String[N] ;
        this.count = 0;
    }

    public String[] getDizi() {
        return dizi;
    }

    public void setDizi(String[] dizi) {
        this.dizi = dizi;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
