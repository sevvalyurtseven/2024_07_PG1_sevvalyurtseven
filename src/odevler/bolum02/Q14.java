package odevler.bolum02;

import java.util.Scanner;

public class Q14 {
    /*
2.14 (Sağlık uygulaması: BMI hesaplama) Vücut Kitle İndeksi (BMI), kilonuzun sağlığını ölçen bir değerdir.
Kilonuzu kilogram cinsinden alıp, boyunuzun metre cinsinden karesine bölerek hesaplanabilir.

Kullanıcıdan kiloyu pound cinsinden ve boyu inç cinsinden girmesini isteyen ve BMI değerini gösteren bir program yazın. Bir pound'un 0.45359237 kilogram ve bir inç'in 0.0254 metre olduğunu unutmayın.

ÖRNEK:
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kiloyu pound cinsinden ve boyu inç cinsinden girmesini isteyelim
        System.out.println("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = scanner.nextDouble();

        // BMI hesaplamasını yapalım
       double bmi = (weight * 0.45359237) / Math.pow((height * 0.0254), 2);

       // BMI degerini ekrana yazdıralım
       System.out.println("BMI is " + bmi);
    }
}
