import java.io.*;

public class chick {
    public static void main(String[] args) throws Exception {
        FileReader fileInput = new FileReader("E:/SIT/2559/1sem/int102/chapter5/chicken.txt");
        BufferedReader readFile = new BufferedReader(fileInput);
        String textReader = readFile.readLine();
        String text = "";
        while (textReader != null) {
            text += textReader+ "\n";
            textReader = readFile.readLine();
        }
        System.out.println(text);
    }
}
