package odevler.bolum03;

import java.util.Scanner;

public class Q01 {
    /*
     * Kullanıcıdan a, b ve c değerlerini girmesini isteyen bir program yazın.
     *
     * Kullanıcıdan girilen bu değerler ile diskriminantı hesaplayın.
     *
     * Diskriminant, b^2 - 4ac formülü ile hesaplanır.
     *
     * Diskriminant > 0 ------ Denklemin iki gerçek kökü vardır.
     * r1 = (-b + √(b^2 - 4ac)) / 2a
     * r2 = (-b - √(b^2 - 4ac)) / 2a
     *
     * Diskriminant == 0 ------ Denklemin bir gerçek kökü vardır.
     * r = -b / 2a
     *
     * Diskriminant < 0 ------ Denklemin gerçek kökü yoktur.
     *
     * Diskriminantın durumuna göre sonucu ekrana yazdırın.
     *
     * Kullanıcıya denklemin iki gerçek kökü olduğunu, bir gerçek kökü olduğunu
     * veya hiç gerçek kökü olmadığını bildiriniz.
     *
     * Kullanıcıdan a, b ve c değerlerini girdikten sonra,
     *
     * diskriminantı hesaplayın ve uygun mesajı ekrana yazdırın.
     *
     * Kökleri hesaplamak için Math.pow(x, 0.5) fonksiyonunu kullanabilirsiniz.
     *
     * Örnek girdiler ve çıktılar:
     *
     * Girdi: 1, 0, 3 ------ Çıktı: "Denklemin gerçek kökü yok"
     * Girdi: 1, 2, 1 ------ Çıktı: "Denklemin bir kökü var: -1"
     * Girdi: 1, 3, 1 ------ Çıktı: "Denklemin iki kökü var: -0.381966 ve -2.61803"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan a, b ve c değerlerini girmesini isteyelim.
        System.out.println("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Diskriminantı hesaplayalım
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Diskriminantın durumuna göre sonucu ekrana yazdıralım
        if(discriminant > 0){
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            // Köklerin tam sayı olup olmadığını kontrol edelim
            if(r1 % 1 == 0 && r2 % 1 == 0){
                System.out.println("The equation has two roots " + (int)r1 + " and " + (int)r2);
            }
            else if (r1 % 1 == 0 && r2 % 1 != 0){
                System.out.println("The equation has two roots " + (int)r1 + " and " + r2);
            }
            else if (r1 % 1 != 0 && r2 % 1 == 0){
                System.out.println("The equation has two roots " + (int)r2 + " and " + r1);
            }
            else {
                System.out.println("The equation has two roots " + r1 + " and " + r2);
            }
        }
        else if(discriminant == 0){
            double r = -b / (2 * a);
            if(r % 1 == 0){
                System.out.println("The equation has one root " + (int)r);
            }
            else {
                System.out.println("The equation has one root " + r);
            }
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
