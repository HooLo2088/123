package lessons3;

//Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
//если переменная “number” типа int нечетная. Или “Even Number” если переменная
//четная. Программа всегда должна перед выходом печатать “BYE”



public class Task1 {
    public static void main(String[] args) {
        int number = 17;

        int i = number %2;

        if (i == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("bye");
    }
}
