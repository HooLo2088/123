package HomeWork9;

// Создать программу - список покупок.
// В список вносится название товара и количество.
// Список заполнить случайными товарами.
// В конце вывести общее количество товаров, добавленных в список.


import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> buyList = new HashMap<>();
        buyList.put("apple", 2);
        buyList.put("sumsung", 1);
        buyList.put("lenovo", 0);
        buyList.put("beer", 100500);

        int i = buyList.get("apple") + buyList.get("sumsung") + buyList.get("lenovo") + buyList.get("beer");
        System.out.println(i);
    }
}