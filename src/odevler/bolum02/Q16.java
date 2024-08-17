package odevler.bolum02;

import java.util.Scanner;

public class Q16 {
    /*
2.16 (Geometri: Altıgenin Alanı) Kullanıcıdan bir altıgenin kenar uzunluğunu girmesini isteyen ve alanını gösteren bir program yazın.

               Altıgenin alanını hesaplamak için kullanılan formül:
               Alan = (3√3 / 2) * s^2
               Burada s bir kenarın uzunluğudur.

ÖRNEK:
Enter the side: 5.5
The area of the hexagon is 78.5895
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan altıgenin kenar uzunluğunu girmesini isteyelim
        System.out.println("Enter the side: ");
        double side = scanner.nextDouble();

        // Altıgenin alanını hesaplayalım
        double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(side, 2);

        // Altıgenin alanını ekrana yazdıralım
        System.out.println("The area of the hexagon is " + area);
    }
}
