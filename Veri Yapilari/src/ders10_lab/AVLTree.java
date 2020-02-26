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
public class AVLTree {

    Node kok;

    public AVLTree() {
        kok = null;
    }
    
    private Node EkleRecursive(Node kok, int deger) {
        if (kok == null) {
            kok = new Node(deger);

        } else if (deger > kok.deger) {
            kok.sag = EkleRecursive(kok.sag, deger);
        } else if (deger < kok.deger) {
            kok.sol = EkleRecursive(kok.sol, deger);
        }
        // 1. dugum yuksekligi hesapla
        kok.yukseklik = 1 + max(yukseklikBul(kok.sol), yukseklikBul(kok.sag));
        // 2. dengeli mi kontrol et
        int denge = dengeBul(kok);
        // 3. dengeli degilse rotasyon yap

        //sol dengesizlik 
        if (denge > 1 && deger < kok.sol.deger) {
            return sagaDondur(kok);
        }

        //sag dengesizlik
        if (denge < -1 && deger > kok.sag.deger) {
            return solaDondur(kok);
        }

        //sol sag durumu
        if (denge > 1 && deger > kok.sol.deger) {
            kok.sol = solaDondur(kok.sol);
            return sagaDondur(kok);
        }
        //sag sol durumu 
        if (denge < -1 && deger < kok.sag.deger) {
            kok.sag = sagaDondur(kok.sag);
            return solaDondur(kok);
        }

        return kok;
    }

    private int yukseklikBul(Node dugum) {
        //dugum yuksekligini getir
        //dugum yoksa 0
        if (dugum == null) {
            return 0;
        } else {
            return dugum.yukseklik;
        }
    }

    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public void DegerEkle(int deger) {
        this.kok = EkleRecursive(this.kok, deger);
    }
    
    private int dengeBul(Node dugum) {
        //Gelen  dugumun dengesini hesapla
        //sol ve sag çocuklari arasındaki yukseklik faki 
        if (dugum == null) {
            return 0;
        } else {
            int denge = yukseklikBul(dugum.sol) - yukseklikBul(dugum.sag);
            return denge;
        }
    }

    private Node solaDondur(Node dugum) {
        Node n = dugum.sag;
        Node temp = n.sol;

        n.sol = dugum;
        dugum.sag = temp;
        
        dugum.yukseklik = max(yukseklikBul(dugum.sol), yukseklikBul(dugum.sag)) +1;
        n.yukseklik = max(yukseklikBul(dugum.sol), yukseklikBul(dugum.sag)) +1;

        return n;
    }

    private Node sagaDondur(Node dugum) {
        Node n = dugum.sol;
        Node temp = n.sag;

        n.sag = dugum;
        dugum.sol = temp;

        dugum.yukseklik = max(yukseklikBul(dugum.sol), yukseklikBul(dugum.sag)) +1;
        n.yukseklik = max(yukseklikBul(n.sol), yukseklikBul(n.sag)) +1;

        return n;

    }
    
    public Node araRecursive(Node kok, int aranan){
        if(kok == null){
            return null;
        }else{
            if(kok.deger == aranan){
                return kok;
            }else if(aranan < kok.deger){
                return araRecursive(kok.sol, aranan);
            }else {
                return araRecursive(kok.sag, aranan);
            }
        }
    }
    
     public void InOrder(Node kok) {
        if (kok != null) {
            InOrder(kok.sol);
            System.out.print(kok.deger+" ");
            InOrder(kok.sag);
        }
    }
    

}
