import java.util.Scanner;

public class Inclass1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your sentence : ");
		String getText = input.nextLine();
		System.out.print("Enter find word : ");
		String getFindWord = input.nextLine();
		int count = 0;
		System.out.print("Found '" + getFindWord + "' at position " );
		int serchWord = getText.indexOf(getFindWord, count);
		while (serchWord != -1) {
			serchWord = getText.indexOf(getFindWord, count);
			if (serchWord != -1) {
				System.out.print(serchWord+1 + " ");
				count +=serchWord+1;
				//continue;
			}	
		}
		
		
	}
}
