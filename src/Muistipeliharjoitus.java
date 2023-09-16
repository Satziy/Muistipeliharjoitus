import java.util.Scanner;
import java.util.Random;

public class Muistipeliharjoitus {

	public static void main(String[] args) {
		
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
	}

}
