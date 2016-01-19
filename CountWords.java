package textTransformatons;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args){
		
		Scanner user = new Scanner(System.in);
		System.out.println("Enter in sentence to determine word count: ");
		String input = user.nextLine();
		
		System.out.println("There are " + wordCounter(input) + " words in this input.");
	}
	public static int wordCounter(String nString){
		String[] words = nString.split(" ");
		
		return words.length;
	}
}
