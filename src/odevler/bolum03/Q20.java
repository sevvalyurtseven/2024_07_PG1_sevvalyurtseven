package odevler.bolum03;

import java.util.Scanner;

public class Q20 {
    /*
     * 3.20 (Bilim: Hissedilen sıcaklık)
     *
     * Programlama Soruları 2.17'de hissedilen sıcaklığı hesaplamak için kullanılan formülü
     * bulabilirsiniz. Bu formül sıcaklık değeri −58ºF ve 41ºF arasında ve rüzgar hızı
     * 2 ve bundan büyük olduğu durumlarda geçerlidir.
     *
     * Kullanıcıdan sıcaklık ve rüzgar hızını alan bir program yazınız.
     * Eğer girilen değerler geçerliyse program hissedilen sıcaklığı göstersin,
     * değilse “Geçersiz sıcaklık ya da rüzgar hızı” mesajını göstersin.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sıcaklık ve rüzgar hızı girmesini isteyelim
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = scanner.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Rüzgar soğuklugu sıcaklığını hesaplayalım
        double windChillIndex = 35.74 * 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        // Eğer girilen değerler geçerliyse program hissedilen sıcaklığı göstersin, değilse “Geçersiz sıcaklık ya da rüzgar hızı” mesajını göstersin
        if(temperature >= -58 && temperature <= 41 && windSpeed >= 2){
            System.out.println("The wind chill index is: " + windChillIndex);
        } else {
            System.out.println("Invalid temperature or wind speed");
        }
    }

}
