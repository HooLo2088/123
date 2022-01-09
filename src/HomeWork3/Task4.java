package lessons3;

public class Task4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 12;
        int c = 11;

        if (a == b && b != c || b == c && a != b || a == c && b != c) {
            System.out.println("треугольник равнобедренный");
        } else if (a == b && c == a && b == c) {
            System.out.println("треугольник не равнобедренный, но равносторонний");
        } else {
            System.out.println("просто треугольник:)");
        }
    }
}
