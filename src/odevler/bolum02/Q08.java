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

        // Kullanıcıdan GMT'ye göre saat dilimi ofsetini girmesini iste
        System.out.println("Enter the time zone offset to GMT: ");
        long offset = scanner.nextLong();

        // Güncel zamanı bul
        long totalMillieSeconds = System.currentTimeMillis();
        long totalSeconds = totalMillieSeconds / 1000; // toplam saniyeyi bul (1000 ms = 1 sn)
        long currentSeconds = totalSeconds % 60; // güncel saniye

        long totalMinutes = totalSeconds / 60; // toplam dakikayı bul (60 saniye = 1 dakika)
        long currentMinutes = totalMinutes % 60; // güncel dakika

        long totalHours = totalMinutes / 60; // toplam saat'i bul (60 dakika = 1 saat)
        long currentHours = (totalHours + offset) % 24; // kullanıcının girdigi offset degerine göre belirlenen güncel saat

        System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }

}



