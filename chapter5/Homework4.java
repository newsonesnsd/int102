import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        // Generate Number
        int randomFirstNum = (int) (Math.random()*9)+1;
        int randomSecondNum = (int) (Math.random()*10);
        while (randomFirstNum == randomSecondNum) {
            randomSecondNum = (int) (Math.random()*10);
        }
        int randomThirdNum = (int) (Math.random()*10);
        while (randomThirdNum == randomFirstNum || randomThirdNum == randomSecondNum) {
            randomThirdNum = (int) (Math.random()*10);
        }
        String threeDigit = randomFirstNum+""+randomSecondNum+randomThirdNum;
        System.out.println("Random is " + threeDigit);
        System.out.print("Sort num : " );
        int[] allRandomNum = {randomFirstNum, randomSecondNum, randomThirdNum};
        Arrays.sort(allRandomNum);
        String sortedNum = "";
        for (int i = 0; i < 3; i++) {
            System.out.print(allRandomNum[i]);
            sortedNum+=allRandomNum[i];
        }
        System.out.println("\n"+sortedNum+".00");
    }
}
