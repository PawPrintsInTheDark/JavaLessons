import generics.MyGenerics;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {

        String[] str = {"1","2","3","4","5","6"};
        String[] str2 = {"1","2","3","4","5","6"};

        MyGenerics generics = new MyGenerics();
        System.out.println("Первая проверка:");
        generics.checkOrder(str,str2);

        //меняем позиции в массиве
        generics.swap(str, 2,5);
        System.out.println("Вторая проверка:");
        generics.checkOrder(str,str2);

        System.out.println("Массив после смены элементов местами:");
        for (String s : str){
            System.out.print(s + " ");
        }


    }
}
