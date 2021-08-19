/**
 * 4. Создать класс.
 * В методе main объявить переменную типа double и присвоить ей произвольные числовые значения.
 * Сделать явное приведение переменной к типу int.
 * Результат вывести на консоль.
 */

public class Program004 {

    public static void main(String[] args) {
        double number1 = 2.44;
        int number2 = (int) number1; // Произойдет отсечение дробной части. Для округления использовать (int)Math.round(number1)

        System.out.println(number2);
    }

}
