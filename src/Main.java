public class Main {
    public static void main(String[] args) {


//        Задача 1

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

//        Задача 2

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

//        Задача 3

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

//        Задача 4

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

//        Задача 5

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

//        Задача 6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

//        Задача 7

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

//        Задача 8

        int total = 0;
        int savings = 29000;
        for (int i = 1; i <= 12; i = i + 1) {
            total = savings + total;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

//        Задача 9

        int total1 = 0;
        int savings1 = 29000;
        for (int i = 1; i <= 12; i = i + 1) {
            total1 = total1 + total1/100;
            total1 = savings1 + total1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }

//        Задача 10

        int number = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(number + " * " + i + " = " + number * i);
        }


    }
}