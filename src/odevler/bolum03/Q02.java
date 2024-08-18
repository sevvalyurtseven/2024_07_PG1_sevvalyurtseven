package odevler.bolum03;

import java.util.Scanner;

public class Q02 {
    /*
     * 3.2 (Oyun: üç sayıyı toplama)
     *
     * Madde 3.1'deki AdditionQuiz.java programı, iki adet tam sayı üretip, kullanıcıdan bu sayıların toplamını girmesini istiyordu.
     *
     * Bu programı, üç tek basamaklı tam sayı üretecek ve kullanıcıdan bu üç tam sayının toplamını girmesini isteyecek şekilde yeniden düzenleyiniz.
     */
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int answer = number1 + number2 + number3;

        // Kullanıcıya verilen rakamların toplamını soralım
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "?");
        int userAnswer = scanner.nextInt();

        // Kullanıcının cevabını kontrol edelim
        if (userAnswer == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong. The answer is " + answer + ".");
        }
    }

}
