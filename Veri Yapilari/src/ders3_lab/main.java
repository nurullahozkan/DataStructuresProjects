/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders3_lab;

/**
 *
 * @author Nurullah
 */
/*

1- bir sınıf oluşturulacak, sınıfın içerisinde 3 sıralama algoritması yazılacak
2- sınıfın yapılandırıcısı olacak ve int dizisi arguman olarak verilecek.
daha sonra hangi sıralama algoritması çağırılacağına karar verilecek.
3- sınıfın bir instance olacak Sıralama s = new Sıralama(int[] dizi);
s.bubblesort();
4- sıralama olgoritması için metod yazılacak.
5- ekrana yazdırma metodu yazılacak.

 */
public class main {

    public static void main(String[] args) {

        int[] dizi = {5, 4, 3, 33, 1, 15, 20, 9, 8 ,7};

        Sıralama s = new Sıralama(dizi);
        s.yazdir(dizi);
        s.Bubble_Sort(dizi);
        s.yazdir(dizi);

    }

}
