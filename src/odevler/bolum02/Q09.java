package odevler.bolum02;

import java.util.Scanner;

public class Q09 {
    /*
2.9 (Fizik: ivme) Ortalama ivme, hız değişiminin, bu değişimin gerçekleştiği süreye bölünmesiyle tanımlanır. Bu, aşağıdaki formülde gösterilmiştir:

                 a = (v1 - v0) / t

Kullanıcıdan başlangıç hızı v0'ı metre/saniye cinsinden, bitiş hızı v1'i metre/saniye cinsinden ve
zaman aralığı t'yi saniye cinsinden girmesini isteyen ve ortalama ivmeyi hesaplayıp gösteren bir program yazın.

ÖRNEK:
Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan başlangıç hızı, bitiş hızı ve zamanı girmesini isteyelim
        System.out.println("Enter v0, v1 and t: ");
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();

        // Ortalama ivmeyi hesaplayalım
        double a = (v1 - v0) / t;

        // Ortalama ivmeyi ekrana yazdıralım
        System.out.println("The average acceleration is " + a);
    }

}
