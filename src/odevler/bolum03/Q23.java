package odevler.bolum03;

import java.util.Scanner;

public class Q23 {
    /*
     * 3.23 (Geometri: Nokta dikdörtgenin içinde mi?)
     *
     * Kullanıcıdan (x, y) şeklinde bir nokta alıp, bu noktanın merkezi (0, 0)
     * olan ve genişliği 10, yüksekliği 5 olan bir dikdörtgenin içinde olup olmadığını
     * kontrol eden bir program yazınız.
     *
     * Örneğin, (2, 2) noktası dikdörtgenin içinde, (6, 4) noktası ise dikdörtgenin
     * dışındadır. Bir noktanın dikdörtgenin içinde olup olmadığını kontrol etmek için:
     *
     * - Noktanın yatay uzaklığı (x ekseni) merkeze (0, 0) olan uzaklığı 10 / 2'den küçük
     *   veya ona eşit olmalıdır.
     * - Noktanın dikey uzaklığı (y ekseni) merkeze (0, 0) olan uzaklığı 5 / 2'den küçük
     *   veya ona eşit olmalıdır.
     *
     * Programınızı her durumda çalışacak şekilde test edin.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter a point with two coordinates: 2 2
     * Çıktı: Point (2.0, 2.0) is in the rectangle
     *
     * Girdi: Enter a point with two coordinates: 6 4
     * Çıktı: Point (6.0, 4.0) is not in the rectangle
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan (x,y) koordinatlarını isteyelim
        System.out.println("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Merkezi (0,0) olan nokta ile (x,y) noktası arasındaki uzaklığı hesaplayalım
        double distance = Math.sqrt(Math.pow((x-0), 2) + Math.pow((y-0), 2));

        // Uzaklığı dikdörtgenin yatay ve dikey uzaklığını kıyaslayalım
        if(distance <= 10/2 || distance <= 5/2){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
