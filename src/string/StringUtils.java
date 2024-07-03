package string;

public class StringUtils {

    public static char[] toCharArray(String[] arr){
        String s = "";
        for (String el : arr) {
            s += el;
        }
        return  s.toCharArray();
    }
}
