package odevler.bolum03;

import java.util.Scanner;

public class Q08 {
    /*
     * 3.8 (Üç tamsayıyı sıralama)
     *
     * Kullanıcıdan üç tam sayı alan ve bu tam sayıları küçükten büyüğe doğru sıralayıp
     * gösteren bir program yazınız.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 tam sayı isteyelim
        System.out.print("1. tam sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("2. tam sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.print("3. tam sayıyı giriniz: ");
        int c = scanner.nextInt();

        // Kullanıcıdan gelen tam sayıları sıralayalım. Bunun için her kombinasyonu if else conditionu ile check edelim
        if(a <= b && b <= c) {
            System.out.println("Kücükten büyüğe sıralama: " + a + " " + b + " " + c);
        } else if(a <= c && c <= b) {
            System.out.println("Kücükten büyüğe sıralama: " + a + " " + c + " " + b);
        } else if(b <= a && a <= c){
            System.out.println("Küçükten büyüğe sıralama: " + b + " " + a + " " + c);
        } else if(b <= c && c <= a){
            System.out.println("Küçükten büyüğe sıralama: " + b + " " + c + " " + a);
        } else if(c <= a && a <= b){
            System.out.println("Küçükten büyüğe sıralama: " + c + " " + a + " " + b);
        } else {
            System.out.println("Küçükten büyüğe sıralama: " + c + " " + b + " " + a);
        }
    }
}
