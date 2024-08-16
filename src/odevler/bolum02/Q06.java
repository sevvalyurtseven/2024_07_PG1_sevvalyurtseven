package odevler.bolum02;

import java.util.Scanner;

public class Q06 {
    /*
  2.6 (Bir tamsayıdaki rakamların toplamı)
  0 ile 1000 arasında bir tamsayı okuyan ve bu tamsayının tüm rakamlarının toplamını hesaplayan bir program yazın.

  Örneğin, tamsayı 932 ise, tüm rakamlarının toplamı 14'tür.

  İpucu: Rakamları çıkarmak için % (mod) operatörünü, çıkarılan rakamı kaldırmak için / (bölme) operatörünü kullanın.

  Örneğin, 932 % 10 = 2 ve 932 / 10 = 93.

  Örnek:
  Enter a number between 0 and 1000: 999
  The sum of the digits is 27
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 0 ile 1000 arasında bir tamsayı girmesini isteyelim.
        System.out.println("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();

        // Girilen tamsayının her bir basamagındaki sayıyı tek tek bulalım.
        int birlerBasamagi = number % 10;
        int onlarBasamagi = (number / 10) % 10;
        int yuzlerBasamagi = (number / 100) % 10;
        int binlerBasamagi = number / 1000;

        // Girilen tam sayının her bir basamagındaki rakamın toplamını bulalım
        int sum = birlerBasamagi + onlarBasamagi + yuzlerBasamagi + binlerBasamagi;

        // Sonucu ekrana yazdıralım
        System.out.println("The sum of the digits is " + sum);


    }

}
