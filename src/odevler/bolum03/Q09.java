package odevler.bolum03;

import java.util.Scanner;

public class Q09 {
    /*
     * 3.9 (İş: ISBN-10 kontrolü)
     *
     * ISBN-10 (Uluslararası Standart Kitap Numarası) 10 basamaktan oluşur:
     * d1d2d3d4d5d6d7d8d9d10. Son basamak d10 sağlama için kullanılır ve
     * diğer basamaklar kullanılarak aşağıdaki formülle hesaplanır:
     *
     * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
     *
     * ISBN-10 standartlarına göre eğer sağlama değeri 10 elde edilirse, bu X olarak gösterilir.
     *
     * Kullanıcıdan ilk 9 basamağı alan ve 10 basamaklı ISBN numarasını gösteren
     * bir program yazınız. (Baştaki sıfırları da gösteriniz.)
     * Programınız girdiyi tam sayı olarak okumalıdır.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter the first 9 digits of an ISBN as integer: 013601267
     * Çıktı: The ISBN-10 number is 0136012671
     *
     * Girdi: Enter the first 9 digits of an ISBN as integer: 013031997
     * Çıktı: The ISBN-10 number is 013031997X
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ISBN-10 numarasının ilk 9 basamagını isteyelim
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int first9Digits = scanner.nextInt();

        // Her bir basamagı mod ve bölme işlemleri ile elde edelim
        int d9 = first9Digits % 10;
        int d8 = (first9Digits / 10) % 10;
        int d7 = (first9Digits / 100) % 10;
        int d6 = (first9Digits / 1000) % 10;
        int d5 = (first9Digits / 10000) % 10;
        int d4 = (first9Digits / 100000) % 10;
        int d3 = (first9Digits / 1000000) % 10;
        int d2 = (first9Digits / 10000000) % 10;
        int d1 = (first9Digits / 100000000) % 10;

        // ISBN-10 numarasını olusturalım
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // ISBN-10 numarasını yazdıralım
        if(d10 == 10){
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }


    }
}
