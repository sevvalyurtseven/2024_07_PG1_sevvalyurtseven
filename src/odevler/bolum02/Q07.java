package odevler.bolum02;

import java.util.Scanner;

public class Q07 {
    /*
2.7 (Yıl sayısını bulma) Kullanıcıdan dakika sayısını (örneğin, 1 milyar) girmesini isteyen ve bu dakika sayısını yıl ve gün olarak gösteren bir program yazın. Basitlik açısından, bir yılın 365 gün olduğunu varsayın.

ÖRNEK:
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dakika sayısını girmesini isteyelim
        System.out.println("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Bir yılın ve bir günün kaç dakika oldugunu hesaplayalım
        int oneDayToMinutes = 24 * 60;
        int oneYearToMinutes = 365 * oneDayToMinutes;

        // Dakika sayısını yıl ve gün olarak gösterelim
        int years = minutes / oneYearToMinutes;
        int days = (minutes % oneYearToMinutes) / oneDayToMinutes;

        // Sonucu ekrana yazdıralım
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
