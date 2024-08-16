package odevler.bolum02;

import java.util.Scanner;

public class Q10 {
    /*
2.10 (Bilim: enerji hesaplama) Suyu başlangıç sıcaklığından son sıcaklığa kadar ısıtmak için gereken enerjiyi hesaplayan bir program yazın. Programınız, kullanıcının su miktarını kilogram cinsinden ve suyun başlangıç ve son sıcaklıklarını girmesini istemelidir. Enerjiyi hesaplamak için kullanılan formül şudur:

Q = M * (finalTemperature – initialTemperature) * 4184

Burada M, suyun ağırlığıdır (kilogram cinsinden), sıcaklıklar derece Celsius cinsindendir ve enerji Q, joule cinsinden ölçülür.

ÖRNEK:
Enter the amount of water in kilograms: 55.5
Enter the initial temperature: 3.5
Enter the final temperature: 10.5
The energy needed is 1625484.0
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan su miktarını girmesini isteyelim
        System.out.println("Enter the amount of water in kilograms: ");
        double amountWater = scanner.nextDouble();

        // Kullanıcıdan suyun baslangıç sıcaklığını girmesini isteyelim
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();

        // Kullanıcıdan suyun son sıcaklığını girmesini isteyelim
        System.out.println("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        // Enerjiyi hesaplayalım
        double energy = amountWater * (finalTemperature - initialTemperature) * 4184;

        // Enerjiyi ekrana yazdıralım
        System.out.println("The energy needed is " + energy);

    }
}
