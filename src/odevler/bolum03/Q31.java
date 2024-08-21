package odevler.bolum03;

import java.util.Scanner;

public class Q31 {
    /*
     * 3.31 (Finans: Döviz Değişimi)
     *
     * Kullanıcıdan ABD doları ile Çin yuanı (RMB) arasındaki döviz kuru oranını isteyen
     * ve ardından kullanıcıya aşağıdaki seçenekleri sunan bir program yazınız:
     * - 0: ABD dolarını Çin yuanına dönüştürmek.
     * - 1: Çin yuanını ABD dolarına dönüştürmek.
     *
     * Kullanıcıya hangi seçeneği seçtiğini sorduktan sonra, seçimine göre ilgili para
     * biriminde bir miktar girmesini isteyiniz ve bu miktarı diğer para birimine
     * dönüştürünüz.
     *
     * Örnek Girdi ve Çıktılar:
     *
     * Girdi: Enter the exchange rate from dollars to RMB: 6.81
     *        Enter 0 to convert dollars to RMB and 1 vice versa: 0
     *        Enter the dollar amount: 100
     * Çıktı: $100.0 is 681.0 yuan
     *
     * Girdi: Enter the exchange rate from dollars to RMB: 6.81
     *        Enter 0 to convert dollars to RMB and 1 vice versa: 1
     *        Enter the RMB amount: 10000
     * Çıktı: 10000.0 yuan is $1468.43
     *
     * Girdi: Enter the exchange rate from dollars to RMB: 6.81
     *        Enter 0 to convert dollars to RMB and 1 vice versa: 5
     * Çıktı: Incorrect input
     *
     * İpucu:
     * - Eğer kullanıcı 0 girerse, ABD doları miktarını Çin yuanına dönüştürün
     *   ve sonucu ekrana yazdırın.
     * - Eğer kullanıcı 1 girerse, Çin yuanı miktarını ABD dolarına dönüştürün
     *   ve sonucu ekrana yazdırın.
     * - Eğer kullanıcı geçersiz bir giriş yaparsa, "Incorrect input" mesajını gösterin.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan döviz kuru oranını, yapmak istediği döviz değişimini ve miktarını girmesini isteyelim
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = scanner.nextInt();
        System.out.println("Enter the " + (choice == 0 ? "Dollars" : "RMB") + " amount: ");
        double amount = scanner.nextDouble();

        // Eğer kullanıcı 0 girerse, ABD doları miktarını Çin yuanına dönüştürun ve sonucu ekrana yazdırın
        // Eğer kullanıcı 1 girerse, Çin yuanı miktarını ABD dolarına dönüştüru ve sonucu ekrana yazdırın
        // Eğer kullanıcı geçersiz bir giriş yaparsa, "Incorrect input" mesajını gösterin
        if(choice == 0) {
            System.out.println("$" + amount + " is " + (amount * exchangeRate) + " yuan");
        } else if (choice == 1){
            System.out.println(amount + " yuan is $" + (amount / exchangeRate) + " dollars");
        } else {
            System.out.println("Incorrect input");
        }
    }
}
