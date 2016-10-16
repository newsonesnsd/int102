import java.io.*;

public class Homework6 {
    public static void main(String[] args) throws Exception {
        FileReader fileInput = new FileReader("E:/SIT/2559/1sem/int102/chapter5/testInput.txt");
        BufferedReader readFile = new BufferedReader(fileInput);
        String textReader = readFile.readLine();
        String text = "";
        int lineCount = 0;
        while (textReader != null) {
            text += textReader + "\n";
            textReader = readFile.readLine();
            lineCount++;
        }
        text = text.trim(); // Delete new line
        System.out.println("Textfile : \n\"" + text + "\"");
        int spaceCount = text.length() - text.replace(" ", "").length();
        int wordCount = spaceCount + lineCount;
        System.out.println("Found : " + wordCount + " words");
    }
}
