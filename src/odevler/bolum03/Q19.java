package odevler.bolum03;

import java.util.Scanner;

public class Q19 {
    /*
     * 3.19 (Üçgenin çevresi)
     *
     * Kullanıcıdan kenar uzunluklarını alan ve eğer kenar uzunlukları geçerli ise
     * üçgenin çevresini hesaplayıp gösteren bir program yazınız.
     * Kenar uzunlukları geçerli değilse, “Geçersiz uzunluk değeri” mesajını gösteriniz.
     * Her iki kenarın uzunluğunun toplamı, diğer kenardan büyükse kenar uzunlukları geçerlidir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üçgenin kenar uzunluklarını girmesini isteyelim
        System.out.println("Uçgenin kenar uzunluklarını giriniz: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        // Üçgenin çevresini hesaplayalım
        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)){
            int perimeter = side1 + side2 + side3;
            System.out.println("Üçgenin çevresi: " + perimeter);
        } else {
            System.out.println("Gecersiz uzunluk degeri");
        }
    }

}
