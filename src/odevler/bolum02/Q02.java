package odevler.bolum02;

import java.util.Scanner;

public class Q02 {
    /*
  2.2 (Bir silindirin hacmini hesaplayın)
  Bir silindirin yarıçapını ve uzunluğunu okuyan, ardından aşağıdaki formülleri kullanarak alanı ve hacmi hesaplayan bir program yazın:

                      alan = yarıçap * yarıçap * π (pi)
                      hacim = alan * uzunluk

  Örnek:

  Enter the radius and length of a cylinder: 5.5 12
  The area is 95.0331
  The volume is 1140.4
*/
    public static void main(String[] args) {
        // Konsoldan giriş almak için bir Scanner nesnesi oluşturalım
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan silindirin yarıçap ve uzunluğunu girmesini isteyelim
        System.out.println("Enter the radius and length of a cylinder:");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        // Silindirin alan ve hacmini hesaplayalım
        double area = radius * radius * Math.PI;
        double volume = area * length;

        // Silindirin alan ve hacmini konsola yazdıralım
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
