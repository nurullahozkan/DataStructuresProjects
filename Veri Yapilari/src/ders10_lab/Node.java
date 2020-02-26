/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders10_lab;

/**
 *
 * @author Nurullah
 */
public class Node {
  int deger;
  Node sol;
  Node sag;
  int yukseklik;
  
  public Node(int deger){
      this.deger = deger;
      sol = null;
      sag = null;
      yukseklik = 0;
  }

    Node() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return " "+ deger ;
    }
    
    
}
