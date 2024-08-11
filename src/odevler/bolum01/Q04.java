package odevler.bolum01;

public class Q04 {
    //1.4 (Print a table) Write a program that displays the following table:
    public static void main(String[] args) {
        System.out.println("a  a^2  a^3");

        // a = 1 icin
        int a1 = 1;
        int a1Square = a1 * a1;
        int a1Cube = a1 * a1 * a1;
        System.out.println(a1 + "   " + a1Square + "   " + a1Cube);

        // a = 2 icin
        int a2 = 2;
        int a2Square = a2 * a2;
        int a2Cube = a2 * a2 * a2;
        System.out.println(a2 + "   " + a2Square + "   " + a2Cube);

        // a = 3 icin
        int a3 = 3;
        int a3Square = a3 * a3;
        int a3Cube = a3 * a3 * a3;
        System.out.println(a3 + "   " + a3Square + "   " + a3Cube);

        // a = 4 icin
        int a4 = 4;
        int a4Square = a4 * a4;
        int a4Cube = a4 * a4 * a4;
        System.out.println(a4 + "  " + a4Square + "   " + a4Cube);
    }
}
