import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter expression : ");
        String getExpression = input.nextLine();
        String[] expression = getExpression.split("[-+*/%]");
        int firstNum = Integer.parseInt(expression[0]);
        int secNum = Integer.parseInt(expression[1]);
        if (getExpression.contains("+")) {
            int sum = firstNum + secNum;
            System.out.println("Answer : " + sum);
        }
        else if (getExpression.contains("-")) {
            int diff = firstNum - secNum;
            System.out.println("Answer : " + diff);
        }
        else if (getExpression.contains("*")) {
            int product = firstNum * secNum;
            System.out.println("Answer : " + product);
        }
        else if (getExpression.contains("/")) {
            if (secNum == 0) {
                System.out.println("Error !! can't divide by zero ");
            }
            else {
                int div = firstNum  / secNum;
                System.out.println("Anser : " + div);
            }
        }
        else {
            if (secNum == 0) {
                System.out.println("Error !! can't divide by zero ");
            }
            else {
                int mod = firstNum % secNum;
                System.out.println("Anser : " + mod);
            }
        }
    }
}
