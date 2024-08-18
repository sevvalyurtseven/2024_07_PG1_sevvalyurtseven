package odevler.bolum03;

import java.util.Scanner;

public class Q07 {
    /*
     * 3.7 (Finans uygulaması: para birimi)
     *
     * Madde 2.10, ComputeChange.java dosyasını yeniden düzenleyerek,
     * sonuç 1 ise bunu tekil kelime yani "1 dollar" ya da "1 penny",
     * sonuç 1'den büyükse bunu çoğul kelime "2 dollars" ya da "3 pennies" gibi gösterecek
     * ve eğer sonuç sıfır ise bunu göstermeyecek şekilde düzenleyiniz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan para miktarını ve para birimini alalım
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = scanner.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Dolar miktarını hesaplayalım
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Kalan paradaki 25 kurusları hesaplayalım
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Kalan paradaki 10 kurusları hesaplayalım
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Kalan paradaki 1 kurusları hesaplayalım
        int numberOfPennies = remainingAmount;

        // Para birimini ekrana yazdıralım
        System.out.println("Your amount " + amount + " consists of");

        if(numberOfOneDollars > 0){
            System.out.println(numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar" : " dollars"));
        }
        if(numberOfQuarters > 0){
            System.out.println(numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
        }
        if(numberOfDimes > 0){
            System.out.println(numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes"));
        }
        if(numberOfPennies > 0){
            System.out.println(numberOfPennies + (numberOfPennies == 1 ? " penny" : " pennies"));
        }
    }
}
