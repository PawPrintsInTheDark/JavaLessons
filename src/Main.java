import maps.MapsUtils;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Дуб");
        map.put(236, "Ель");
        map.put(7, "Ясень");
        map.put(17, "Акация");
        map.put(54, "Берёза");
        map.put(4, "Сакура");

        System.out.println(MapsUtils.getKeys(map));

        System.out.println(MapsUtils.sort3(map));
    }
}
