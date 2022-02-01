package HomeWork9;

//  Написать программу, которая вместо золушки сортирует числа из начальной коллекции на 3 кучки:
//  в первую - числа которые нацело делятся на 2,
//  во вторую - числа которые делятся на 3,
//  в третью - все остальные, которые не подходят под первые 2.
//  Если число делится и на 2 и на 3, то оно попадает в обе кучки.
//  Начальную коллекцию из 100 элеметов заполнить случайными числами (граничное значение 500)

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> intList100 = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            intList100.add(randomValue());
        }

        List<Integer> intList2 = new ArrayList<>(intList100);
        intList2.removeIf(integer -> integer % 2 != 0);

        List<Integer> intList3 = new ArrayList<>(intList100);
        intList3.removeIf(integer -> integer % 3 != 0);

        List<Integer> intAl = new ArrayList<>(intList100);
        intAl.removeIf(integer -> integer % 2 == 0);

        List<Integer> intAll = new ArrayList<>(intAl);
        intAll.removeIf(integer -> integer % 3 == 0);

        System.out.println(intList100);
        System.out.println(intList2);
        System.out.println(intList3);
        System.out.println(intAll);
    }


    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(500);
    }
}