// ***************************************************************
//   StringManips.java
//
//   Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class StringManips
{
    public static void main (String[] args)
    {
	String phrase = new String ("This is a String test.");
	int phraseLength;   // number of characters in the phrase String
	int middleIndex;    // index of the middle character in the String
	String firstHalf;   // first half of the phrase String
	String secondHalf;  // second half of the phrase String
	String switchedPhrase; // a new phrase with original halves switched
	String middle3;
	String city, state;
	Scanner scan = new Scanner(System.in);

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;
	middle3 = phrase.substring(middleIndex - 1, middleIndex + 2); 

	// get the substring for each half of the phrase
	firstHalf = phrase.substring(0,middleIndex);
	secondHalf = phrase.substring(middleIndex, phraseLength);

	// concatenate the firstHalf at the end of the secondHalf
	switchedPhrase = secondHalf.concat(firstHalf);

	System.out.println("Please enter the city where you were born.");
	city = scan.nextLine();
	System.out.println("Please enter the state where you were born.");
	state = scan.nextLine();
	
	// print information about the phrase
	System.out.println();
	System.out.println ("Original phrase: " + phrase);
	System.out.println ("Length of the phrase: " + phraseLength +" characters");
	System.out.println ("Index of the middle: " + middleIndex);
	System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex));
	System.out.println ("Switched phrase: " + switchedPhrase);
	System.out.println ("Three middle characters of phrase: " + middle3);
	city = city.toLowerCase();
	state = state.toUpperCase();
	System.out.println(state + " " + city + " " + state);
	
	
	System.out.println();
  
	
	}
}