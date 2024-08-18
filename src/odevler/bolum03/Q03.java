package odevler.bolum03;

import java.util.Scanner;

public class Q03 {
    /*
     * 3.3 (Cebir: 2 * 2 doğrusal denklem sistemi çözümü)
     *
     * 2 * 2 doğrusal denklem sisteminin çözümü için Programlama Soruları 1.13'te verilen
     * Cramer kuralını kullanabilirsiniz.
     *
     * Kullanıcıdan a, b, c, d, e, f değerlerini alan ve sonucu gösteren bir program yazınız.
     * Eğer, ad – bc 0 ise “Denklemin çözümü yoktur!” mesajını gösteriniz.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: 9.0 4.0 3.0 -5.0 -6.0 -21.0
     * Çıktı: x is -2.0 and y is 3.0
     *
     * Girdi: 1.0 2.0 2.0 4.0 4.0 5.0
     * Çıktı: The equation has no solution
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan degerleri isteyelim
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        // 2 * 2 doğrusal denklem sisteminin çözümü için x ve y'yi Cramer Kuralı ile hesaplayalım
        double denominator = (a * d) - (b * c);

        // Kullanıcıya eğer ad - bc = 0 ise "Denklemin çözümü yoktur!" mesajını verelim aksi durumda x ve y'yi ekrana yazdıralım
        if(denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            System.out.println("x is " + x + " and y is " + y);
        }



    }

}
