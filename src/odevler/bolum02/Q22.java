package odevler.bolum02;

import java.util.Scanner;

public class Q22 {
    /*
2.22 (Finans uygulaması: Para Birimi) double’dan int’e yapılan tür dönüşümünde değer kaybını engellemek için yeniden düzenleme yapınız. Girilen tam sayının son iki basamağı kuruşu temsil etsin.

Örneğin,
1156 girişi 11 dolar ve 56 kuruşu temsil eder.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan para miktarını girmesini isteyelim
        System.out.println("Enter an amount as an integer, for example 1156: ");
        int amount = scanner.nextInt();

        // Tam sayı olarak alınan miktarın kuruşunu ve dolarını bul
        int numberOfDollars = amount / 100;
        int numberOfCents = amount % 100;

        // Kalan miktar üzerinden çeyreklik, onluk ve beş kuruşları bul
        int numberOfQuarterCents = numberOfCents / 25;
        numberOfCents = numberOfCents % 25;
        int numberOfDimeCents = numberOfCents / 10;
        numberOfCents = numberOfCents % 10;
        int numberOfNickelCents = numberOfCents / 5;
        numberOfCents = numberOfCents % 5;

        // Kalan miktar kuruşları temsil eder
        int numberOfPennies = numberOfCents;

        // Doları ve kuruşları ekrana yazdıralım
        System.out.println("Your amount " + numberOfDollars + " dollars, " + numberOfQuarterCents + " quartercents, " + numberOfDimeCents + " dimecents, " + numberOfNickelCents + " nickelcents, and " + numberOfPennies + " cents");
    }
}
