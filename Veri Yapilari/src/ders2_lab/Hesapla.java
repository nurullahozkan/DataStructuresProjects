package ders2_lab;

public class Hesapla {

    int x;

    public void toplama(int a, int b) {

        x = a + b;
        System.out.println("toplamanın sonucu : " + x);
    }

    public void cıkarma(int a, int b) {

        x = a - b;
        System.out.println("cıkarmanın sonucu : " + x);

    }

    public void carpma(int a, int b) {

        x = a * b;
        System.out.println("carmanın sonucu : " + x);

    }

    public void bolme(int a, int b) {

        float y = (float) a;
        float z = (float) b;
        float c = y / z;
        System.out.println("bolmenin sonucu : " + c);

    }

}
