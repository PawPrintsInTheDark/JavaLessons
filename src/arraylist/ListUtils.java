package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtils {

    public static <T> Boolean find(ArrayList<T> list, T el ){
        for (T l : list){
            if(l.equals(el)) return true;
        }
        return false;
    }

    public static <T> LinkedList<T> swapFL(LinkedList<T> list){
        T temp = list.getFirst();
        list.set(0, list.getLast());
        list.set(list.size()-1, temp);
        return list;
    }
}
