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
public class QueueBase extends BaseClass {

    
    public QueueBase(int N){
        super(N);
    }

    public String pop() {

        if (this.isEmpty()) {
            System.out.println("Kuyruk Boş");
            return null;
        } else {

            String tmp = this.dizi[0];

            for (int i = 0; i < count - 1; i++) {
                this.dizi[i] = this.dizi[i + 1];
            }
            count--;
            return tmp;
        }

    }

}
