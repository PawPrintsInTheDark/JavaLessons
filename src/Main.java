import annonclasses.Concationble;
import annonclasses.Printable;

public class Main {

    public static void main(String[] args) {
        Printable prOne = () -> System.out.println("Напринетрил полный принтер картинок");
        Printable prTwo = new Printable() {
            @Override
            public void print() {
                System.out.println("System.out.println(\"о_о\");");
            }
        };
        Printable prThree = new Printable() {
            @Override
            public void print() {
                System.out.println("  /\\_/\\  ");
                System.out.println(" ( o.o ) ");
                System.out.println("  > ^ <  ");
            }
        };
        prOne.print();
        prTwo.print();
        prThree.print();

        Concationble sum = new Concationble() {
            @Override
            public String concat(String a, String b) {
                return a+b;
            }
        };
        Concationble reverssum = (a, b) -> b+a;
        Concationble info = (a, b) -> "Первая строка: "+a+"\nВторая строка: "+b;

        System.out.println(sum.concat("Hello "," World"));
        System.out.println(reverssum.concat("Hello ","World "));
        System.out.println(info.concat("Hello ","World "));



    }
}
