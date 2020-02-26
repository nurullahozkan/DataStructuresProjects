/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4.GenericClass;

import java.lang.reflect.Array;

/**
 *
 * @author Nurullah
 */
public abstract class GenericClass<T> {

    protected T[] dizi;
    protected int count;
    protected Class<T> entity;
    
    public GenericClass(Class<T> c, int N) {
        this.entity = c;
        this.dizi = (T[]) Array.newInstance(entity, N);
        //this.count = 0;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(dizi[i]);
        }
        System.out.println("----------------");
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


    public void push(T instsance) {

        if (!this.isFull()) {
            this.dizi[count] = instsance;
            count++;
        } else {
            System.out.println("Kuyruk Dolu!!");
        }
    }

}
