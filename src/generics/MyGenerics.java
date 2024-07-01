package generics;

public class MyGenerics {

    public static <T> void swap(T[] t, int idx, int idx2) {
        T temp = t[idx];
        t[idx] = t[idx2];
        t[idx2] = temp;
    }

    public static <T> void checkOrder(T[] t, T[] t2) {
        Boolean equal = false;
        T[] temp,temp2;
        if (t.length <= t2.length) {
            temp = t;
            temp2 = t2;
        }else {
            temp = t2;
            temp2 = t;
        }
        for (int i = 0; i < temp.length; i++) {
            equal = temp[i].equals(temp2[i]);
        }
        System.out.println(equal);
    }
}
