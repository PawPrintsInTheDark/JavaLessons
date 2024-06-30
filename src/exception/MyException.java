package exception;

public class MyException {

    public static void checkingForOdd(int i) throws java.lang.Exception {
        if(i % 2 == 1) throw new java.lang.Exception("Ошибка! Число нечётное");
        System.out.println("Число "+i+" чётное");
    }
    public static void checkForNumber(String s) throws java.lang.Exception {
        if(s.matches(".*\\d.*")) throw new java.lang.Exception("Ошибка! Строка содержит числа");
        System.out.println("Строка: \""+s+"\" не содержит числа");
    }
}
