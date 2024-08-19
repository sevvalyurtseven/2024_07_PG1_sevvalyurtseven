package odevler.bolum03;

import java.util.Scanner;

public class Q11 {
    /*
     * 3.11 (Bir ayın gün sayısı)
     *
     * Kullanıcıdan ay ve yıl bilgisini alan ve yılın bu ayına ait gün sayısını
     * gösteren bir program yazınız.
     *
     * Örneğin; kullanıcı ay için 2 ve yıl için 2012 girerse, program “Şubat 2012, 29 gündür”
     * mesajını gösterecek. Eğer kullanıcı ay için 3 ve yıl için 2015 girerse, program
     * “Mart 2015, 31 gündür” mesajını gösterecek.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ay ve yıl bilgilerini alalım
        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        // Numaraların hangi aya denk geldiğini bulalım
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid month");
                return;
        }

        // Kullanıcının girdiği ayın kaç gün oldugunu bulalım
        int daysInMonth;
        if(month == 2){
            if(year % 4 == 0) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }

        // Kullanıcıyı bilgilendirelim
        System.out.println(monthName + " " + year + ", " + daysInMonth + " days");
    }
}
