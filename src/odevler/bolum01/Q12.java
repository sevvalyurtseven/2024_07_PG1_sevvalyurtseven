package odevler.bolum01;

public class Q12 {
    // 1.12 (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)

    //(Kilometre cinsinden ortalama hız) Bir koşucunun 24 mili 1 saat, 40 dakika, 35 saniyede koştuğunu varsayalım. Ortalama hızı km/saat cinsinden gösterecek bir program yazınız. ( 1 mil, 1.6 kilometredir.)
    public static void main(String[] args) {
        // Mil cinsinden mesafe
        double miles = 24.0;

        // Süreyi saat cinsinden hesaplayalım
        double hours = 1.0;
        double minutes = 40.0;
        double seconds = 35.0;
        double totalTimeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Milin km cinsinden karsılıgı
        double kilometers = miles * 1.6;

        // Ortalama hız
        double averageSpeed = kilometers / totalTimeInHours;

        System.out.println("Average speed: " + averageSpeed + " km/hour.");

    }
}
