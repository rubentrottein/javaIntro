package test;
import java.util.Random;

public class randomizer {

	public static void main(String[] args) {
		randomTab();
	}
	
	public static int getRandomNumberUsingNextInt(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}
	
	public static int [] randomTab() {
		int [] tab = new int[1000];
		for(int i=0;i<tab.length;i++) {
			tab[i] = getRandomNumberUsingNextInt(0,10);
			System.out.println(tab[i]);
			//System.out.println("Case " + [i] + "= " + tab[1]);
		}
		int [] testTab = {0,0,0,1,1,2,2,2,2,2,2,3,4,5};
		System.out.println("Combo max : " + chain(testTab));
		return tab;
	}
	
	public static int chain(int[] tab) {
		//En vrai ça marche pas mdr
		int currentCase = 0;
		int chain = 0;
		int combo = 0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i] == currentCase) {
				chain++;
				if(chain >= combo) {
					combo = chain;
				} 				
			} else {
				tab[i] = currentCase;
				chain = 0;
			}
		}
		return combo;
	}
	
	/*
	for(int data : randomTab()) {
		System.out.println(data);
	}
	*/

}
