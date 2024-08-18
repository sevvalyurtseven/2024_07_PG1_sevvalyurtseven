package odevler.bolum03;

import java.util.Scanner;

public class Q05 {
    /*
     * 3.5 (Haftanın günü)
     *
     * Kullanıcıdan bugüne karşılık gelen bir tam sayı (Pazar – 0, Pazartesi – 1, …, ve Cumartesi – 6 olacak şekilde) alan bir program yazınız.
     * Aynı zamanda kullanıcıdan, “bugünden kaç gün sonra” için de bir tam sayı değeri alarak, ona karşılık gelen günü gösteriniz.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter today's day: 1
     * Girdi: Enter the number of days elapsed since today: 3
     * Çıktı: Today is Monday and the future day is Thursday
     *
     * Girdi: Enter today's day: 0
     * Girdi: Enter the number of days elapsed since today: 31
     * Çıktı: Today is Sunday and the future day is Wednesday
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bugune ait rakamı soralım
        System.out.println("Enter today's day: ");
        int today = scanner.nextInt();

        // Kullanıcıya kaç gün sonraki günü istedigini soralım
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsedDay = scanner.nextInt();

        // Kullanıcının girdiği rakamın hangi güne denk geldiğini tanımlayalım
        String todayName = "";
        switch(today) {
            case 0:
                todayName = "Sunday";
                break;
            case 1:
                todayName = "Monday";
                break;
            case 2:
                todayName = "Tuesday";
                break;
            case 3:
                todayName = "Wednesday";
                break;
            case 4:
                todayName = "Thursday";
                break;
            case 5:
                todayName = "Friday";
                break;
            case 6:
                todayName = "Saturday";
                break;
        }

        // Gelecekteki günün hangi güne denk geldiğini bulmak için mod (%) işlemi uygulayalım
        int futureDay = (today + elapsedDay) % 7;

        String futureDayName = "";
        switch(futureDay) {
            case 0:
                futureDayName = "Sunday";
                break;
            case 1:
                futureDayName = "Monday";
                break;
            case 2:
                futureDayName = "Tuesday";
                break;
            case 3:
                futureDayName = "Wednesday";
                break;
            case 4:
                futureDayName = "Thursday";
                break;
            case 5:
                futureDayName = "Friday";
                break;
            case 6:
                futureDayName = "Saturday";
                break;
        }
        System.out.println("Today is " + todayName + " and the future day is " + futureDayName);
    }

}
