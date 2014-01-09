/**
 * SecondsToTime.java  9/11/2012
 *
 * @author - Lewis & Loftus
 * Write a program to that reverses the computation of the TimeToSeconds application.
 * That is, read a value representing a number of seconds, then print the equivalent
 * amount of time as a combination of hours, minutes, and seconds. For example,
 * 9999 seconds is equivalent to 2 hours, 46 minutes and 39 seconds.
 *
 */

import java.util.Scanner;

public class SecondsToTime
{

   public static void main(String[] args)
    {
    
	 int hours;
	 int minutes;
	 int seconds;
	 int remainder;
	 int input;
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter a numerical value in seconds: ");
	 input = scan.nextInt();
		 
    hours = input / 3600;
    remainder = input % 3600;
    minutes = remainder / 60;
    seconds = remainder % 60;
	 
	 System.out.println(input + " seconds is equivalent to " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s).");  
	 
	 }
}