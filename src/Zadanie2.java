
    import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Zadanie2 {
        public static void main(String[] args) {
            String input = "email: kostyakostya1991@gmail.com, document number: 2969-3798-71";

            Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
            Pattern docPattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
            Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");

            Matcher emailMatcher = emailPattern.matcher(input);
            Matcher docMatcher = docPattern.matcher(input);
            Matcher phoneMatcher = phonePattern.matcher(input);

            while (emailMatcher.find()) {
                System.out.println("email: " + emailMatcher.group());
            }

            while (docMatcher.find()) {
                System.out.println("document number: " + docMatcher.group());
            }

            while (phoneMatcher.find()) {
                System.out.println("phone number: " + phoneMatcher.group());
            }
        }
    }

