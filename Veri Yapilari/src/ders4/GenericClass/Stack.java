/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4.GenericClass;

/**
 *
 * @author Nurullah
 */
public class Stack<T> extends GenericClass<T>{
    
    public Stack(Class<T> c, int N) {
        super(c, N);
    }
    public T pop() {
        
       if(this.isEmpty()){
           System.out.println("Yığıt Boş");
           return null;
       }else{
           
           T tmp = this.dizi[--count];
           return tmp;
       }
        
    }
}
