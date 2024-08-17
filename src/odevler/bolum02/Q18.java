package odevler.bolum02;

public class Q18 {
    /*
2.18 (Print a table) Write a program that displays the following table. Cast floating-point numbers into integers.

Aşağıdaki tabloyu oluşturacak bir program yazınız: Gerçel sayıları tam sayıya dönüştürün.

a         b         pow(a, b)
1         2         1
2         3         8
3         4         81
4         5         1024
5         6         15625

  */
    public static void main(String[] args) {
        // Değişkenleri tanımlayalım
        int a1 = 1, b1 = 2;
        int a2 = 2, b2 = 3;
        int a3 = 3, b3 = 4;
        int a4 = 4, b4 = 5;
        int a5 = 5, b5 = 6;

        // Sonuçları hesaplayıp tam sayıya dönüştürelim
        int result1 = (int)Math.pow(a1, b1);
        int result2 = (int)Math.pow(a2, b2);
        int result3 = (int)Math.pow(a3, b3);
        int result4 = (int)Math.pow(a4, b4);
        int result5 = (int)Math.pow(a5, b5);

        // Tabloyu oluşturalım
        System.out.println();
        System.out.println("a\tb\tpow(a, b)");
        System.out.println(a1 + "\t" + b1 + "\t" + result1);
        System.out.println(a2 + "\t" + b2 + "\t" + result2);
        System.out.println(a3 + "\t" + b3 + "\t" + result3);
        System.out.println(a4 + "\t" + b4 + "\t" + result4);
        System.out.println(a5 + "\t" + b5 + "\t" + result5);


    }
}
