import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};
        OptionalInt res = Arrays.stream(numbers).filter(e -> e % 2 == 0).max();
        System.out.println("Максимальное число из чётных:");
        System.out.println(res.getAsInt());

        String str = "Привет, Александр, с праздником, с Новым Годом";
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
        }
        System.out.println(result);
    }
}
