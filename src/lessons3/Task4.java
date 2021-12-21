package lessons3;

public class Task4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 11;
        int c = 13;

        if (a == b && b != c || b == c && a != b || a == c && b != c) {
            System.out.println("треугольник равнобедренный");
        } else if (a == b && c == a && b == c) {
            System.out.println("треугольник равноcторонний");
        } else {
            System.out.println("треугольник не равнобедренный");
        }
    }
}
