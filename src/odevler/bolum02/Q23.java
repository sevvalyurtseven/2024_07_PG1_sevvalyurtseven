package odevler.bolum02;

import java.util.Scanner;

public class Q23 {
    /*
2.23 (Yakıt maliyeti) Kullanıcıdan mesafe, aracın yakıt tüketimi ve yakıt fiyatını isteyen ve aracın sürüş boyunca yakıt maliyetini hesaplayan bir program yazınız.

ÖRNEK:
Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafe, aracın yakıt tüketimi ve yakıt fiyatını isteyelim
        System.out.println("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // Aracın sürüş boyunca yakıt maliyetini hesaplayalım
        double cost = distance / milesPerGallon * pricePerGallon;

        // Sonuçu gösterelim
        System.out.println("The cost of driving is $" + cost);
    }
}
