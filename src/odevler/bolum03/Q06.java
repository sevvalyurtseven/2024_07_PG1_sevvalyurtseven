package odevler.bolum03;

import java.util.Scanner;

public class Q06 {
    /*
     * 3.6 (Sağlık uygulaması: VKİ)
     *
     * Madde 3.4, ComputeAndInterpretBMI.java, dosyasını yeniden düzenleyerek
     * kullanıcıdan ağırlığı pound olarak ve boyu feet ve inç olarak alınız.
     * Örneğin; Kullanıcı 5 feet 10 inç girmek isterse, 5 feet olarak ve 10'u inç olarak alınız.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter weight in pounds: 140
     * Girdi: Enter feet: 5
     * Girdi: Enter inches: 10
     * Çıktı: BMI is 20.087702275404553
     * Çıktı: Normal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ağırlık ve boy bilgilerini alalım
        System.out.println("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter feet: ");
        int feet = scanner.nextInt();
        System.out.println("Enter inches: ");
        int inches = scanner.nextInt();

        // Constants
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double METERS_PER_FEET = 0.3048;

        // BMI hesaplayalım
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * METERS_PER_FEET) + (inches * METERS_PER_INCH);
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        // BMI sonucunu ekrana yazdıralım
        System.out.println("BMI is " + bmi);

        if(bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
