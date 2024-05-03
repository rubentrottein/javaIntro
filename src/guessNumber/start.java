package guessNumber;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class start {
	
	static boolean run = true;
	static int numberToGuess = 0;
	static int attempts = 0;
	
	public static void main(String[] args) {

		defineNumberToGuess();
		System.out.println("Devinez notre nombre entre 1 et 100 !");
		
		// System.out.println(numberToGuess);
		
		do {
			//On relance le choix tant que le programme tourne.
			playerGuess();
		} while (run);
	}
	
	public static void defineNumberToGuess() {
		// On choisit le nombre a deviner et on le stocke dans une variable
		Random random = new Random();
		//Random génère un chiffre de 0 a random.nextInt(max); soit 99
		numberToGuess = random.nextInt(100)+1;
	}
	
	public static boolean playerGuess() {
		// On recueille le chois de l'utilisateur pour le tester
		System.out.println("Votre Proposition : ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		try {
			if(userInput>100 || userInput<0) {
				return false;
			} else {					
				return comparison(userInput, numberToGuess);
			}
		}
		catch (InputMismatchException e){
			System.err.print(e);
			return false;
		}
	}
	
	public static boolean comparison(int a, int b) {
		attempts++;
		System.out.println("Tentatives : " + attempts);
		if(a == b) {			
			System.out.println("Le numéro caché était bien " + numberToGuess + ". Félicitations !!");
			System.out.println("Tentatives totales : " + attempts);
			//Le jeu est fini, on sort du programme
			run = false;
			return true;
		} if (a > b) {
			System.out.println("C'est moins!");
			return false;
		} if (a < b) {
			System.out.println("C'est plus!");
			return false;
		} else {
			//problèmes de saisie, etc. On reprend le programme en ignorant
			System.out.println("Erreur !");
			return false;
		}
	}
}
