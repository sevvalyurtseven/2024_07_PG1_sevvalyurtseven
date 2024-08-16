package odevler.bolum02;

import java.util.Scanner;

public class Q01 {
    /*
  2.1 (Celsius'u Fahrenheit'e Dönüştürme)
  Konsoldan double türünde bir Celsius derecesi okuyan,ardından bunu Fahrenheit'e çevirip sonucu gösteren bir program yazın.
                  Dönüşüm formülü şu şekildedir:

                 fahrenheit = (9 / 5) * celsius + 32

  İpucu: Java'da 9 / 5, 1'dir, ancak 9.0 / 5, 1.8'dir.

                    İşte örnek bir çalışma:

                   Konsola bir derece girin: 43
                   43 Celsius, 109.4 Fahrenheit'tir.
*/
    public static void main(String[] args) {
        // Konsoldan giriş almak için bir Scanner nesnesi oluşturalım
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir Celsius derecesi girmesini isteyelim
        System.out.println("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();

        // Celsius'u Fahrenheit'a çevirelim
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Cevabı konsola yazdıralım
        System.out.println((int)celsius + " Celcius is " + fahrenheit + " Fahrenheit");

    }
}
