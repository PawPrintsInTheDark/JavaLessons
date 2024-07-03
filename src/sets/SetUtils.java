package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetUtils {

    public static <T> Set<T> retainCommonElements(Set<T> set1, Set<T> set2) {
        Set<T> comEl = new HashSet<>(set1);
        comEl.retainAll(set2);
        return comEl;
    }

    public static void something(Set<Integer> set1) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Числа больше 15 и являющиеся чётными:");
        for (int el : set1) {
            if (el > 15 && el % 2 == 0) {
                System.out.print(el);
            }else list.add(el);
        }
        System.out.println("\nОстальные числа делённые на 2");
        for (int el: list){
            System.out.print(el / 2.0);
            System.out.print(" ");
        }
    }


}