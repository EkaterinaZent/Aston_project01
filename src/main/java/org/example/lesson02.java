package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class lesson02 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        printThreeWords();
        System.out.println();

        System.out.println("Задание 2:");
        checkSumSign();
        System.out.println();

        System.out.println("Задание 3:");
        printColor();
        System.out.println();

        System.out.println("Задание 4:");
        compareNumbers();
        System.out.println();
    }
    /* задание 1: Создайте метод printThreeWords(),
    который при вызове должен отпечатать в столбец три слова:
    Orange, Banana, Apple*/

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /* задание 2: Создайте метод checkSumSign(),
    в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите.
    Далее метод должен просуммировать эти переменные, и
    сли их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”*/

    public static void checkSumSign() {
        int a = 1;
        int b = 6;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /* задание 3: Создайте метод printColor()
    в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    если больше 100 (100 исключительно) - “Зеленый”
     */

    public static void printColor() {
        int value = 78;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value < 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /* задание 4: Создайте метод compareNumbers(),
    в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”
     */

    public static void compareNumbers() {
        int a = 96;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    System.out.println("Задание 5:"); // не получается вызвать здесь, только блоком
    /* задание 5:  Напишите метод, принимающий на вход два целых числа и
    проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */

    /*public static void main(String[] args) {
        checkSumm(2, 5);
        checkSumm(6, 8);
        checkSumm (9,16);
    public static void checkSumm (int a, int b) {
        System.out.println((a + b) >= 10 && (a + b) <= 20);
    } */
    System.out.println();

    System.out.println("Задание 6:"); // не получается вызвать здесь, только блоком
    /* задание 6:  Напишите метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */

    /*public static void main(String[] args) {
        checkNum(-5);
        checkNum(0);
        checkNum(5);
    }
    public static void checkNum (int num1) {
        if (num1 >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    } */
    System.out.println();

    System.out.println("Задание 7:"); // не получается вызвать здесь, только блоком
    /* задание 7:  Напишите метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом. */

    /*public static void main(String[] args) {
        checkNum2 (-3);
        checkNum2 (0);
        checkNum2 (3);
    }
    public static void checkNum2 (int num2) {
        System.out.println(num2 < 0);
    } */
        System.out.println();

        System.out.println("Задание 8:");
    /* задание 8: Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    /*public static void main(String[] args) {
        printStringXtimes("Один", 1);
        printStringXtimes("Five", 5);
        printStringXtimes("Zwei", 2);
        printStringXtimes("Ноль - тест", 0);
        printStringXtimes("отрицательное - тест", -2);
    }
    public static void printStringXtimes(String string, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(string);
        }
    } */
        System.out.println();

        System.out.println("Задание 9:");
    /* задание 9:  Напишите метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

    /*public static void main(String[] args) {
        System.out.println(visocosnYear(2000));
        System.out.println(visocosnYear(2002));
        System.out.println(visocosnYear(2013));
        System.out.println(visocosnYear(1992));
        System.out.println(visocosnYear(2026));
    }
    public static boolean visocosnYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    } */
        System.out.println();

        System.out.println("Задание 10:");
    /* задание 10: Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    /*public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 1, 0, 1, 1, 0};
        System.out.println("исходный: ");
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        System.out.println("измененный: ");
        System.out.println(Arrays.toString(nums));
    } */
        System.out.println();

        System.out.println("Задание 11:");
    /* задание 11: Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100 */

    /*public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    } */
        System.out.println();

        System.out.println("Задание 12:");
    /* задание 12: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    /*public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("исходный: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("измененный: ");
        System.out.println(Arrays.toString(arr));
    } */
        System.out.println();

        System.out.println("Задание 13:");
    /* задание 13:  Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     Определить элементы одной из диагоналей можно по следующему принципу:
     индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]; */

    /*public static void main(String[] args) {
        int[][] table = new int[7][7];
        for (int i = 0; i < 7; i++) {
            table[i][i] = 1;
            table[i] [6 - i] = 1;
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    } */
        System.out.println();

        System.out.println("Задание 14:");
    /* задание 14: Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
     */

    /*public static void main(String[] args) {
        createArray(10,8);
    }
    public static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    } */


    }
}











