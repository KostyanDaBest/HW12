import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String[] words;

        if (input.contains(" ")) {
            words = input.split(" ");
        } else {
            words = new String[]{input};
        }

        for (String word : words) {
            Matcher m = Pattern.compile("[\\p{Lu}]{2,6}").matcher(word);
            while (m.find()) {
                System.out.println( " Аббревиатура: " + m.group());
            }
        }
    }
}



