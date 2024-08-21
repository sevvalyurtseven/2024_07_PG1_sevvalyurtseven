package odevler.bolum03;

import java.util.Scanner;

public class Q34 {
    /*
     * 3.34 (Geometri: Nokta Doğru Parçası Üzerinde mi?)
     *
     * Bu problemi çözmek için, kullanıcıdan p0, p1 ve p2 için üç nokta girmesini isteyeceğiz
     * ve ardından p2'nin p0 ve p1 arasındaki doğru parçası üzerinde olup olmadığını test edeceğiz.
     * Bu test iki aşamadan oluşur:
     *
     * 1. Doğru Üzerinde Olma Kontrolü:
     *    İlk olarak, p2'nin p0 ve p1 noktalarından geçen sınırsız doğru üzerinde olup olmadığını
     *    kontrol etmemiz gerekir. Bunu yapmak için şu denklemi kullanırız:
     *
     *    (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)
     *
     *    Eğer bu denklemin sonucu sıfır ise (yani result == 0), p2 noktası p0 ve p1
     *    noktalarından geçen doğru üzerindedir.
     *
     * 2. Doğru Parçası Üzerinde Olma Kontrolü:
     *    P2'nin sadece doğru üzerinde olması yetmez, aynı zamanda p0 ve p1 noktaları arasındaki
     *    doğru parçası üzerinde yer alması gerekmektedir. Bunu kontrol etmek için p2'nin
     *    koordinatlarının p0 ve p1 noktalarının koordinatları arasında olup olmadığını kontrol ederiz:
     *
     *    min(x0, x1) <= x2 <= max(x0, x1) ve min(y0, y1) <= y2 <= max(y0, y1)
     *
     *    Bu iki koşul da sağlanıyorsa, p2 noktası p0 ve p1 arasındaki doğru parçası üzerinde yer alır.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
     * Çıktı: (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
     *
     * Girdi: Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
     * Çıktı: (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
     *
     * İpuçları:
     * 1. Doğru Üzerinde Olma Kontrolü: Yukarıda belirtilen denklemi kullanarak p2'nin
     *    p0 ve p1 noktalarından geçen doğru üzerinde olup olmadığını kontrol edin. Eğer sonuç sıfır ise,
     *    p2 doğru üzerindedir.
     *
     * 2. Doğru Parçası Üzerinde Olma Kontrolü: P2'nin koordinatlarının p0 ve p1 arasındaki
     *    değerler arasında olup olmadığını kontrol edin. Eğer bu iki koşul da sağlanıyorsa,
     *    p2 doğru parçası üzerindedir.
     *
     * 3. Sonuçları Yazdırma: Elde edilen sonuca göre, p2'nin doğru parçası üzerinde
     *    olup olmadığını uygun bir mesaj ile ekrana yazdırın.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 nokta iste
        System.out.println("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Koşul: (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        // Dogru parcasi üzerinde mi?

        //Kosul: min(x0, x1) <= x2 <= max(x0, x1) ve min(y0, y1) <= y2 <= max(y0, y1)
        if(result == 0){
            if((Math.min(x0, x1) <= x2 && x2 <= Math.max(x0, x1))
                    && (Math.min(y0, y1) <= y2 && y2 <= Math.max(y0, y1))){
                System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
            } else {
                System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
            }
        }

    }
}

