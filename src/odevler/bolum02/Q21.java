package odevler.bolum02;

import java.util.Scanner;

public class Q21 {
    /*
2.21 (Finans uygulaması: Yatırımın Geri Dönüş Değeri) Kullanıcıdan yatırım miktarı, yıllık faiz oranı ve yıl sayısını isteyen ve aşağıdaki formülü kullanarak yatırımın geri dönüş değerini hesaplayıp gösteren bir program yazınız.

          futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)

          yatiriminGeriDonusDegeri = yatirimMiktari * (1 + aylikFaizOrani)  yilSayisi * 12


Örneğin, miktar 1000, yıllık faiz oranı %3.25 ve yıl sayısı 1 olarak girilirse yatırımın getirisi 1032.98 olacaktır.


For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.

ÖRNEK:
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is 1043.92
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yatırım miktarı, yıllık faiz oranı ve yıl sayısını girmesini isteyelim
        System.out.println("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();

        // Aylık faiz oranını tanımlayalım
        double monthlyInterestRate = annualInterestRate / 1200;

        // Yatırımın geri dönüş değerini hesaplayalım
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);

        // Sonuçu ekrana yazdıralım
        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
