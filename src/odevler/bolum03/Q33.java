package odevler.bolum03;

import java.util.Scanner;

public class Q33 {
    /*
     * 3.33 (Finans: Maliyet Karşılaştırma)
     *
     * İki farklı paketten pirinç alışverişi yaptığınızı varsayalım.
     * Maliyeti karşılaştırmak için bir program yazmak istiyorsunuz.
     * Program, kullanıcıdan her bir paket için ağırlık ve fiyat bilgilerini alır
     * ve daha iyi fiyata sahip olan paketi gösterir.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter weight and price for package 1: 50 24.59
     *        Enter weight and price for package 2: 25 11.99
     * Çıktı: Package 2 has a better price.
     *
     * Girdi: Enter weight and price for package 1: 50 25
     *        Enter weight and price for package 2: 25 12.5
     * Çıktı: Two packages have the same price.
     *
     * İpucu:
     * - Her iki paket için birim fiyatı hesaplayın (fiyat / ağırlık).
     * - Birim fiyatı düşük olan paketin daha iyi fiyata sahip olduğunu gösterin.
     * - Eğer iki paketin birim fiyatları eşitse, "İki paket aynı fiyata sahip." mesajını gösterin.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 1. paket için ağırlık ve fiyat bilgisi alalım
        System.out.println("Enter weight and price for package 1: ");
        double weight1 = scanner.nextDouble();
        double price1 = scanner.nextDouble();

        // Kullanıcıdan 1. paket için ağırlık ve fiyat bilgisi alalım
        System.out.println("Enter weight and price for package 2: ");
        double weight2 = scanner.nextDouble();
        double price2 = scanner.nextDouble();

        // 1. paketin birim fiyatını hesaplayalım
        double pricePerUnit1 = price1 / weight1;

        // 2. paketin birim fiyatını hesaplayalım
        double pricePerUnit2 = price2 / weight2;

        // Hangi paket daha uygun?
        if (pricePerUnit1 < pricePerUnit2) {
            System.out.println("Package 1 has a better price.");
        } else if (pricePerUnit1 > pricePerUnit2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Two packages have the same price.");
        }
    }
}
