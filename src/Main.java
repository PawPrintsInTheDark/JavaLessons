import stream.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("яблоко", "банан", "апельсин", "клубника", "киви", "брокколи", "огурец","ананас","арбуз");
        int count = (int) list.stream().filter(el -> el.startsWith("а")).count();
        System.out.println(count);

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Анна", 25));
        personList.add(new Person("Борис", 30));
        personList.add(new Person("Виктория", 22));
        personList.add(new Person("Григорий", 28));
        personList.add(new Person("Дарья", 35));
        personList.add(new Person("Евгений", 40));
        personList.add(new Person("Жанна", 27));
        personList.add(new Person("Захар", 33));
        personList.add(new Person("Ирина", 29));
        personList.add(new Person("Кирилл", 31));

        personList.stream()
                .filter(person -> person.getAge() > 30).forEach(System.out::println);
    }
}
