/**
 * TimeToSeconds.java  9/11/2012
 *
 * @author - Lewis and Loftus
 *
 *	 Write an application that reads values representing a time duration
 *  in hours, minutes, and seconds, and then prints the equivalent total
 *  number of seconds. For example, 1 hour, 28 minutes, and 42 seconds is
 *  equivalent to 5322 seconds.
 */


import java.util.Scanner;


public class TimeToSeconds
{
    public static void main(String[] args)
    {
    
	 int hours;
	 int minutes;
	 int seconds;
	 int output;
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter a numerical value for hours: ");
	 hours = scan.nextInt();
	 
	 System.out.println("Enter a numerical value for minutes: ");
	 minutes = scan.nextInt();
	 
	 System.out.println("Enter a numerical value for seconds: ");
	 seconds = scan.nextInt();
	 
	 output = seconds + minutes * 60 + hours * 3600;
	 
	 System.out.println("The data you inputed converted to " + output + " seconds.");
	 
	 
	 
	 }
}