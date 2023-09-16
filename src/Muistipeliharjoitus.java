import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Muistipeliharjoitus {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
		
		//Esitellään muistipeli ja muuttujat
						
		Random random = new Random();
		int[] randomNumbers = new int[7]; //sattumanvaraisten numeroiden taulukko
		int[] answer= new int[7];		  //pelaajan arvaamien numeroiden taulukko
		int i=0;
		
		System.out.println("Muistipeli\n*************");
		System.out.println("Yritä muistaa alla olevat numerot.\nNäet numerot 3 sekunnin ajan.");
		
		
		//peli arpoo sattumanvaraisesti 7 numeroa väliltä 1-5
		
		for (i=0; i<randomNumbers.length; i++)
			
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
		
		for (i = 0; i < 20; ++i) 
		System.out.println();
		
		
		//Pelaaja syöttää muistamansa numerot
		
		for (i=0; i<answer.length; i++)
			
			{
			System.out.println("Syötä " + (i+1) + "." +  " numero:");
			answer[i] =Integer.parseInt(in.nextLine());
			}
		
		//Peli kertoo mitkä olivat pelaajan arvaamat numerot
		
		System.out.print("Sinun numerosi olivat: " );
		
		for (i=0; i<answer.length; i++)
			{
			System.out.print(answer[i]);
			}	
		
		//Peli kertoo mitkä olivat oikeat numerot
				
		System.out.print("\nOikeat numerot olivat: ");
		
		
		for (i=0; i<randomNumbers.length; i++)
			
		{
		
		System.out.print(randomNumbers[i]);
		
		}
		
		System.out.println("\n\nKiitos pelaamisesta!");
		
			
		
	}

}
