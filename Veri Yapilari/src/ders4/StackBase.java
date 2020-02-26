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
public class StackBase extends BaseClass{
    
    public StackBase(int N) {  
        super(N);
    }
    
    public String pop() {
        
       if(this.isEmpty()){
           System.out.println("Yığıt Boş");
           return null;
       }else{
           
           String tmp = this.dizi[--count];
           return tmp;
       }
        
    }
       
}
