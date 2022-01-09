package lessons4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = value();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("======================");
        System.out.println(sum / arr.length);
    }

    public static int value() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
