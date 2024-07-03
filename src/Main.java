import arraylist.ListUtils;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Orange");
        list.add("Green");
        System.out.println(ListUtils.find(list,"Orange"));


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(34);
        list2.add(65);
        list2.add(12);
        list2.add(5);
        list2.add(76);
        list2.add(9);
        System.out.println(ListUtils.swapFL(list2));
    }
}
