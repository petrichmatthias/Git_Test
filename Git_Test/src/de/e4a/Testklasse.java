package de.e4a;

public class Testklasse {
	
	public static void main(String[] args) {

		int[] zahlen = { 1, 2, 3, 4, 5 };
	
		// Ausgabe mit foreach
		for (int z : zahlen) {
			System.out.println(z);
		}

		// Ausgabe mit for
		for (int index = 0; index < zahlen.length; index++) {
			System.out.println(zahlen[index]);
		}

		// ausgabe mit while

		int index = 0;
		while (index < zahlen.length) {
			System.out.println(zahlen[index]);
			index++;
		}
		
		int minimum = min(zahlen);
		System.out.println("Die kleineste Zahl ist: "+minimum);
		
	}
	public static int min (int []array) {
		int min = array[0];
		for(int index = 1; index < array.length; index++){
			if (array[index]<min){
				min = array[index];
			}				
		}return min;
	}
}
