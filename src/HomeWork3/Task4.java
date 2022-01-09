package HomeWork3;

public class Task4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 10;

        if (a == b && b != c || b == c && a != b || a == c && b != c) {
            System.out.println("треугольник равнобедренный");
        } else if (a == b && c == a && b == c) {
            System.out.println("треугольник не равнобедренный, а равносторонний");
        } else {
            System.out.println("просто треугольник:)");
        }
    }
}
