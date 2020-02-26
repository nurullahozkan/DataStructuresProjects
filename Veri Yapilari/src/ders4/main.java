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
public class main {
    
    public static void main(String[] args) {
        
       // String [] dizi = {"A", "B", "C","D"};
       /* Queue q = new Queue(10);
        q.printQueue();
        
        q.push("A");
        q.printQueue();
        q.push("B");
        q.printQueue();
        q.pop();
        q.printQueue();
*/
       
       Stack q = new Stack(10);
       
       
        q.push("A");
        q.printQueue();
        q.push("B");
        q.printQueue();
        q.push("C");
        q.printQueue();
        q.pop();
        q.printQueue();
        q.push("D");
        q.printQueue();
       
        
    }
    
}
