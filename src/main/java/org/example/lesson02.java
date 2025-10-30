package org.example;

public class lesson02 {

    /* задание 1: Создайте метод printThreeWords(),
    который при вызове должен отпечатать в столбец три слова:
    Orange, Banana, Apple*/

    /*public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void main(String[] args) {
        printThreeWords();
    } */


    /* задание 2: Создайте метод checkSumSign(),
    в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите.
    Далее метод должен просуммировать эти переменные, и
    сли их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”*/

    /*public static void checkSumSign() {
        int a = 1;
        int b = 6;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void main(String[] args) {
        checkSumSign();
    } */

    /* задание 3: Создайте метод printColor()
    в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    если больше 100 (100 исключительно) - “Зеленый”
     */

    /*public static void printColor() {
        int value = 78;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value < 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void main(String[] args) {
        printColor();
    } */

    /* задание 4: Создайте метод compareNumbers(),
    в теле которого объявите две int переменные a и b, и инициализируйте их
    любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”
     */

    /*public static void compareNumbers() {
        int a = 96;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void main(String[] args) {
        compareNumbers();
    } */

    /* задание 5:  Напишите метод, принимающий на вход два целых числа и
    проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */

    /*public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int sum = num1 + num2;
        boolean result = sum >= 10 && sum <= 20;
        System.out.println(result);
    } */

    /* задание 6:  Напишите метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */

}


