package odevler.bolum02;

import java.util.Scanner;

public class Q08 {
    /*
2.8 (Güncel zaman) ShowCurrentTime.java, GMT'deki (Greenwich Ortalama Zamanı) güncel zamanı gösteren bir program verir. Programı, kullanıcıdan GMT'ye göre saat dilimi ofsetini girmesini isteyecek ve belirtilen saat dilimindeki zamanı gösterecek şekilde güncelleyin.

ÖRNEK:
Enter the time zone offset to GMT: −5
The current time is 4:50:34
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan GMT'ye göre saat dilimi offset'ini girmesini isteyelim
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        // 1 Ocak 1970'ten itibaren geçen toplam milisaniyeyi elde et
        long totalMilliseconds = System.currentTimeMillis();

        // 1 Ocak 1970'ten itibaren geçen toplam saniyeyi elde et
        long totalSeconds = totalMilliseconds / 1000;

        // Saat içindeki mevcut saniyeyi hesapla
        long currentSecond = totalSeconds % 60;

        // Toplam dakika sayısını elde et
        long totalMinutes = totalSeconds / 60;

        // Saat içindeki mevcut dakikayı hesapla
        long currentMinute = totalMinutes % 60;

        // Toplam saat sayısını elde et
        long totalHours = totalMinutes / 60;

        // Gün içindeki mevcut saati hesapla
        long currentHour = totalHours % 24;

        // Saat dilimi offset'ini ekle ve 24 saatlik formatta düzenle
        long localHour = (currentHour + offset + 24) % 24;

        // Sonuçları göster
        System.out.println("Current time is " + localHour + ":" + currentMinute + ":" + currentSecond);
    }
}


