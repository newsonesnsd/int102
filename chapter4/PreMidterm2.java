import java.util.Scanner;

public class PreMidterm2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Random number
        int randomGrade = (int) (Math.random()*5) + 1;
        String grade = "";
        switch (randomGrade) {
            case 1:
                grade = "A";
                break;
            case 2:
                grade = "B";
                break;
            case 3:
                grade = "C";
                break;
            case 4:
                grade = "D";
            case 5:
                grade = "F";
                break;
        }
        System.out.print(grade);
    }
}
