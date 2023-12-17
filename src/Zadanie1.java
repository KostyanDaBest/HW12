import java.util.Scanner;
import java.util.regex.Pattern;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку (для выхода введите 'exit'):");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String[] words = input.split(" ");

            for (String word : words) {
                if (word.length() >= 2 && word.length() <= 6 && Pattern.matches("^[\\p{Lu}]+$", word)) {
                    System.out.println("Аббревиатура: " + word);
                }
            }
        }
    }
}
