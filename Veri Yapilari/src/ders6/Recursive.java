/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders6;

import java.util.Scanner;

/**
 *
 * @author Nurullah
 */
public class Recursive {
    
    public static int Faktoriyel(int sayi){
        
        if(sayi >= 1){
            return sayi*Faktoriyel(sayi-1);
        }else{
            
        return 1;
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Sayi Girin");
        int x = Faktoriyel(sn.nextInt());
        System.out.println(x);
     
    }
    
}
