package generics;

public class MyGenerics <T> {

    public void swap(T[] t, int idx, int idx2){
        T temp = t[idx];
        t[idx] = t[idx2];
        t[idx2] = temp;
    }

    public void checkOrder(T[] t, T[] t2){
        Boolean equal = false;

        if (t.length != t2.length) {
            System.out.println(equal);
            return;
        }

        for (int i = 0; i < t.length; i++) {
            if(t[i].equals(t2[i])) {
                equal = true;
            }else equal = false;
        }
        System.out.println(equal);
    }
}
