package odevler.bolum02;

import java.util.Scanner;

public class Q04 {
    /*
  2.4 (Pound'u kilograma çevir)
  Bir program yazın ve bu program pound'u kilograma çevirsin. Program, kullanıcıdan pound cinsinden bir değer girmesini ister, bu değeri kilograma çevirir ve sonucu ekrana yazdırır. Bir pound 0.454 kilogramdır.

  Örnek:
  Enter a number in pounds: 55.5
  55.5 pounds is 25.197 kilograms
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan pound cinsinden bir değer girmesini isteyelim
        System.out.println("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();

        // Pound'u kilograma çevirelim
        double kilograms = pounds * 0.454;

        // Kilogram değerini konsola yazdıralım
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
