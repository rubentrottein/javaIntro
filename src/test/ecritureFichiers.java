package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ecritureFichiers {
	public static void main (String [] args) {
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("save.txt"));
			bf.write("Test1");
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
