import java.util.Scanner;
import java.util.Random;

public class Muistipeliharjoitus {

	public static void main(String[] args) {
		
		//Esitellään muistipeli ja peli arpoo sattumanvaraisesti 7 numeroa väliltä 1-5
		
		System.out.println("Muistipeli\n*************");
		System.out.println("Yritä muistaa alla olevat numerot.\nNäet numerot 3 sekunnin ajan.");
		
		Random random = new Random();
		int[] randomNumbers = new int[7];
		
		for (int i=0; i<randomNumbers.length; i++)
		{
		randomNumbers[i] = random.nextInt(5);
		System.out.print(randomNumbers[i] + " ");
		
		}
		System.out.print(" (3 sekunnin jälkeen ruutu tyhjennetään)");
		
		//Peliin 3 sekunnin tauko
		
		try
		
		{
			Thread.sleep(3000);
		}	
		
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		
		for (int i = 0; i < 20; ++i) System.out.println();
		
		
		
	}

}
