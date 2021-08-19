/**
 * 1. Создать класс.
 * В методе main объявить три переменные типа int и присвоить первой числовое значение,
 * вторая переменная равна первой переменной увеличенной на 3, а третья переменная равна сумме первых двух.
 * Вывести результат на консоль.
 */

public class Program001 {

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = number1 + 3;
        int number3 = number1 + number2;

        System.out.println("First number is " + number1);
        System.out.println("Second number is " + number2);
        System.out.println("Third number is " + number3);
    }

}
