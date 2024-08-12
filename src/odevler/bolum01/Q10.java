package odevler.bolum01;

public class Q10 {
    // 1.10 (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
    public static void main(String[] args) {
        // Kosucunun koştugu mesafe (km cinsinden)
        double distanceInKilometers = 14.0;

        // Kilometreyi mile cevir (1 mil = 1.6 km)
        double distanceInMiles = distanceInKilometers / 1.6;

        // Geçen süre saat cinsinden (45 dk 40 sn)
        double timeInHours = (45.0 / 60.0) + (30.0 / 3600.0);

        // Mil / saat cinsinden ortalama hız
        double averageSpeed = distanceInMiles / timeInHours;

        System.out.println("Average speed in miles per hour: " + averageSpeed);
    }
}
