import java.util.Scanner;

public class CheckInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create VARIABLE for min max value of data type
        final long byteMin = Byte.MIN_VALUE;
        final long byteMax = Byte.MAX_VALUE;
        final long shortMin = Short.MIN_VALUE;
        final long shortMax = Short.MAX_VALUE;
        final long intMin = Integer.MIN_VALUE;
        final long intMax = Integer.MAX_VALUE;
        final long longMin = Long.MIN_VALUE;
        final long longMax = Long.MAX_VALUE;
        String typeOfInt = "";
        System.out.print("Enter your integer : ");
        Long getNum = input.nextLong();
        if (getNum >=longMin && getNum <= longMax) {
            typeOfInt += "long";
        }
        if (getNum >= intMin && getNum <= intMax) {
            typeOfInt += ", int";
        }
        if (getNum >= shortMin && getNum <= shortMax) {
            typeOfInt += ", short";
        }
        if (getNum >= byteMin && getNum <= byteMax) {
            typeOfInt += ", byte";
        }
        System.out.println(typeOfInt);
    }
}
