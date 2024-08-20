package odevler.bolum03;

import java.util.Scanner;

public class Q27 {
    /*
     * 3.27 (Geometri: Nokta üçgenin içinde mi?)
     *
     *  Bir dik üçgen, (0, 0), (200, 0), ve (0, 100) noktalarında yer alıyor.
     *  Kullanıcıdan alınan (x, y) noktasının üçgenin içinde olup olmadığını kontrol eden program.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter a point's x- and y-coordinates: 100.5 25.5
     * Çıktı: The point is in the triangle
     *
     * Girdi: Enter a point's x- and y-coordinates: 100.5 50.5
     * Çıktı: The point is not in the triangle
     *
     Bu problemi çözmek için bilmemiz gerekenler:
     *
     * 1) Üçgenin Kenarları:
     *    - Kenar 1: y = 0 (x ekseni boyunca)
     *    - Kenar 2: x = 0 (y ekseni boyunca)
     *    - Kenar 3: (200, 0) ile (0, 100) arasında y = mx + b doğrusuyla tanımlanan eğimli bir kenar
     *
     * 2) Eğim Hesaplama (m):
     *    Kenar 3'ün eğimi iki noktası (200, 0) ve (0, 100) kullanılarak hesaplanır:
     *    - Eğim (m) formülü: m = (y2 - y1) / (x2 - x1)
     *    - m = (100 - 0) / (0 - 200) = 100 / -200 = -0.5
     *
     * 3) Doğru Denklemini Bulma (y = mx + b):
     *    Eğim (m) ve y eksenini kestiği nokta (b) kullanılarak Kenar 3'ün doğrusal denklemi bulunur:
     *    - Doğru denklemi: y = mx + b
     *    - Bir noktayı (200, 0) kullanarak b'yi buluruz:
     *      - 0 = (-0.5)(200) + b
     *      - 0 = -100 + b
     *      - b = 100
     *    - Sonuç olarak, Kenar 3'ün doğrusu: y = -0.5x + 100
     *
     * 4) Noktanın Üçgen İçinde Olup Olmadığını Kontrol Etme:
     *    - x >= 0 ve x <= 200
     *    - y >= 0 ve y <= 100
     *    - y <= -0.5 * x + 100 (Kenar 3'ün altında olmalı)
     * Bu üç koşulun hepsi sağlanıyorsa, nokta üçgenin içindedir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan x ve y koordinatlarını alalım
        System.out.println("Enter a point's x- and y-coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Üçgenin kenarlarını belirlemek için köşe noktalarını tanımlayalım
        double x1 = 200;
        double y1 = 0;
        double x2 = 0;
        double y2 = 100;

        // Kenar 3'ün eğimini hesaplayalım: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);  // m = (100 - 0) / (0 - 200) = -0.5

        // Kenar 3'ün doğru denklemini bulalım: y = mx + b
        double b = y1 - m * x1; // b = 0 - (-0.5) * 200 = 100

        // Noktanın üçgen içinde olup olmadığını kontrol edelim
        if (x >= 0 && x <= 200 && y >= 0 && y <= 100 && y <= m * x + b) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
