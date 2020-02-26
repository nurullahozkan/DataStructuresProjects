package ders2_lab;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Hesapla h = new Hesapla();
        Scanner sn = new Scanner(System.in);

        System.out.println("Toplama : 1 ");
        System.out.println("Çıkarma : 2 ");
        System.out.println("Çarpma : 3 ");
        System.out.println("Bölme : 4 ");
       

        int islem;
        int a;
        int b;

        System.out.println(" İşlem seçiniz");
        islem = sn.nextInt();

        switch (islem) {

            case 1:
                System.out.println("Toplanacak sayıları giriniz ");
                 a = sn.nextInt();
                 b = sn.nextInt();

                h.toplama(a, b);
                break;

            case 2:
                System.out.println("Cıkarılacak sayıları giriniz ");
                a = sn.nextInt();
                b = sn.nextInt();

                h.cıkarma(a, b);
                break;

            case 3:
                System.out.println("Çarpılacak sayıları giriniz");
                a = sn.nextInt();
                b = sn.nextInt();

                h.carpma(a, b);
                break;

            case 4:
                System.out.println("Bölünecek sayıları giriniz");
                a = sn.nextInt();
                b = sn.nextInt();

                h.bolme(a, b);
                break;
                
                
                default:
                    System.out.println("İşlem bulunamadı!!!");
                    break;

        }

    }

}
