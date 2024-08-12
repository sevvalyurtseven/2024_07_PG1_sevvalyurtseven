package odevler.bolum01;

public class Q08 {
    // 1.8 (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
                   /* perimeter = 2 * radius * pi
                      area = radius * radius * pi
                   */
    public static void main(String[] args) {
        // Define the radius
        double radius = 5.5;

        // Define the value of pi
        double pi = 3.14159;

        // Calculate the perimeter
        double perimeter = 2 * radius * pi;

        // Calculate the area
        double area = radius * radius * pi;

        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);
    }
}
