package odevler.bolum03;

import java.util.Scanner;

public class Q26 {
    /*
     * 3.26 (&&, || ve ^ operatörlerini kullanma)
     *
     * Kullanıcıdan bir tamsayı alan ve bu sayının:
     * - 5 ve 6 ile bölünüp bölünmediğini,
     * - 5 veya 6 ile bölünüp bölünmediğini,
     * - 5 veya 6 ile bölündüğünü, fakat ikisiyle birden bölünmediğini
     * kontrol eden bir program yazınız.
     *
     * Programın örnek çalışması:
     *
     * Girdi: Enter an integer: 10
     *
     * Çıktılar:
     * Is 10 divisible by 5 and 6? false
     * Is 10 divisible by 5 or 6? true
     * Is 10 divisible by 5 or 6, but not both? true
     *
     * Not:
     * - "&&" operatörü, iki koşulun da doğru olması durumunda true döner.
     * - "||" operatörü, iki koşuldan en az birinin doğru olması durumunda true döner.
     * - "^" operatörü, iki koşuldan yalnızca biri doğruysa true döner.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girmesini isteyelim
        System.out.println("Enter as an integer: ");
        int number = scanner.nextInt();

        // Bölünebilme durumlarını kontrol edelim
        boolean divisibleBy5And6 = number % 5 == 0 && number % 6 == 0;
        boolean divisibleBy5Or6 = number % 5 == 0 || number % 6 == 0;
        boolean divisibleBy5Or6ButNotBoth = number % 5 == 0 ^ number % 6 == 0;

        // Sonucu yazdıralım
        System.out.println("Is " + number + " divisible by 5 and 6? " + divisibleBy5And6);
        System.out.println("Is " + number + " divisible by 5 or 6? " + divisibleBy5Or6);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisibleBy5Or6ButNotBoth);
    }
}
