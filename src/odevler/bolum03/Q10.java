package odevler.bolum03;

import java.util.Scanner;

public class Q10 {
    /*
     * 3.10 (Oyun: toplama sınavı)
     *
     * Madde 3.3, SubtractionQuiz.java, rastgele çıkarma işlemi soruları üretmektedir.
     *
     * Bu programı 100’den küçük rastgele iki tam sayı ile toplama soruları üretecek
     * şekilde yeniden düzenleyiniz.
     */
    public static void main(String[] args) {
        // 100'den kücük rastgele 2 tam sayı üret
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // Toplama sorusu
        System.out.println("What is " + number1 + " + " + number2 + "? ");

        // Kullanıcıdan sorunun cevabını girmesini isteyelim
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        // Cevabi kontrol edelim
        if(number1 + number2 == answer){
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }

}
