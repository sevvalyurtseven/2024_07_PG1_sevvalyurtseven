package odevler.bolum03;

import java.util.Scanner;

public class Q18 {
    /*
     * 3.18 (Kargo ücreti)
     *
     * Bir kargo firması, kargo ücretini hesaplamak için aşağıdaki fonksiyonu kullanmaktadır:
     *
     * c(w) = {
     *     3.5, if 0 < w <= 1
     *     5.5, if 1 < w <= 3
     *     8.5, if 3 < w <= 10
     *     10.5, if 10 < w <= 20
     * }
     *
     * Kullanıcıdan kargonun ağırlığını alan ve kargo ücretini gösteren bir program yazınız.
     * Eğer ağırlık 50’den büyük girilirse “Bu paket kargolanamaz” mesajını gösteriniz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kargo ağırlığını isteyelim
        System.out.println("Kargo ağırlığını giriniz: ");
        double weight = scanner.nextDouble();

        // Kargo ucretini hesaplayalım
        if(weight > 0 && weight <= 1){
            System.out.println("Kargo ucreti $3.5");
        } else if (weight > 1 && weight <= 3) {
            System.out.println("Kargo ucreti $5.5");
        } else if (weight > 3 && weight <= 10) {
            System.out.println("Kargo ucreti $8.5");
        } else if (weight > 10 && weight <= 20) {
            System.out.println("Kargo ucreti $10.5");
        } else {
            System.out.println("Bu paket kargolanamaz");
        }
    }

}
