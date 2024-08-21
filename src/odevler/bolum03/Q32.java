package odevler.bolum03;

import java.util.Scanner;

public class Q32 {
    /*
     * 3.32 (Geometri: Nokta Pozisyonu)
     *
     * Bir p0(x0, y0) noktasından p1(x1, y1) noktasına giden yönlendirilmiş bir doğru
     * verildiğinde, p2(x2, y2) noktasının bu doğrunun solunda mı, sağında mı yoksa
     * aynı doğru üzerinde mi olduğunu belirlemek için aşağıdaki koşulu kullanabilirsiniz:
     *
     * (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)
     *
     * Bu koşulun sonucu:
     * - Eğer > 0 ise, p2 noktası doğrunun solundadır.
     * - Eğer = 0 ise, p2 noktası doğrunun üzerindedir.
     * - Eğer < 0 ise, p2 noktası doğrunun sağındadır.
     *
     * Program, kullanıcıdan p0, p1 ve p2 için üç nokta girmesini isteyecek ve p2'nin
     * p0 ve p1 arasındaki doğruya göre nerede olduğunu gösterecektir.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4
     * Çıktı: (-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)
     *
     * Girdi: Enter three points for p0, p1, and p2: 1 1 5 5 2 2
     * Çıktı: (2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)
     *
     * Girdi: Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5
     * Çıktı: (5.0, 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
     *
     * Bu koşulu sağlamak için gerekli hesaplamaları yaptıktan sonra, sonucu
     * kullanıcıya anlamlı bir şekilde gösterecek bir program yazılmalıdır.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 nokta isteyelim
        System.out.println("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Koşul: (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        // Koşul sonucu:
        if(result > 0){
            System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else if(result == 0){
            System.out.println("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}
