package odevler.bolum03;

import java.util.Scanner;

public class Q21 {
    /*
     * 3.21 (Bilim: haftanın günü)
     *
     * Christian Zeller tarafından geliştirilen Zeller algoritması ile verilen bir tarihin
     * hangi gün olduğu hesaplanabilir. Bunun için geliştirilen formül:
     *
     * h = ( q + (26(m + 1) / 10) + k + (k / 4) + (j / 4) + 5j ) % 7
     *
     * Burada:
     * ■ h haftanın günü (0: Cumartesi, 1: Pazar, 2: Pazartesi, 3: Salı, 4: Çarşamba, 5: Perşembe, 6: Cuma).
     * ■ q ayın günü.
     * ■ m ay (3: Mart, 4: Nisan, …, 12: Aralık). Ocak ve Şubat aylarının değeri sırasıyla 13 ve 14’tür.
     *   Bu değerler bir önceki yılı gösterir.
     * ■ j yüzyıl (ör., yıl / 100).
     * ■ k yüzyılın yılı (ör., yıl % 100).
     *
     * Verilen formüldeki bölme işlemlerinin sonucu tam sayı olacaktır.
     * Kullanıcıdan yıl, ay ve gün bilgisini alan ve haftanın hangi günü olduğunu gösteren
     * bir program yazınız.
     *
     * İpucu: Formülde Ocak ve Şubat ayları 13 ve 14 olarak sayılır, bu yüzden kullanıcı
     * 1 girdiğinde bunu 13'e, 2 girdiğinde ise 14'e dönüştürmeli ve yılı bir önceki yıla
     * göre azaltmalısınız.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter year: (e.g., 2012): 2015
     * Girdi: Enter month: 1-12: 1
     * Girdi: Enter the day of the month: 1-31: 25
     * Çıktı: Day of the week is Sunday
     *
     * Girdi: Enter year: (e.g., 2012): 2012
     * Girdi: Enter month: 1-12: 5
     * Girdi: Enter the day of the month: 1-31: 12
     * Çıktı: Day of the week is Saturday
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yıl, ay ve gün bilgilerini alalım
        System.out.println("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = scanner.nextInt();
        System.out.println("Enter the day of the month: 1-31: ");
        int day = scanner.nextInt();

        // Ocak ve Şubat ayları için ay ve yıl değerlerini güncelleyelim
        if(month == 1 || month == 2){
            month += 12;
            year--;
        }

        // Zeller algoritması ile verilen tarihin hangi gün oldugunu bulalım
        int q = day;
        int m = month;
        int j = year / 100; //yuzyıl
        int k = year % 100; // yılın geri kalanı

        // Zeller algoritması
        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

        // Haftanın hangi gün oldugunu ekrana bastıralım
        String dayOfWeek = "";
        switch (h){
            case 0:
                dayOfWeek = "Saturday";
                break;
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
        }
        System.out.println("Day of the week is " + dayOfWeek);
    }

}
