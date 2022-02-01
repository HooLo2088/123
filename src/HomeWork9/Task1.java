package HomeWork9;

// Написать программу, которая удаляет из коллекции целых чисел все дубликаты, если они есть.
// Коллекцию из 100 элементов заполнить случайными числами (граница - 20).
// Вывести обе коллекции на экран и количество удалённых дубликатов.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            intList.add(randomValue());
        }

        Set<Integer> intSet = new HashSet<>(intList);

        System.out.println(intList);
        System.out.println(intSet);
        System.out.println("Удалено " + (intList.size() - intSet.size()) + " дубликатов");
    }

    public static int randomValue() {
        Random random = new Random();
        return random.nextInt(20);
    }
}