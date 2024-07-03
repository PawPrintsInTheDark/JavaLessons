import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,564,76,3,1,9,4,23,67,3,1);
        Map<Boolean, List<Integer>> num = numbers.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));

        for (Map.Entry<Boolean, List<Integer>> item : num.entrySet()){
            if(!item.getKey()) System.out.println("Нечётные числа:");
            if(item.getKey()) System.out.println("Чётные числа:");
            for (Integer i: item.getValue()){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("Только уникальные числа:");
        numbers.stream().distinct().forEachOrdered(e -> System.out.print(e+" "));
    }
}
