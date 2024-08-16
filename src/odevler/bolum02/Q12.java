package odevler.bolum02;

import java.util.Scanner;

public class Q12 {
    /*
2.12 (Fizik: pist uzunluğunu bulma) Bir uçağın ivmesi (a) ve kalkış hızı (v) verildiğinde, bir uçağın kalkış yapması için gerekli minimum pist uzunluğunu şu formülü kullanarak hesaplayabilirsiniz:

           v^2
  length = -----
          2 * a

Kullanıcıdan v değerini metre/saniye (m/s) cinsinden ve ivmeyi (a) metre/saniye kare (m/s^2) cinsinden girmesini isteyen ve minimum pist uzunluğunu gösteren bir program yazın.

ÖRNEK:
Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kalkış hızı ve ivme bilgilerini alalım
        System.out.println("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        // Minimum pist uzunluğunu hesaplayalım
       double length = Math.pow(speed,2) / (2 * acceleration);

        // Minimum pist uzunluğunu ekrana yazdıralım
        System.out.println("The minimum runway length for this airplane is " + length);
    }


}
