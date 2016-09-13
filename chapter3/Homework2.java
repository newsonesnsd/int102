import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Subject 1
        System.out.print("Subject 1 : ");
        String firstSubject = input.next();
        System.out.print("Credits subject 1 : ");
        int firstSubjectCredit = input.nextInt();
        // Subject 2
        System.out.print("Subject 2 : ");
        String secondSubject = input.next();
        System.out.print("Credits subject 2 : ");
        int secondSubjectCredit = input.nextInt();
        // Subject 3
        System.out.print("Subject 3 : ");
        String thirdSubject = input.next();
        System.out.print("Credits subject 3 : ");
        int thirdSubjectCredit = input.nextInt();
        // Sum
        int sumCredit = firstSubjectCredit + secondSubjectCredit + thirdSubjectCredit;
        sumCredit = sumCredit * 1000;
        System.out.print("sum = " + sumCredit);
    }
}
