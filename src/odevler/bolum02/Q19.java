package odevler.bolum02;

import java.util.Scanner;

public class Q19 {
    /*
2.19 (Geometri: üçgenin alanı) Kullanıcıdan (x1, y1), (x2, y2), (x3, y3) gibi üç nokta girmesini isteyen ve üçgenin alanını hesaplayıp gösteren bir program yazınız.

               Üçgenin alanını hesaplamak için kullanılacak formül:

               s = (side1 + side2 + side3)/2;
               area = √(s * (s - side1) * (s - side2) * (s - side3))


ÖRNEK:
Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
The area of the triangle is 33.6
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç nokta girmesini isteyelim
        System.out.println("Enter three points for a triangle: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Üçgenin kenar uzunluklarını hesaplayalım
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Üçgenin yarı çevresini hesaplayalım
        double s = (side1 + side2 + side3) / 2;

        // Üçgenin alanını hesaplayalım
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Alanı ekrana yazdıralım
        System.out.println("The area of the triangle is " + area);

    }
}
