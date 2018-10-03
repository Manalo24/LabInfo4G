package esattamenteUnaCoppia;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class EsattamenteUnaCoppia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dimensioneVett;
		
		System.out.println("Inserisci Dimensione Vettore:");
		dimensioneVett = sc.nextInt();
		
		vett = new int[dimensioneVett];
		
		randomVett(0, 10);
		coppie();
	}

	static int[] vett;
	public static void randomVett(int min, int max) {
		for (int i = 0; i < vett.length; i++) {
			vett[i] = (int)(Math.random()*10);
			System.out.println(" " + vett[i]);
		}
	}
	public static void coppie() {
		int coppia = 0;
		int i;
		int j;
		for ( i = 0; i < vett.length; i++) {
			for ( j = i+1; j < vett.length; j++) {
				if (vett[i]==vett[j]) {
					
						coppia++;
				}
			}

		}
		if (coppia == 1) {
			System.out.println("C'è solo una coppia");
		}else {
			System.out.println("C'è piu di una coppia o non c'è");
		}

	}
}
