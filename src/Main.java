import enums.Alphabet;
import enums.EnumUtils;
import enums.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(EnumUtils.getIndex(Alphabet.F));

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Анна", 25, Person.Gender.FEMALE));
        personList.add(new Person("Иван", 30, Person.Gender.MALE));
        personList.add(new Person("Мария", 22, Person.Gender.FEMALE));
        personList.add(new Person("Петр", 28, Person.Gender.MALE));
        personList.add(new Person("Екатерина", 35, Person.Gender.FEMALE));
        personList.add(new Person("Алексей", 40, Person.Gender.MALE));
        personList.add(new Person("Ольга", 20, Person.Gender.FEMALE));
        personList.add(new Person("Дмитрий", 33, Person.Gender.MALE));
        personList.add(new Person("Наталья", 27, Person.Gender.FEMALE));
        personList.add(new Person("Сергей", 29, Person.Gender.MALE));

        for (Person person : EnumUtils.getGender(personList,Person.Gender.FEMALE)) {
            System.out.println(person.toString());
        }

    }


}
