/**
 * 5. Создать класс.
 * В методе main объявить две переменные.
 * Первую переменную объявить типом char и присвоить значение 1, вторую переменную объявить типом int и присвоить занчение 1.
 * Вывести на консоль результат первая переменная + вторая переменная.
 * Подумать над полученным результатом.
 */

public class Program005 {

    public static void main(String[] args) {
        char number1 = 1;
        int number2 = 1;
        int result = number1 + number2; // Произошло неявное приведение типов. Тип char приводится к числовым типам, как код символа в системе unicode

        System.out.println(result);
    }

}
