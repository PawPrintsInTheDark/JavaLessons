import sets.SetUtils;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Yellow");
        hashSet.add("Green");
        hashSet.add("Orange");

LinkedHashSet<String> hashSet2 = new LinkedHashSet<>();
        hashSet2.add("Black");
        hashSet2.add("Orange");
        hashSet2.add("Silver");
        hashSet2.add("Red");
        System.out.println(SetUtils.retainCommonElements(hashSet,hashSet2));

HashSet<Integer> intset = new HashSet<>();
        intset.add(12);
        intset.add(43);
        intset.add(13);
        intset.add(1);
        intset.add(65);
        intset.add(93);
        intset.add(76);
        intset.add(5);

        SetUtils.something(intset);

    }
}
