import java.util.Scanner;

public class Inclass1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int searchWord = 0;
		String getText, getFindWord;
		System.out.print("Enter your sentence : ");
		getText = input.nextLine();
		System.out.print("Enter find word : ");
		getFindWord = input.nextLine();
		System.out.print("Found '" + getFindWord + "' at position " );
		searchWord = getText.indexOf(getFindWord, count);
		while (searchWord != -1) {
			searchWord = getText.indexOf(getFindWord, count);
			if (searchWord != -1) {
				System.out.print(++searchWord + " ");
				count +=searchWord;
			}	
		}
		
		
	}
}
