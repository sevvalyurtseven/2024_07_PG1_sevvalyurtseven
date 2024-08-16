package odevler.bolum02;

import java.util.Scanner;

public class Q05 {
    /*
  2.5 (Finansal uygulama: bahşiş hesaplama)
  Bir program yazın, bu program alt toplam (subtotal) ve bahşiş oranını (gratuity rate) okur, ardından bahşiş miktarını ve toplamı hesaplar. Örneğin, kullanıcı alt toplam için 10 ve bahşiş oranı için %15 girerse, program $1.5 bahşiş ve $11.5 toplam tutarını ekrana yazdırır.

  Örnek:
  Enter the subtotal and a gratuity rate: 10 15
  The gratuity is $1.5 and total is $11.5
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan subtotal ve gratuity rate'i girmesini isteyelim
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();

        // Gratuity'i hesaplayalım
        double gratuity = subtotal * (gratuityRate / 100);

        // Bahsiş miktarını ve toplamını konsola yazdıralım
        System.out.println("The gratuity is $" + gratuity + " and total is $" + (subtotal + gratuity));
    }

}
