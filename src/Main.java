import exception.Exception;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Exception.checkingForOdd(8);
        try {
            Exception.checkingForOdd(11);
        }catch (java.lang.Exception e){
            System.out.println(e);
        }

        Exception.checkForNumber("Пять лет назад");
        Exception.checkForNumber("10 лет назад");

    }
}
