package array;

import java.util.Arrays;

public class ArrayUtils {

    public static void reverse(int[] arr){
        int[] rev = new int[arr.length];
        for (int i = arr.length-1, j = 0; i >= 0; i--,j++) {
            rev[j] = arr[i];
        }
        System.out.println("Отзеркаленный массив "+Arrays.toString(rev));
    }

    public static void sort(double[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] > arr[j]){
                    double temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: "+Arrays.toString(arr));
    }

    public static void onlyEven(int[] arr){
        for (int i: arr){
            if(i % 2 == 0) System.out.print(i+" ");
        }
    }
}
