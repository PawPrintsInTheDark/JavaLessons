package enums;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя:" + name +
                ", Возраст: " + age +
                ", Пол: " + gender.getType() +
                '}';
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public enum Gender{
        MALE("Мужской"), FEMALE("Женский");

        public String getType() {
            return type;
        }

        private String type;
        Gender(String gender) {
            this.type = gender;
        }
    }
}
