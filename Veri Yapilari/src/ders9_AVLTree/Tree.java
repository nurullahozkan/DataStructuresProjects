/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9_AVLTree;

/**
 *
 * @author Nurullah
 */
public class Tree {

    Node kok;

    public Tree() {
        kok = null;
    }

/*    Node Ara(int aranan) {
        Node gecici = kok;
        while (gecici != null) {
            if (gecici.deger == aranan) {
                return gecici;
            } else if (aranan < gecici.deger) {
                gecici = gecici.sol;
            } else {
                gecici = gecici.sag;
            }
        }
        return null;
    }
*/
    
    public int countNode(Node root){
        if(root == null)
            return 0;
        return 1 + countNode(root.sol) + countNode(root.sag);
    }
    
    Node AraRecursive(Node kok, int aranan) {
        if (kok == null) {
            return null;
        }
        if (kok.deger == aranan) {
            return kok;
        } else {
            if (aranan > kok.deger) {
                return AraRecursive(kok.sag, aranan);
            } else {
                return AraRecursive(kok.sol, aranan);
            }
        }
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

    public void InOrder(Node kok) {
        if (kok != null) {
            InOrder(kok.sol);
            System.out.print(kok.deger+" ");
            InOrder(kok.sag);
        }
    }

    public Node Sil(Node kok, int deger) {
        if (kok == null) {
            return null;
        }
        if (deger < kok.deger) {
            kok.sol = Sil(kok.sol, deger);
        } else if (deger > kok.deger) {
            kok.sag = Sil(kok.sag, deger);
        } else {
            if (kok.sol != null && kok.sag != null) {

                Node enb = EnBuyukBul(kok.sol);
                kok.deger = enb.deger;
                kok.sol = Sil(kok.sol, kok.deger);

            } else if (kok.sol != null) {
                kok = kok.sol;
            } else {
                kok = kok.sag;
            }
        }
        return kok;
    }

    public Node EnBuyukBul(Node kok) {
        if (kok.sag == null) {
            return kok;
        } else {
            return EnBuyukBul(kok.sag);
        }
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

    public Node EnKucukBul(Node kok) {
        if (kok.sol == null) {
            return kok;
        } else {
            return EnKucukBul(kok.sol);
        }
    }

    private Node solaDondur(Node dugum) {
        Node n = dugum.sag;
        Node temp = n.sol;

        n.sol = dugum;
        dugum.sag = temp;

        int solYuksek = yukseklikBul(dugum.sol);
        int sagYuksek = yukseklikBul(dugum.sag);
        dugum.yukseklik = max(solYuksek, sagYuksek) + 1;

        int solYuksek2 = yukseklikBul(n.sol);
        int sagYuksek2 = yukseklikBul(n.sag);
        n.yukseklik = max(solYuksek2, sagYuksek2) + 1;

        return n;
    }

    private Node sagaDondur(Node dugum) {
        Node n = dugum.sol;
        Node temp = n.sag;

        n.sag = dugum;
        dugum.sol = temp;

        dugum.yukseklik = max(yukseklikBul(dugum.sol), yukseklikBul(dugum.sag)) + 1;
        n.yukseklik = max(yukseklikBul(n.sol), yukseklikBul(n.sag)) + 1;

        return n;

    }

}
