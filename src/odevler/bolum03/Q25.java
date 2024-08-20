package odevler.bolum03;

import java.util.Scanner;

public class Q25 {
    /*
     * 3.25 (Geometri: Kesişme Noktası)
     *
     * Bu program, iki doğru parçasının kesişim noktasını bulmak için Cramer Kuralı'nı kullanır.
     *
     * Verilenler:
     * - Birinci doğruya ait iki nokta: (x1, y1) ve (x2, y2)
     * - İkinci doğruya ait iki nokta: (x3, y3) ve (x4, y4)
     *
     * Amaç:
     * - Bu iki doğrunun kesişim noktasını bulmak veya doğruların paralel olup olmadığını belirlemek.
     *
     * İki doğru denklemi şu şekildedir:
     * 1) a1 * x + b1 * y = c1
     * 2) a2 * x + b2 * y = c2
     *
     * Burada,
     * - a1 = y1 - y2
     * - b1 = x2 - x1
     * - c1 = (y1 - y2) * x1 - (x1 - x2) * y1
     *
     * - a2 = y3 - y4
     * - b2 = x4 - x3
     * - c2 = (y3 - y4) * x3 - (x3 - x4) * y3
     *
     * Kesişim noktasını bulmak için Cramer Kuralı:
     *
     * x = (c1 * b2 - c2 * b1) / (a1 * b2 - a2 * b1)
     * y = (c2 * a1 - c1 * a2) / (a1 * b2 - a2 * b1)
     *
     * Eğer determinant (a1 * b2 - a2 * b1) sıfır ise, bu doğrular paraleldir ve kesişmezler.
     *
     * Programın akışı:
     * 1) Kullanıcıdan (x1, y1), (x2, y2), (x3, y3), (x4, y4) noktalarını alır.
     * 2) Katsayıları ve determinantı hesaplar.
     * 3) Eğer determinant sıfır değilse, kesişim noktasını hesaplar ve ekrana yazdırır.
     * 4) Eğer determinant sıfır ise, doğruların paralel olduğunu ekrana yazdırır.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
     * Çıktı: The intersecting point is at (2.88889, 1.1111)
     *
     * Girdi: Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
     * Çıktı: The two lines are parallel
     *
     * Program, tüm bu durumları kontrol edecek şekilde yazılmalıdır ve Cramer Kuralı
     * kullanılarak denklemler çözülmelidir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan x1, y1, x2, y2, x3, y3, x4, y4 bilgilerini alalım
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        // Cramer kuralı için gerekli katsayıları hesaplayalım
        double a1 = y1 - y2;
        double b1 = x2 - x1;
        double c1 = (y1 - y2) * x1 - (x1 - x2) * y1;

        double a2 = y3 - y4;
        double b2 = x4 - x3;
        double c2 = (y3 - y4) * x3 - (x3 - x4) * y3;

        // Determinantı hesaplayalım
        double determinant = a1 * b2 - a2 * b1;

        // Kesişim noktasını bulmak için Cramer Kuralı:
        double x = (c1 * b2 - c2 * b1) / determinant;
        double y = (c2 * a1 - c1 * a2) / determinant;

        if(determinant == 0) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
}
