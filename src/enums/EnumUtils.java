package enums;

import java.util.ArrayList;
import java.util.List;

public class EnumUtils {

    public static int getIndex(Alphabet a){
        return a.ordinal();
    }

    public static List<Person> getGender(List<Person> list, Person.Gender gender){
        List<Person> sortlist = new ArrayList<>();
        for (Person p: list){
            if (p.getGender().equals(gender)){
                sortlist.add(p);
            }
        }
        return sortlist;
    }
}
