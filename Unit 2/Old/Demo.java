   //Pat St.Clair
	//August 2011?
	//class to demonstrate basic programming concepts

   public class Demo
   {
      public static void main(String[] args)
      {
			/************************************     VARIABLES     *******************************************************************/
      	// hold information for later use
    		// 3 primitive date types in the AP subset
			// variable names always begin with a lowercase letter
			// basic structure
      	// datatype   variableName   assignment operator(=)- think of as 'gets' NOT 'equals'   stored value
         int sum = 0; 		//int holds whole numbers            say sum gets 0
         double average;			//double holds decimal numbers
         boolean over18 = false;		// boolean hold the values true or false
      
         char letter = 'A';  			//char holds characters- it is useful, but not in the AP subset
      
      	//infinite number of 'class' datatypes
         String name = "Yogi Bear";  //String is a built-in datatype which holds strings of characters, such as words or sentences.
			Die myDie = new Die();  	 //Die is a class I wrote
			
      	/*********************************      ARRAY VARIABLES       *************************************************************/
      	//datatypes which hold more than one value at at time are called arrays
         int[] grades = new int[5];			//this creates a storage location for ints with 5 slots in it, each slot holds the default value of 0
         double[] distanceFromSchool = {1.5, 4.6, 2.0, .34, 7.89}; //this creates a storage location for decimal numbers also with 5 slots 
         String[] cousins = {"Alex", "Nathan", "Neil", "Katrina", "Kim", "Paul", "Ian", "Zach"};
			Die[] dice = new Die[5]; 		//creates a storage location for 5 die, each slot has a null value
      
      
			
			/************************************************   LOOPS   ****************************************************************/
			// 3 types of loops covered in the AP subset
			
			//for loops
			//basic structure
			//for(loop variable declaration; loop test; increment loop variable)
			for(int i = 0; i < 5; i++)
			{
				System.out.println("i is currently " + i);
			}
			System.out.println();   //leaves a blank line so output is easier to read
			//loop to add values to the grades array
			for(int i = 0; i < grades.length; i++)
			{
			    grades[i] = 90 + i;
			}
			
			//while loop
			int k = 0;    //loop variable declaration
			while(k < 5)	//loop test
			{
				System.out.print("k is " + k + ", ");
				k++; 				//increment loop variable
			}
			System.out.println("\n");	//leave a blank line so that my output is easier to read
						
			k = 0; //reset value in k for the next loop
			//loop to change values stored in the distance from school array
			while(k < distanceFromSchool.length)  			
			{
				distanceFromSchool[k] = distanceFromSchool[k] * k;
				k++; 							
			}
			
			//for each loop
			//basic structure
			//for(datatype   variableName  :  collection)
			for(String currentName: cousins)
			{
				sum += currentName.length();
			}
			average = sum/cousins.length;
			System.out.println("The average length is " + average +".");
			average = (double)sum/cousins.length;   //cast the int to a double so that my division works correctly
			System.out.println("The average length is now " + average +".");

			/***********************************     DECISIONS     ***************************************/
			//basic structure
			//if(condition that evaluates to true or false)
			//single branch
			System.out.println("sum is " + sum);  //printed to prove following statements are correct
			if(sum < 55)
			{
				System.out.println("sum is less than 55 is a true statement");   
			}
			
			//double branch else clause is executed if condition is false
			if( sum >= 55)
			{
				System.out.println("sum is greater than or equal to 55");   
			}
			else
			{
				System.out.println("sum is less than 55");
			}		
			
			//multiples branches
			//the first branch with a true condition is executed all others are skipped
			//lets make this more interesting...
			for (int i = 1; i <= 5; i++)
			{
				if(sum > 32)
					System.out.println(sum + " > 32");
				else if(sum > 25)
					System.out.println(sum + " > 25");
				else if(sum > 20)
					System.out.println(sum + " > 20");
				else if(sum > 15)
					System.out.println(sum + " > 15");
				else
					System.out.println(sum + " <= 15");
				sum = sum - 5;  

			}	
			
			
			//more examples
			System.out.println(java.util.Arrays.toString(dice));    //no die stored yet
			for(int i = 0; i < dice.length; i++)
			{
				dice[i] = new Die();
			}	
			System.out.println(java.util.Arrays.toString(dice)+"\n"); 
			
			System.out.println("Now I am going to roll my dice.");
			int j = 0;
			while(j < dice.length)	
			{		
				dice[j].roll();
				j++;
			}
			System.out.println(java.util.Arrays.toString(dice) + "\n"); 
			
			int num = dice[0].getFaceValue();   //get the value of the first die in the dice array
			System.out.println("Looking for 5 " + num + "s.");
			for(Die d: dice)
			{
			   while(d.getFaceValue() != num)
				   d.roll();
			}
			System.out.println(java.util.Arrays.toString(dice)); 
		
			//you will learn to define your own classes from these building blocks, but that comes later...
		
      }
   
   }