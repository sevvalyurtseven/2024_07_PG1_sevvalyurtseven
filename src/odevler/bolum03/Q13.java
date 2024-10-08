package odevler.bolum03;

import java.util.Scanner;

public class Q13 {
    /*
     * 3.13 (Finansal Uygulama: Vergi Hesaplama)
     *
     * Bu program, kullanıcının dosyalama statüsüne (tek yükümlü, evli ve birlikte başvuru,
     * evli ve ayrı başvuru, hane reisi) ve vergiye tabi gelirine (taxable income) bağlı
     * olarak federal gelir vergisini hesaplar.
     *
     * Kullanıcıdan aşağıdaki bilgiler istenecektir:
     * 1. Dosyalama statüsü (0 - Tek Yükümlü (Single filer),
     *    1 - Evli ve Birlikte Başvuru (Married filing jointly),
     *    2 - Evli ve Ayrı Başvuru (Married filing separately),
     *    3 - Hane Reisi (Head of household)).
     * 2. Vergiye tabi gelir (Taxable income).
     *
     * Program daha sonra kullanıcının dosyalama statüsüne uygun vergi dilimlerine
     * göre hesaplama yaparak, ne kadar vergi ödemesi gerektiğini hesaplayacaktır.
     *
     * Her dosyalama statüsü için farklı vergi dilimleri tanımlanmıştır ve gelir
     * bu dilimlere göre vergiye tabi tutulur. Örneğin, "Single filer" için ilk
     * 8,350 dolar gelir %10 oranında vergilendirilir, 8,350 dolardan 33,950 dolara
     * kadar olan gelir %15 oranında vergilendirilir, vb.
     *
     * Program sonunda hesaplanan vergiyi ekranda gösterir.
     * Eğer kullanıcı geçersiz bir dosyalama statüsü girerse, program bir hata mesajı
     * vererek sonlanır.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dosyalama statüsü ve vergiye tabi gelir bilgilerini alalım (0, 1, 2, 3)
        System.out.println("(0 - Single filer, 1 - Married filing jointly, 2 - Married filing separately, 3 - Head of household)");
        System.out.print("Enter your filing status: ");
        int filingStatus = scanner.nextInt();

        System.out.print("Enter your taxable income: ");
        double taxableIncome = scanner.nextDouble();

        // Vergi hesaplama
        double tax = 0;

        switch (filingStatus) {
            case 0: // Single filer
                if(taxableIncome <= 8350) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 33950) {
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <= 82250) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                } else if (taxableIncome <= 171550) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
                break;

            case 1: // Married filing jointly
                if(taxableIncome <= 16700) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 67900) {
                    tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
                } else if (taxableIncome <= 137050) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
                } else if (taxableIncome <= 208850) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (taxableIncome - 208850) * 0.33;
                } else {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
                break;

            case 2: // Married filing separately
                if(taxableIncome <= 8350) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 33950) {
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <= 68525) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                } else if (taxableIncome <= 104425) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
                } else if (taxableIncome <= 186475) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (taxableIncome - 104425) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
                }
                break;

            case 3: // Head of household
                if(taxableIncome <= 11950) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 45500) {
                    tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
                } else if (taxableIncome <= 117450) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
                } else if (taxableIncome <= 190200) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
                } else {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
                break;

            default:
                System.out.println("Error: Invalid filing status");
                System.exit(1);
        }

        // Hesaplanan vergi tutarını ekrana yazdıralım
        System.out.println("Tax is " + tax);
    }
}

