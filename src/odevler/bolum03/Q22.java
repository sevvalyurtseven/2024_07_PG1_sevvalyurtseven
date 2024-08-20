package odevler.bolum03;

import java.util.Scanner;

public class Q22 {
    /*
     * 3.22 (Geometri: Nokta çemberin içinde mi?)
     *
     * Kullanıcıdan (x, y) şeklinde bir nokta alan ve bu noktanın merkezi (0, 0)
     * ve yarıçapı 10 olan bir çemberin içinde olup olmadığını gösteren bir program yazınız.
     * Örneğin, şekil 3.7a’da görüleceği gibi (4, 5) çemberin içinde, (9, 9) çemberin dışındadır.
     *
     * İpucu: Eğer bir nokta çemberin içinde ise, bu noktanın merkeze olan uzaklığı,
     * çemberin yarıçapından küçük ya da eşit olmalıdır. İki nokta arasında bulunan
     * uzaklığı hesaplamak için kullanılan formül:
     *
     * √((x2 – x1)² + (y2 – y1)²)
     *
     * Programınızı tüm durumlar için test ediniz.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: Enter a point with two coordinates: 4 5
     * Çıktı: Point (4.0, 5.0) is in the circle
     *
     * Girdi: Enter a point with two coordinates: 9 9
     * Çıktı: Point (9.0, 9.0) is not in the circle
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan (x,y) sınırlarını belirleyelim
        System.out.println("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Merkezi (0,0) olan nokta ile (x,y) noktası arasındaki uzaklığı hesaplayalım
        double distance = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));

        // Uzaklıgı cemberin yarıçapı ile kıyaslayalım
        if(distance <= 10){
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }
    }
}
