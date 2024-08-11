package odevler.bolum01;

public class Q07 {
    public static void main(String[] args) {
        /*
         * 1.7 (Approximate p) π can be computed using the following formula:
         *
         * π = 4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... )
         *
         * Write a program that displays the result of
         *
         * 4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 )
         *
         * 4 × ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 )
         *
         * Use 1.0 instead of 1 in your program.
         */

        // Common part of the expression
        double commonExpression = 1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11);

        // First approximation
        double piApprox1 = 4 * commonExpression;

        // Second approximation
        double piApprox2 = 4 * (commonExpression + (1.0 / 13));

        System.out.println("First approximation of π: " + piApprox1);
        System.out.println("Second approximation of π: " + piApprox2);

    }
}
