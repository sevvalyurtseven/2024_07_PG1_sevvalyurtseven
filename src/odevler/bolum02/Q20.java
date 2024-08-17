package odevler.bolum02;

import java.util.Scanner;

public class Q20 {
    /*
2.20 (Finans uygulaması: Faiz Hesaplama) Bakiye ve yıllık faiz oranını biliyorsak aşağıdaki formülü kullanarak bir sonraki ay elde edilecek faiz geliri hesap edilebilir.

                interest = balance * (annualInterestRate/1200)

                faizGetirisi = bakiye * (yillikFaizOrani / 1200)

Kullanıcıdan, bakiye ve yıllık faiz oranını isteyen ve bir sonraki ay için elde edilecek faiz gelirini hesaplayan bir program yazınız.

ÖRNEK:
Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
The interest is 2.91667
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bakiye ve yıllık faiz oranını girmesini isteyelim
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        // Aşağıdaki formülü kullanarak bir sonraki ay elde edilecek faiz geliri hesaplayalım
        double interest = balance * (annualInterestRate / 1200);

        // Sonucu konsola yazdıralım
        System.out.println("The interest is " + interest);

    }
}
