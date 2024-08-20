package odevler.bolum03;

import java.util.Scanner;

public class Q29 {
    /*
     * 3.29 (Geometri: İki Çember)
     *
     * Kullanıcıdan iki çemberin merkez koordinatlarını ve yarıçaplarını isteyen ve
     * ikinci çemberin birinci çemberin içinde mi, birinci çemberle çakışıyor mu veya
     * hiçbir ilişkisinin olmadığını belirleyen bir program yazınız.
     *
     * İpucu:
     * - İki çemberin merkezleri arasındaki mesafeyi hesaplayın.
     *
     * - Eğer bu mesafe, r1 - r2 mutlak değerinden küçük veya eşitse ve r1 + r2 toplamından küçükse, circle2, circle1'in içindedir.
     *
     * - Eğer bu mesafe r1 + r2 toplamına eşit veya küçükse, circle2 circle1 ile çakışır.
     * - Eğer bu mesafe r1 + r2 toplamından büyükse, circle2 circle1 ile çakışmaz.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
     *        Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
     * Çıktı: circle2 is inside circle1
     *
     * Girdi: Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
     *        Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3
     * Çıktı: circle2 overlaps circle1
     *
     * Girdi: Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1
     *        Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1
     * Çıktı: circle2 does not overlap circle1
     *
     * - Programınız tüm bu durumları kontrol edecek şekilde test edilmelidir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan 1. cemberin merkez x, y koordinatlarını ve yarıcapını isteyelim
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double centerX1 = scanner.nextDouble();
        double centerY1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();

        // Kullanıcıdan 2. cemberin merkez x, y koordinatlarını ve yarıcapını isteyelim
        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double centerX2 = scanner.nextDouble();
        double centerY2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        // 1. cemberin merkezi ile 2. cemberin merkezi arasındaki mesafeyi hesapla
        double distance = Math.sqrt(Math.pow(centerX1 - centerX2, 2) + Math.pow(centerY1 - centerY2, 2));

        // Mesafe, r1 - r2 mutlak değerinden küçük veya eşitse ve r1 + r2 toplamından küçükse, circle2, circle1'in içindedir
        // Mesafe, r1 + r2 toplamına eşit veya küçükse, circle2 circle1 ile çakışır.
        // Mesafe, r1 + r2 toplamından büyükse, circle2 circle1 ile çakışmaz.

        if(distance <= Math.abs(radius1 - radius2) && distance < radius1 + radius2){
            System.out.println("circle2 is inside circle1");
        } else if (distance <= radius1 + radius2){
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
