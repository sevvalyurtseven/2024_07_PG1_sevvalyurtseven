package odevler.bolum02;

import java.util.Scanner;

public class Q11 {
    /*
2.11 (Nüfus tahmini) Kullanıcıdan yıl sayısını alan ve bu yıl için nüfus tahminini gösterecek şekilde Programlama Soruları 1.11 ‘i yeniden düzenleyiniz. Bu program için Bölüm 1 Sorulardan 11’incinin ipucunu kullanınız. Nüfus sonucu int türüne dönüştürülmelidir.

ÖRNEK:
Enter the number of years: 5
The population in 5 years is 325932970
*/
    public static void main(String[] args) {
        // Baslangıç nufusu
        int currentPopulation = 312032486;

        // Bir yıldaki toplam saniye sayısı
        int secondsInAYear = 365 * 24 * 60 * 60;

        // Bir yıl içerisindeki doğum, ölüm ve göçmen sayısı
        int birthsPerYear = secondsInAYear / 7;
        int deathsPerYear = secondsInAYear / 13;
        int immigrantsPerYear = secondsInAYear / 45;

        // Kullanıcıdan yıl sayısını iste
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Kullanıcının istediği yıl sayısına göre nufus tahmini
        int estimatedPopulation = currentPopulation + years * (birthsPerYear - deathsPerYear + immigrantsPerYear);

        // Nufus tahmini yazdır
        System.out.println("The population in " + years + " years is " + estimatedPopulation);
    }

}
