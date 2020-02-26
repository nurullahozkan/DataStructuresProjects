/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders12_lab;

/**
 *
 * @author Nurullah
 */
public class main {

    public static void main(String[] args) {
//        heapSort heap = new heapSort();
        int dizi[] = {10, 16, 3, 27, 39, 41, 4};
//        heap.yazdir(dizi, dizi.length);
//        heap.heapSort(dizi);
//        heap.yazdir(dizi, dizi.length);
//        heap.delete(dizi, dizi.length);
//        heap.yazdir(dizi, heap.delete(dizi, dizi.length));
////                heap.heapSort(dizi);
////
////        heap.delete(dizi, dizi.length);
////        heap.yazdir(dizi, dizi.length);
    heapSort h = new heapSort(dizi, dizi.length);
    h.heapSort();
    h.yazdir();

    }

}
