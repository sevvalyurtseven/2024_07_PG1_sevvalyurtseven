package odevler.bolum03;

import java.util.Scanner;

public class Q15 {
    /*
     * 3.15 (Oyun: piyango)
     *
     * Madde 3.8, Lottery.java'yı yeniden düzenleyerek üç basamaklı sayılardan bir
     * piyango oluşturun. Program kullanıcıdan üç basamaklı bir sayı alsın ve
     * aşağıdaki kurallara göre kazancını göstersin:
     *
     * 1. Eğer girilen sayı piyangoda kazanan sayı ile birebir aynısı ise; ödül 10.000 TL.
     *
     * 2. Eğer girilen sayının tüm basamakları piyangoda kazanan sayı ile aynı ise;
     * ödül 3.000 TL.
     *
     * 3. Eğer girilen sayının bir basamağı piyangoda kazanan sayı ile aynı ise;
     * ödül 1.000 TL.
     */
    public static void main(String[] args) {
        // Rastgele 3 basamaklı sayı üretelim
        int lottery = 100 + (int) (Math.random() * 900);

        // Kullanıcıdan 3 basamaklı bir sayı girmesini isteyelim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your lottery pick (three digits): ");
        int guess = scanner.nextInt();

        // Rastgele üretilen sayının her bir basamagındaki rakamı elde edelim
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery % 100) / 10;
        int lotteryDigit3 = lottery % 10;

        // Kullanıcının girdigi sayının her bir basamagındaki rakamı elde edelim
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Kullanıcının girdigi tahmini kontrol edelim
        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
                || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
                || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
                || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2
                || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1
                || guessDigit3 == lotteryDigit2
                || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
