import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        // Generate Number
        int randomFirstNum = (int) (Math.random()*10);
        int randomSecondNum = (int) (Math.random()*10);
        while (randomFirstNum == randomSecondNum) {
            randomSecondNum = (int) (Math.random()*10);
        }
        int randomThirdNum = (int) (Math.random()*10);
        while (randomThirdNum == randomFirstNumdNum || randomThirdNum == randomSecondNum) {
            randomThirdNum = (int) (Math.random()*10);
        }
        int threeDigit = (randomFirstNum*100)+(randomSecondNum*10)+randomThirdNum;
        System.out.println("Random is " + threeDigit);
        int[] allRandomNum = {randomFirstNum, randomSecondNum, randomThirdNum};
        Arrays.sort(allRandomNum);
        System.out.println(Arrays.asList(allRandomNum));
    }
}
