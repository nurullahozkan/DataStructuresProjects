/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5_lab;

/**
 *
 * @author Nurullah
 */
public class BagliListe {
     public Node ilk;
    public Node son;
    public int elemansayisi;

    public BagliListe() {
        this.elemansayisi = 0;
    }

    public void basaEkle(Node n) {

        n.next = ilk;
        ilk = n;
        if (this.elemansayisi == 0) {
            son = n;
        }
        this.elemansayisi++;
    }

    public void sonaEkle(Node n) {

    }

    public void arayaEkle(Node n) {

    }

    public void bastanSil() {

    }

    public Node pop() {
        if (elemansayisi == 1) {
            Node tmp =ilk;
            ilk = null;
            son = null;
            elemansayisi--;
            return tmp;
        } else if (elemansayisi == 0) {
            System.out.println("Liste Boş");
            return null;
        } else {

            Node tmp = ilk;
            while (tmp.next != son) {
                tmp = tmp.next;
            }
            Node tmp2=tmp.next;
            tmp.next = null;
            son = tmp;
            elemansayisi--;
            return tmp2;
        }
    }

    public void aradanSil(Human h) {

    }

    public void yazdir() {
        Node tmp = this.ilk;

        while (tmp != null) {

            System.out.print(tmp.human);
            tmp = tmp.next;
        }
        System.out.println("");
    }

}
