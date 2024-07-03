import string.StringUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] stringArray = {"ab", "cd", "ef"};
        System.out.println(Arrays.toString(StringUtils.toCharArray(stringArray)));

        String stroke = "12345";
        System.out.println(stroke.replace(stroke.substring(1,stroke.length()-1), ""));

        String st = "1203405";
        System.out.println(st.indexOf("0"));
    }
}
