package odevler.bolum01;

public class Q13 {
    /*
     * 1.13 (Algebra: solve 2 * 2 linear equations)
     * You can use Cramer's rule to solve the following 2 * 2 system of linear equations:
     *
     * (Cebir: 2 x 2 doğrusal denklemi çözün)
     * Aşağıdaki 2x2 doğrusal denklem sisteminin çözümü için Cramer kuralını kullanabilirsiniz.
     *
     * ax + by = e   x = (ed - bf) / (ad - bc)
     * cx + dy = f   y = (af - ec) / (ad - bc)
     *
     * Write a program that solves the following equation and displays the value for x and y:
     *
     * Aşağıdaki denklemi çözüp x ve y'nin değerlerini gösteren bir program yazınız:
     *
     * 3.4x + 50.2y = 44.5
     * 2.1x + .55y  = 5.9
     */
    public static void main(String[] args) {
        // Katsayilar
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        // x ve y'nin Cramer Kuralı ile hesaplanmasi
        double denominator = (a * d) - (b * c);
        double x = (e * d - b * f) / denominator;
        double y = (a * f - e * c) / denominator;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
