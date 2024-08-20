package odevler.bolum03;

import java.util.Scanner;

public class Q28 {
    /*
     * 3.28 (Geometri: İki Dikdörtgen)
     *
     * Kullanıcıdan iki dikdörtgenin merkez x, y koordinatlarını, genişliklerini (width) ve yüksekliklerini (height) isteyen ve ikinci dikdörtgenin birinci dikdörtgenin içinde mi, birinci dikdörtgenle çakışıyor mu veya hiçbir ilişkisinin olmadığını belirleyen bir program yazınız.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
     *        Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
     * Çıktı: r2 is inside r1
     *
     * Girdi: Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
     *        Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
     * Çıktı: r2 overlaps r1
     *
     * Girdi: Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
     *        Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
     * Çıktı: r2 does not overlap r1
     *
     * İpucu:
     * - Bir dikdörtgenin içinde olup olmadığını kontrol etmek için:
     *
     *   1. r2'nin genişliğinin yarısı ile r1'in genişliğinin yarısının toplamı, r1'in merkezinden r2'nin merkezine olan x eksenindeki uzaklıktan büyük olmalıdır.
     *
     *   2. r2'nin yüksekliğinin yarısı ile r1'in yüksekliğinin yarısının toplamı, r1'in merkezinden r2'nin merkezine olan y eksenindeki uzaklıktan büyük olmalıdır.
     *
     *   3. Yukarıdaki iki koşul hem x hem de y eksenleri için sağlanıyorsa, r2, r1'in içindedir. Eğer sadece bir kısmı sağlanıyorsa, r2 r1 ile çakışır.
     *
     *   4. Hiçbir koşul sağlanmıyorsa, r2 r1 ile çakışmaz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 1. dökdörgenin merkez x, y koordinatlarını, genişliklerini (width) ve yüksekliklerini (height) isteyelim
        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        double centerX1 = scanner.nextDouble();
        double centerY1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();

        // Kullanıcıdan 2. dökdörgenin merkez x, y koordinatlarını, genişliklerini (width) ve yüksekliklerini (height) isteyelim
        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        double centerX2 = scanner.nextDouble();
        double centerY2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();

        // 1. dökdörgenlerin kenar noktalarını bulalım
        double r1Left = centerX1 - width1 / 2;
        double r1Right = centerX1 + width1 / 2;
        double r1Bottom = centerY1 - height1 / 2;
        double r1Top = centerY1 + height1 / 2;

        // 2. dikdörtgenin kenar noktalarını bulalım
        double r2Left = centerX2 - width2 / 2;
        double r2Right = centerX2 + width2 / 2;
        double r2Bottom = centerY2 - height2 / 2;
        double r2Top = centerY2 + height2 / 2;

        // 2. dikdörtgenin 1. dökdörgene göre birbiriyle olan ilişkisini kontrol edelim
        if (r2Left >= r1Left && r2Right <= r1Right && r2Top <= r1Top && r2Bottom >= r1Bottom) {
            System.out.println("r2 is inside r1");
        } else if (r1Right < r2Left || r1Left > r2Right || r1Top < r2Bottom || r1Bottom > r2Top) {
            System.out.println("r2 does not overlap r1");
        } else {
            System.out.println("r2 overlaps r1");
        }
    }
}
