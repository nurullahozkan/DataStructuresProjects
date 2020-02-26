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
public class Human {
    
    String ad;

    public Human(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "ad : "+ this.ad;
    }
        
    
}
