/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5.bl;

/**
 *
 * @author Nurullah
 */
public class BagliListe {

    public Dugum ilk;
    public Dugum son;
    public int elemanSayisi;

    public BagliListe() {
        this.elemanSayisi = 0;
    }

    public void basaEkle(Dugum n) {
        n.sonraki = ilk;
        ilk = n;
        if (this.elemanSayisi == 0) {
            son = n;
        }
        this.elemanSayisi++;
    }

    public void sonaEkle(Dugum n) {
        if (this.elemanSayisi == 0) {
            this.basaEkle(n);
        } else {

            son.sonraki = n;
            son = n;
            this.elemanSayisi++;
        }
    }

    public void arayaEkle(Dugum n) {
        if (this.elemanSayisi == 0) {
            this.basaEkle(n);
        } else {

            if (ilk.deger.getAge() > n.deger.getAge()) {
                this.basaEkle(n);
            }
            Dugum tmp = ilk;
            while (tmp.sonraki != null && tmp.sonraki.deger.getAge() < n.deger.getAge()) {  // yaşa göre sıralı ekleme için kontrol yazdık
                tmp = tmp.sonraki;
            }
            if (tmp == son) {
                this.sonaEkle(n);
            } else {
                n.sonraki = tmp.sonraki;
                tmp.sonraki = n;
                this.elemanSayisi++;
            }
        }
    }

    public Dugum bastanSil() {

        if (this.elemanSayisi == 0) {
            System.out.println("Liste Boş");
            return null;
        } else {
            Dugum tmp = ilk;
            ilk = ilk.sonraki;
            this.elemanSayisi--;
            return tmp;
        }

    }

    public Dugum sondanSil() {
        if (this.elemanSayisi == 0) {
            System.out.println("Liste Boş");
            return null;
        }
        if (ilk == son) {
            Dugum tmp = ilk;
            ilk = null;
            son = null;
            this.elemanSayisi--;
            return tmp;

        }

        Dugum tmp = ilk;

        while (tmp.sonraki != son) {
            tmp = tmp.sonraki;
        }

        Dugum ret = tmp.sonraki;
        son = tmp;
        son.sonraki = null;
        this.elemanSayisi--;
        return ret;

    }

    public Dugum aradanSil(Dugum d) {
        if (this.elemanSayisi == 0) {
            System.out.print("Liste Boş");
            return null;
        }
        Dugum tmp = ilk;
        while (tmp.sonraki != null && !tmp.sonraki.equals(d)) {
            tmp = tmp.sonraki;

        }
        if (tmp.sonraki == null) {
            bastanSil();
            this.elemanSayisi--;
        }else{
            
        Dugum silinecek = tmp.sonraki;
        tmp.sonraki = tmp.sonraki.sonraki;
        this.elemanSayisi--;
        return null;
        }
            
        return null;
    }

    public void print() {
        Dugum tmp = this.ilk;

        while (tmp != null) {
            System.out.print(tmp.getDeger());
            tmp = tmp.getSonraki();
        }
        System.out.println("");
    }

    public Dugum getIlk() {
        return ilk;
    }

    public void setIlk(Dugum ilk) {
        this.ilk = ilk;
    }

    public Dugum getSon() {
        return son;
    }

    public void setSon(Dugum son) {
        this.son = son;
    }

    public int getElemanSayisi() {
        return elemanSayisi;
    }

    public void setElemanSayisi(int elemanSayisi) {
        this.elemanSayisi = elemanSayisi;
    }

}
