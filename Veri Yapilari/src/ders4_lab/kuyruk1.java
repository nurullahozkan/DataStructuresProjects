/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4_lab;

/**
 *
 * @author Nurullah
 */
public class kuyruk1 {

    public int[] dizi;
    public int count;
    public int diziboyutu;
    stack s1;
    kuyruk2 q1;

    public kuyruk1(int diziboyutu) {
        this.diziboyutu = diziboyutu;
        this.dizi = new int[diziboyutu];
        this.s1 = new stack(diziboyutu);
        this.q1 = new kuyruk2(diziboyutu);
        this.count = 0;
    }

   public void push(int sayi) {
        if (count == diziboyutu) {
           if(s1.diziboyutu==s1.count){
              if(q1.count==q1.diziboyutu){
                  System.out.println("Herbiji dolu");
              }
              else{
                    q1.push(sayi);
              }
           }
           else{
                s1.push(this.pop());
            dizi[count++] = sayi;
           }
        }
        else{
            dizi[count++] = sayi;
        }
    }

    public int pop() {
        if (count == 0) {
            return 0;
        } else {
            int tmp = dizi[0];
            for (int i = 0; i < count - 1; i++) {
                dizi[i] = dizi[i + 1];
            }
            count--;
            return tmp;
        }
    }
    public void yazdir(){
        for(int i=0;i<count;i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<s1.count;i++){
            System.out.print(s1.dizi[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<s1.count;i++){
            System.out.print(q1.dizi[i]+" ");
        }
        System.out.println("");
    }

}
