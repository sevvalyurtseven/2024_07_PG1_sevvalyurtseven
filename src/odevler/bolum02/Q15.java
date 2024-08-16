package odevler.bolum02;

import java.util.Scanner;

public class Q15 {
    /*
2.15 (Geometri: iki noktanın mesafesi) Kullanıcıdan iki noktayı (x1, y1) ve (x2, y2) girmesini isteyen ve bu iki nokta arasındaki mesafeyi gösteren bir program yazın.

           Mesafeyi hesaplamak için kullanılan formül:
           √((x2 - x1)^2 + (y2 - y1)^2) şeklindedir.

Mesafeyi hesaplamak için Math.pow(a, 0.5) kullanabilirsiniz.

ÖRNEK:
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 2 noktayı girmesini isteyelim
        System.out.println("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Mesafeyi hesaplayalım
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        // Mesafeyi ekrana yazdıralım
        System.out.println("The distance between the two points is " + distance);
    }
}
