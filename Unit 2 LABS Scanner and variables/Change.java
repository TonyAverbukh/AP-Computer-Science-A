/**
 * Change.java  9/11/2012
 *
 * @author - Lewis and Loftus
 * Write an application that prompts for and reads a double value
 * representing a monetary amount.  Then determine the fewest number
 * of each bill and coin needed to represent that amount, starting with
 * the highest (assume that a ten dollar bill is the maximum needed).
 * For example,if the value entered is 47.63 (forty seven dollars and 63 cents),
 * then the program should print the equivalent amount as:
 *
 * 4 ten dollar bills
 * 1 five dollar bills
 * 2 one dollar bills
 * 2 quarters
 * 1 dime
 * 0 nickles
 * 3 pennies
 *
 */

import java.util.Scanner;

public class Change
{
	public static void main(String [] args)
	{
		double amount;
		double oneDollar, fiveDollar, tenDollar;
		double penny, nickel, dime, quarter;


		Scanner scan = new Scanner(System.in);

		System.out.print("What is the amount? ");
		amount = scan.nextDouble();

		System.out.println();
		
		tenDollar = amount / 10;
		amount = amount %10;

		fiveDollar = amount / 5;
		amount = amount % 5;

		oneDollar = amount / 1;
		amount = amount % 1;

		quarter = amount / .25;
		amount = amount % .25;

		dime = amount / .10;
		amount = amount % .10;

		nickel = amount / .05;
		amount = amount % .05;

		penny = amount / .01;
		amount = amount % .01;

		System.out.println((int)tenDollar + " ten dollar bills");
		System.out.println((int)fiveDollar + " five dollar bils");
		System.out.println((int)oneDollar + " one dollar bills");
		System.out.println((int)quarter + " quarters");
		System.out.println((int)dime + " dimes ");
		System.out.println((int)nickel + " nickels");
		System.out.println((int)penny + " pennies");
	}
}