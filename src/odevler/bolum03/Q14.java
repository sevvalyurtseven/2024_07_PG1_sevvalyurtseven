package odevler.bolum03;

import java.util.Scanner;

public class Q14 {
    /*
     * 3.14 (Oyun: yazı tura)
     *
     * Kullanıcıyla yazı-tura tahmin oyunu oynayan bir program yazınız.
     * Program rastgele 0 (tura) ya da 1 (yazı) değerlerini üretsin.
     * Kullanıcıdan tahmini alınız ve doğru olup olmadığını gösteriniz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rastgele 0 (tura) ya da 1 (yazı) değerlerini üretelim
        int randomNumber = (int) (Math.random() * 2);

        // Kullanıcıdan tahmin alalım
        System.out.println("Yazı mı tura mı? (0 - Tura, 1 - Yazı): ");
        int guess = scanner.nextInt();

        // Tahminin doğrulugunu kontrol edelim
        if(guess == randomNumber){
            System.out.println("Tebrikler, dogru tahmin ettiniz!");
        } else {
            System.out.println("Yanlış tahmin ettiniz!");
        }
    }
}
