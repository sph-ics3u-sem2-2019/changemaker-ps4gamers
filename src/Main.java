import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		//TODO: Here is where your code goes
		double sum = cost-payment;
		System.out.println(cost+" - "+payment+" = "+sum);
		// double sum=in.nextDouble;
		
		int hundreds, fifties, twenties, tens, fives, toonies, loonies,
		quarters, dimes, nickels;
		//amount = in.nextInt();
		
		
		hundreds = (int)(sum/ 100);
		sum= sum % 100;
		fifties = (int)(sum/ 50);
		sum= sum % 50;
		twenties = (int)(sum/ 20);
		sum= sum % 20;
		tens = (int)(sum/ 10);
		sum= sum % 10;
		fives = (int)(sum/ 5);
		sum= sum % 5;
		toonies = (int)(sum/ 2);
		sum= sum % 2;
		loonies = (int)(sum/ 1);
		sum= sum % 1;
		quarters = (int)(sum/ .25);
		sum= sum % .25;
		dimes = (int)(sum/ .10);
	    sum= sum % .10;
		nickels = (int)(sum/ .5);
		sum= sum % .5;

		// System.out.println(sum+ " cents in coins given as:");
		System.out.println(hundreds + "hundreds");
		System.out.println(fifties + "fifties");
		System.out.println(twenties + "twenties");
		System.out.println(tens + "tens");
		System.out.println(fives + "fives");
		System.out.println(toonies + "toonies");
		System.out.println(loonies + "loonies");
	    System.out.println(quarters + " quarters");
	    System.out.println(dimes + " dimes");
	    System.out.println(nickels + " nickels");
		
	    in.close();
	}

}
