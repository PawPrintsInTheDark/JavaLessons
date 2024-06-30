package file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
    public static void adder() throws IOException {
        File file = new File("src/file/text.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите данные для записи");
        FileWriter fileWriter = new FileWriter(file);
        String s = "";
        while (!s.equals("0")) {
            s = scanner.next();
            if (!s.equals("0")) {
                fileWriter.write(s + "\n");
                System.out.println("Введите что-нибудь еще");
            }
        }
        fileWriter.close();

    }

}
