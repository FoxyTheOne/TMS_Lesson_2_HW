/**
 * 2. Создать класс.
 * В методе main объявить четрые переменные типа int и присвоить им произвольные числовые значения.
 * Первая переменная должна быть в двоичном формате, вторая - в восьмеричном, третья - в десячином, четрветая в шестнадцатиричном.
 * Вывести результат на консоль.
 */

public class Program002 {

    public static void main(String[] args) {
        int number1 = 0b01010101; // Двоичный формат
        int number2 = 01234567; // Восьмеричный формат (начинаем с 0, далее цифры от 0 до 7)
        int number3 = 3; // Десятичный формат
        int number4 = 0x41238645; // Шестнадцатиричный формат (Допустимые цифры — от 0 до 15, где числа 10-15 обозначаются символами A-F соответственно)

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
    }

}
