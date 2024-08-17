package odevler.bolum02;

import java.util.Scanner;

public class Q17 {
    /*
2.17 (Bilim: Rüzgar Soğukluğu Sıcaklığı)

Dışarısı ne kadar soğuk? Sadece sıcaklık cevabı vermek için yeterli değildir. Rüzgar hızı, göreli nem ve güneş ışığı gibi diğer faktörler, dışarıdaki soğukluk derecesini belirlemede önemli rol oynar.
2001 yılında Ulusal Hava Durumu Servisi (NWS), sıcaklık ve rüzgar hızını kullanarak soğukluğu ölçmek için yeni rüzgar soğukluğu sıcaklığı indeksini uygulamaya koydu.

                   Bu indeksin formülü şu şekildedir:
                   twc = 35.74 + 0.6215ta − 35.75v^0.16 + 0.4275tav^0.16

                  Burada:
                  ta dışarıdaki sıcaklık (Fahrenheit cinsinden),
                  v rüzgar hızıdır (mil/saat cinsinden).
                  twc ise rüzgar soğukluğu sıcaklığıdır.

Bu formül 2 mil/saat'ten düşük rüzgar hızları veya 41°F'nin altındaki sıcaklıklar için kullanılamaz.

Kullanıcıdan -58°F ile 41°F arasında bir sıcaklık ve 2 veya daha büyük bir rüzgar hızı girmesini isteyen, ardından rüzgar soğukluğu sıcaklık indeksini hesaplayıp gösteren bir program yazın. Hesaplama için Math.pow(a, b) kullanın.

ÖRNEK:
Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
Enter the wind speed (>=2) in miles per hour: 6
The wind chill index is -5.56707
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sıcaklık ve rüzgar hızı girmesini isteyelim
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = scanner.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour");
        double windSpeed = scanner.nextDouble();

        // Rüzgar soğukluğu sıcaklığını hesaplayalım
        double windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        // Sonuçu ekrana yazdıralım
        System.out.println("The wind chill index is " + windChillIndex);
    }
}
