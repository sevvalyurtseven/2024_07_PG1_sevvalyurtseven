package odevler.bolum04;

import java.util.Scanner;

public class Q01 {
    /*
    4.1 (Geometry: area of a pentagon)

    Aşağıda bulunan şekildeki gibi kullanıcıdan beşgenin merkezinden köşesine kadar olan uzunluğu alarak, alanını
    hesaplayan bir program yazınız.

         Beşgenin alanını hesaplamak için kullanılacak formül:
                 5 * s^2
         Area = -----------
                4 * tan(PI / 5)

         s beşgenin kenar uzunluğunu gösterir.

         Kenar uzunluğu aşağıdaki formül kullanılarak hesaplanabilir:
         s = 2 * r * sin(PI / 5)

         r beşgenin merkezinin köşesine olan uzaklığını gösterir.
         Ondalık kısmı iki basamak olacak şekilde yuvarlayınız.

         Örnek akışı inceleyiniz:
         Enter the length from the center to a vertex: 5.5
         The area of the pentagon is 71.92.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan beşgenin merkezinden köşesine kadar olan uzunluğu alalım:
        System.out.println("Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();

        // Kenar uzunluğunu hesapla: s = 2 * r * sin(PI / 5)
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Alan hesapla:
        double area = (5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5));

        // Alanı ekrana yazdır:
        System.out.printf("The are of the pentagon is %.2f", area);
    }
}
