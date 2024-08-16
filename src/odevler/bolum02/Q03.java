package odevler.bolum02;

import java.util.Scanner;

public class Q03 {
    /*
  2.3 (Feet'i metreye dönüştür)
  Kullanıcıdan feet değerini alan ve bunun metre karşılığını hesaplayıp gösteren bir program yazınız.
  Bir feet 0.305 metredir.

  Örnek:
  Enter a value for feet: 16.5
  16.5 feet is 5.0325 meters
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan feet değerini girmesini isteyelim
        System.out.println("Enter a value for feet: ");
        double feet = scanner.nextDouble();

        // feet'i metreye dönüştürelim
        double meters = feet * 0.305;

        // Metreyi konsola yazdıralım
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
