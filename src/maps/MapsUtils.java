package maps;
import java.util.*;

public class MapsUtils {

    public static <T, V> ArrayList<T> getKeys(Map<T, V> map) {
        ArrayList<T> list = new ArrayList<>();
        for (Map.Entry<T,V> en : map.entrySet()) {
            list.add(en.getKey());
        }
        return list;
    }

    public static <T,V> Map<T,V> sort3(Map<T,V> map){

        HashMap<T,V> names = new HashMap<>();
        for (Map.Entry<T, V> entry : map.entrySet()){
            if (entry.getValue().toString().length() > 3){
                names.put(entry.getKey(), entry.getValue());
            }
        }


        return names;

    }

}
