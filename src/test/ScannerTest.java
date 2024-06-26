package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		scan("Entrez un mot ou texte");
	}
	
	public static String scan(String message) {
		Scanner userInput = new Scanner(System.in);
		String stringUserInput = "0";
		try {
			System.out.println(message);
			stringUserInput = userInput.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Erreur : " + e);			
		}
		System.out.println(testAs(stringUserInput));
		
		return stringUserInput;
	}
	public static int testAs(String message) {
		int count = 0;
		for(char letter : message.toCharArray()) {
			if(letter == 'a') {
				count++;
			}
		}
		return count;
	}

}
