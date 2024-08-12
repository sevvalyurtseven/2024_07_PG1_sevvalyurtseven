package odevler.bolum01;

public class Q11 {
    /*
     * 1.11 (Nüfus tahmini)
     *
     * ABD Nüfus İdaresi, nüfus tahminlerini aşağıdaki varsayımlara dayanarak yapmaktadır:
     * - Her 7 saniyede bir doğum
     * - Her 13 saniyede bir ölüm
     * - Her 45 saniyede yeni bir göçmen gelmektedir
     *
     * Gelecek beş yıl için, her bir yılın nüfus tahminlerini gösterecek bir program yazınız.
     * Şu an nüfusun 312,032,486 olduğunu ve bir yılın 365 gün olduğunu varsayalım.
     *


     * İpucu: Java’da, iki tam sayının bölümü, yine bir tamsayıdır. Ondalık kısım atılır.
     *
     *
     * Örneğin; 5 / 4 işleminin sonucu 1,25 yerine 1 olarak; 10 / 4 işleminin sonucu da 2,5 yerine 2 olarak ifade edilir. Eğer noktadan sonraki kısım kaybedilmek istenmiyorsa sayılardan birinin noktalı olması gerekir.
     *
     * Örneğin; 5.0 / 4 işleminin sonucu 1,25 ve 10 / 4.0 işleminin sonucu da 2,5’tir.
     */

    public static void main(String[] args) {
        // Initial population
        int currentPopulation = 312032486;

        // Total seconds in one year
        int secondsInAYear = 365 * 24 * 60 * 60;

        // Annual births, deaths and immigrants
        int birthsPerYear = secondsInAYear / 7;
        int deathsPerYear = secondsInAYear / 13;
        int immigrantsPerYear = secondsInAYear / 45;

        // Population after each year
        int populationAfterYear1 = currentPopulation + birthsPerYear - deathsPerYear + immigrantsPerYear;
        int populationAfterYear2 = populationAfterYear1 + birthsPerYear - deathsPerYear + immigrantsPerYear;
        int populationAfterYear3 = populationAfterYear2 + birthsPerYear - deathsPerYear + immigrantsPerYear;
        int populationAfterYear4 = populationAfterYear3 + birthsPerYear - deathsPerYear + immigrantsPerYear;
        int populationAfterYear5 = populationAfterYear4 + birthsPerYear - deathsPerYear + immigrantsPerYear;

        System.out.println("Population after 1 year: " + populationAfterYear1);
        System.out.println("Population after 2 year: " + populationAfterYear2);
        System.out.println("Population after 3 year: " + populationAfterYear3);
        System.out.println("Population after 4 year: " + populationAfterYear4);
        System.out.println("Population after 5 year: " + populationAfterYear5);
    }
}
