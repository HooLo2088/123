package lessons4;

import java.util.Random;
import java.util.RandomAccess;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = value();
        }

        for (int arrEl : arr) {
            System.out.println(arrEl);
        }

        System.out.println("===============================");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }

            System.out.println(arr[i]);
        }
    }

    public static int value() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
