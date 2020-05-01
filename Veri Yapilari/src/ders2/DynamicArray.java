package ders2;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        int input, count, x = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dizi boyutunu giriniz: ");
        count = scanner.nextInt();

        int array[] = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Dizinin " + x + ". değerini giriniz: ");
            input = scanner.nextInt();
            array[i] = input;
            x++;

        }

        for (int k = 0; k < array.length; k++) {
            System.out.println("dizi[" + k + "]= " + array[k]);

        }
        System.out.print("Diziye eklenecek değeri giriniz: ");
        int b = scanner.nextInt();
        System.out.print("Bu değer dizinin hangi indisine eklenecek :");
        int a = scanner.nextInt();

        int array2[] = new int[count + 1];

        for (int y = 0; y < array.length; y++) {
            array2[y] = array[y];
           
        }

        for (int k = 0; k < array2.length; k++) {
            if (a == k) {
                int tmp = array2[k];
                int tmp2 = array[array.length-1];
                array2[k] = b;
                array2[k + 1] = tmp;
                for (int i = k + 1; i < array2.length - 1; i++) {
                    array2[i + 1] = array2[i];
                    array2[array2.length-1] = tmp2;
                }
            }
            System.out.println("dizi[" + k + "]= " + array2[k]);

        }
    }
}
