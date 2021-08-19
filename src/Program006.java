import java.util.Scanner;

/**
 * 6. Создать класс.
 * В методе main получить введенное с консоли слово и вывести на консоль выражение:
 * введенное слово "и_тут_в_кавычках_должно_быть_введенное_слово".
 */

public class Program006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write me any word: ");

        String anyWord = sc.nextLine();

        System.out.println("введенное слово \"" + anyWord + "\"");
    }

}
