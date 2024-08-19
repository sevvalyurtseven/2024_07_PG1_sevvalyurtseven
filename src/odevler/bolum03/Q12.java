package odevler.bolum03;

import java.util.Scanner;

public class Q12 {
    /*
     * 3.12 (Palindrom sayılar)
     *
     * Kullanıcıdan üç basamaklı bir tam sayı alan ve bu sayının palindrom olup olmadığını
     * sınayan bir program yazınız. Eğer sayı sağdan-sola ve soldan-sağa aynı ise,
     * bu sayı palindromdur.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter a three-digit integer: 121
     * Çıktı: 121 is a palindrome
     *
     * Girdi: Enter a three-digit integer: 123
     * Çıktı: 123 is not a palindrome
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 basamaklı tam sayı girmesini isteyelim
        System.out.println("Enter a three-digit integer: ");
        int number = scanner.nextInt();

        // Girilen sayının ilk ve son basamagındaki rakamı bulalım
        int firstDigit = number / 100;
        int lastDigit = number % 10;

        // Girilen sayının palindrom olup olmadıgını kontrol edelim
        if(firstDigit == lastDigit){
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
