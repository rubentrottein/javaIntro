package test;

public class Start {
	/********* Portée globale de Start *********/
	// Variables primitives (statiques)
	static double d = 0.1;
	static char c = 'c';
	static boolean b = false;

	// Java String est un objet, pas un type primitif
	static String s;
	static String separator = "--------------------";
	// Déclaration des arrays
	
	static int [] originalTab = new int[10];
	static int [] copyTab = new int[10];
	static int [] invertTab = new int[10];
	
	/************** Indispensable méthode main() pour lancer le programme ***************/
	public static void main(String[] args) {

		
		System.out.println("Hello World");
		
		//Variable dans le scope de Main
		int number;
		number = 2;
		
		System.out.print(calculator(number));
		
		
		System.out.println("Mon nombre vaut désormais " + number + ". ");
		
	}
		
		
		
			/******************* Autres méthodes de Start *****************************/
		
		/********* Exercice : Copie des données d'un array vers un autre *********/
		
		

		public static void fill() {

			// Hydratation des arrays
			for(int i =0;i<originalTab.length;i++) {
				originalTab[i] = i;
			}
		}
		
		public static void copy(int [] original, int [] copy) {
			for(int i = 0;i<original.length;i++) {
				copy[i] = original[i];
			}
		}
		
		public static void inversion(int [] original, int [] copy) {
			int [] invert = new int[original.length];
			for(int i =0;i<original.length;i++) {
				invert[invert.length - i - 1] = copy[i];				
			}
		}

		public static void displayTab(String name, int [] tabToPrint) {
			// Affichage des arrays
			
			System.out.println(name);
			for(int valueToPrint : tabToPrint) {
				System.out.println(valueToPrint);			
			}
			System.out.println(separator);
		}
		
		public static int calculator(int i) {
			return 5 + i;
		}
		public static void loop(){
			/*while*/
			int j = 0;
			while(j<5) {
				System.out.println("ok :" + j);
				j++;
			}
			
			// do while
			int k = 0;
			do {
				System.out.println(" variabl k : " + k);
			}
			while(k!=0);
			
			// foreach
			String [] daysOfWeek = new String []{"Lundi","Mardi","Mercredi", "Jeudi", "Vendredi", "Samedi","Dimanche"};
			
			for(String day: daysOfWeek){
				System.out.println(day);
			}
	
		}
		
		public static String conditions(int variableToTest) {
			String ifResponse;
			String switchResponse;
			// if... else
			int l = 0;
			if(l==0) {
				ifResponse = "if l " + l;
			} else if (l>0) {
				ifResponse = "else if " + l;
			} else {
				ifResponse = "else l " + l;
			}
			
			// switch cases
			switch(variableToTest) {
			case 1:
				switchResponse =  "Cas n°1";
				break;
			case 2:
				switchResponse =  "Cas n°2";
				break;
			case 3:
				switchResponse =  "Cas n°3";
				break;
			default :
				switchResponse =  "Default";
			}
			
			return "Resultat du if : " + ifResponse + "Resultat du switch : " + switchResponse;
		}
		
		public static void arrays() {
			//testSwitchVariable(variableToTest);
			int [] tabInt2 = new int[100];
			tabInt2[0] = 0;
			System.out.println(tabInt2);
			System.out.println(separator);
			
			int [] pairTab = new int[100];
			for(int i=0; i<pairTab.length; i++) {
				pairTab[i] = i;
				if(i%2==0) {
					System.out.print(pairTab[i] + " | ");
				}
				//i ? 50 : System.out.println(" firstHalf ");
			}
			
			System.out.println("\n" + separator);
		}
}
