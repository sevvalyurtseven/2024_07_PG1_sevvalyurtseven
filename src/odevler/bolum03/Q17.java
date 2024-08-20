package odevler.bolum03;

import java.util.Scanner;

public class Q17 {
    /*
     * 3.17 (Oyun: makas, taş, kağıt)
     *
     * Makas, taş, kağıt oyununu oynatan bir program yazınız.
     * (Makas kağıdı keser, taş makası kırar, ve kağıt taşı sarar.)
     * Program rastgele makas, taş ve kağıdı temsilen 0, 1, 2 sayılarını üretsin.
     * Program kullanıcıdan 0, 1, 2 sayılarından birini girmesini istesin ve
     * bilgisayarın sonucuna göre “kazandınız”, “kaybettiniz” ya da “berabere kaldınız”
     * mesajlarından uygun olanı göstersin.
     *
     * Örnek Girdiler ve Çıktılar:
     *
     * Girdi: scissor (0), rock (1), paper (2): 1
     * Çıktı: The computer is scissor. You are rock. You won
     *
     * Girdi: scissor (0), rock (1), paper (2): 2
     * Çıktı: The computer is paper. You are paper too. It is a draw
     */
    public static void main(String[] args) {
        // Rastgele 0, 1, 2 sayıları üretelim
        int computerChoice = (int) (Math.random() * 3);

        // Kullanıcının 0, 1, 2 sayılarından birini girmesini isteyelim
        Scanner scanner = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int userChoice = scanner.nextInt();

        // 0, 1 ve 2 durumlarını ne anlama geldiğini belirtelim
        String computerChoiceStr = (computerChoice == 0) ? "scissor" : (computerChoice == 1) ? "rock" : "paper";
        String userChoiceStr = (userChoice == 0) ? "scissor" : (userChoice == 1) ? "rock" : "paper";

        // Kullanıcnın seçimi ile bilgisayarın seçimini kıyaslayalım
        if((computerChoice == 0 && userChoice == 1)
                || (computerChoice == 1 && userChoice == 2)
                ||(computerChoice == 2 && userChoice == 0)) {
            System.out.println("The computer is " + computerChoiceStr + ". You are " +  userChoiceStr + ". You won!");
        } else if (computerChoice == userChoice) {
            System.out.println("The computer is " + computerChoiceStr + ". You are " +  userChoiceStr + ". It is a draw!");
        } else {
            System.out.println("The computer is " + computerChoiceStr + ". You are " +  userChoiceStr + ". You lost!");
        }
    }
}
