package odevler.bolum02;

import java.util.Scanner;

public class Q13 {
    /*
2.13 (Finansal uygulama: bileşik değer) Ayda 100 $ tasarruf ettiğinizi ve yıllık faiz oranının %5 olduğunu varsayalım. Bu durumda aylık faiz oranı 0.05 / 12 = 0.00417 olur.

                  İlk ayın sonunda, hesaptaki değer şu şekilde olur:
                  100 * (1 + 0.00417) = 100.417
                  İkinci ayın sonunda, hesaptaki değer şu şekilde olur:
                  (100 + 100.417) * (1 + 0.00417) = 201.252
                  Üçüncü ayın sonunda, hesaptaki değer şu şekilde olur:
                  (100 + 201.252) * (1 + 0.00417) = 302.507
ve bu şekilde devam eder.

Kullanıcıdan aylık tasarruf miktarını girmesini isteyen ve altıncı ayın sonunda hesaptaki değeri gösteren bir program yazın.

ÖRNEK:
Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan aylık tasarruf miktarını girmesini isteyelim
        System.out.println("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();

        // Yıllık faiz oranı ve aylık faiz oranı
        double annualRate = 0.05;
        double monthlyRate = annualRate / 12;

        // Her ayın sonunda hesaptaki değer
        double month1 = monthlySaving * (1 + monthlyRate);
        double month2 = (monthlySaving + month1) * (1 + monthlyRate);
        double month3 = (monthlySaving + month2) * (1 + monthlyRate);
        double month4 = (monthlySaving + month3) * (1 + monthlyRate);
        double month5 = (monthlySaving + month4) * (1 + monthlyRate);
        double month6 = (monthlySaving + month5) * (1 + monthlyRate);

        // 6 ayın sonunda hesaptaki değer
        System.out.println("After the sixth month, the account value is $" + month6);

    }
}
