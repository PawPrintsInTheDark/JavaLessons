import array.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        ArrayUtils.reverse(array);

        double[] carr = {1.9, 32.2, 9.0, 0.4, 3.3, 0.1, 54.0};
        ArrayUtils.sort(carr);

        int[] arr = {6, 117, 44, 5, 32, 81, 9};
        System.out.print("Чётные элементы массива: ");
        ArrayUtils.onlyEven(arr);

    }
}
