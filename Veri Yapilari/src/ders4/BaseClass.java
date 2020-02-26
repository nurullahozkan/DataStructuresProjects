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
public abstract class BaseClass {

    protected String[] dizi;
    protected int count;

    public BaseClass(int N) {
        this.dizi = new String[N];
        this.count = 0;
    }
    
    public BaseClass(){
        
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(dizi[i] + "-");
        }
        System.out.println("");
    }

    public boolean isFull() {
        if (count == dizi.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void push(String a) {

        if (!this.isFull()) {
            this.dizi[count] = a;
            count++;
        } else {
            System.out.println("Kuyruk Dolu!!");
        }
    }

}
