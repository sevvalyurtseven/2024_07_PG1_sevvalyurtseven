package odevler.bolum03;

import java.util.Scanner;

public class Q30 {
    /*
     * 3.30 (Güncel Zaman)
     *
     * Programlama Egzersizi 2.8'i tekrar ele alarak, saati 12 saatlik bir saat
     * formatında gösterecek şekilde düzenleyin.
     *
     * Kullanıcıdan GMT'ye göre saat dilimi ofsetini alan ve güncel saati AM veya PM
     * formatında gösteren bir program yazınız.
     *
     * Örnek Girdi ve Çıktılar:
     *
     * Girdi: Enter the time zone offset to GMT: -5
     * Çıktı: The current time is 4:50:34 AM
     *
     * İpuçları:
     * - Programınız, sistemin geçerli zamanını almalı ve bunu GMT'ye göre
     *   kullanıcı tarafından belirtilen saat dilimi ofsetini uygulayarak hesaplamalıdır.
     * - Zamanı 12 saatlik bir formatta göstermek için, saatin 12'den büyük olup olmadığını
     *   kontrol etmelisiniz. Eğer büyükse, saati 12 saatlik formata çevirin ve "PM"
     *   olarak etiketleyin, aksi takdirde "AM" olarak etiketleyin.
     * - Eğer saat 0 ise, bu durumda saati 12 olarak göstermelisiniz.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan GMT'ye göre saat dilimi offsetini girmesini iste
        System.out.println("Enter the time zone offset to GMT: ");
        long offset = scanner.nextLong();

        // Güncel saati bul
        long totalMillieSeconds = System.currentTimeMillis();

        long totalSeconds = totalMillieSeconds / 1000; // toplam saniyeyi bul (1000 ms = 1 sn)
        long currentSeconds = totalSeconds % 60; // guncel saniye

        long totalMinutes = totalSeconds / 60; // toplam dakikayı bul (60 saniye = 1 dakika)
        long currentMinutes = totalMinutes % 60; // guncel dakika

        long totalHours = totalMinutes / 60; // toplam saat (60 dakika = 1 saat)
        long currentHours = (totalHours + offset) % 24; // kullanıcının girdigi offset degerine göre belirlenen güncel saat

        // AM ve PM durumlarını kontrol edelim
        String currentTimeZone = currentHours < 12 ? "AM" : "PM";

        // Güncel saati 12 saatlik formata çevirelim
        if(currentHours == 0){
            currentHours = 12;
        } else if(currentHours > 12){
            currentHours -= 12;
        }

        // Sonucu yazdır
        System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " " + currentTimeZone);

    }
}
