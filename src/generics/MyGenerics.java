package generics;

public class MyGenerics {

    public static <T> void swap(T[] t, int idx, int idx2) {
        T temp = t[idx];
        t[idx] = t[idx2];
        t[idx2] = temp;
    }

    public static <T> Boolean checkOrder(T[] t, T[] t2) {
        T[] temp,temp2;
        if (t.length <= t2.length) {
            temp = t;
            temp2 = t2;
        }else {
            temp = t2;
            temp2 = t;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i].equals(temp2[i])) return true;
        }
        return false;
    }
}
