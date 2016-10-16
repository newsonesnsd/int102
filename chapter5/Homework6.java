import java.io.*;

public class Homework6 {
    public static void main(String[] args) throws Exception {
        FileReader fileInput = new FileReader("E:/SIT/2559/1sem/int102/chapter5/testInput.txt");
        BufferedReader readFile = new BufferedReader(fileInput);
        String textReader = readFile.readLine();
        String text = "";
        while (textReader != null) {
            text += textReader+ "\n";
            textReader = readFile.readLine();
        }
        System.out.println("Textfile : "+ "\""+ text + "\"");
        int spaceCount = text.length() - text.replaceAll(" ", "").length();
        int wordCount = spaceCount + 1;
        System.out.println("Found : " + wordCount + " words");
    }
}
