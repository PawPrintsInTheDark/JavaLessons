import generics.MyGenerics;

public class Main {

    public static void main(String[] args){

        String[] str = {"1","2","3","4","5","6","10","54"};
        String[] str2 = {"1","2","3","4","5","6"};

        System.out.println("Первая проверка:");
        MyGenerics.checkOrder(str,str2);

        //меняем позиции в массиве
        MyGenerics.swap(str, 2,5);
        System.out.println("Вторая проверка:");
        MyGenerics.checkOrder(str,str2);

        System.out.println("Массив после смены элементов местами:");
        for (String s : str){
            System.out.print(s + " ");
        }

    }
}
