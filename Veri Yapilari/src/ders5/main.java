/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5;

import ders5.bl.BagliListe;
import ders5.bl.Dugum;

/**
 *
 * @author Nurullah
 */
public class main {

    public static void main(String[] args) {

        BagliListe bl = new BagliListe();

        /*  bl.arayaEkle(new Dugum(new Human("Ali", 20)));
        bl.print();
        bl.arayaEkle(new Dugum(new Human("Mehmet", 18)));
        bl.print();
        
        System.out.println("--------------------------");
        
        bl.arayaEkle(new Dugum(new Human("Ahmet", 25)));
        bl.print();
        bl.arayaEkle(new Dugum(new Human("Ahmet", 21)));
        bl.print();
        bl.sondanSil();
        bl.print();
        bl.sondanSil();
        bl.print();
        bl.sondanSil();
        bl.print();*/
//      Dugum d1 = new Dugum(new Human("Deneme", 35));
//      Dugum d2 = new Dugum(new Human("Deneme", 35));
//      
//      if(d1.equals(d2)){
//          System.err.println("eşit");
//      }
     /*   bl.basaEkle(new Dugum(new Human("Ali", 20)));
        bl.print();
        bl.basaEkle(new Dugum(new Human("Mehmet", 18)));
        bl.print();
        bl.basaEkle(new Dugum(new Human("Murat", 25)));
        bl.print();
        bl.basaEkle(new Dugum(new Human("Ahmet", 22)));
        bl.print();
        
        bl.aradanSil(new Dugum(new Human("Ali", 20)));
        bl.print();
        */
     
     bl.arayaEkle(new Dugum(new Human("Serkan", 20)));
     bl.print();
     bl.arayaEkle(new Dugum(new Human("Ahmet", 30)));
     bl.print();
    

    }
}
