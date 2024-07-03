import lambda.Expretion;
import lambda.Longer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(54);
        list.add(12);
        list.add(94);
        list.add(19);
        list.add(3);

        Expretion even = Main::isEven;
        System.out.println(sumOfCondition(list, even));

        List<String> list2 = new ArrayList<>();
        list2.add("Программирование");
        list2.add("Язык");
        list2.add("Разработка");
        list2.add("Компьютер");
        list2.add("Наука");
        list2.add("Информатика");
        list2.add("Университет");
        list2.add("Студент");

        Longer oper2 = (l) -> {
            String longestWord = "";
            for (String w : l) {
                if (w.length() > longestWord.length()) {
                    longestWord = w;
                }
            }
            return longestWord;
        };

        System.out.println(oper2.res(list2));
    }

    public static int sumOfCondition(List<Integer> list, Expretion operation) {
        int result = 0;
        for (int i : list) {
            if (operation.isEqual(i)) {
                result += i;
            }
        }
        return result;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }


}
