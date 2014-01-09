   //Pat St.Clair
	// August 2011?
	//class to demonstrate basic programming concepts
	
	public class Demo2
   {
      public static void main(String[] args)
      {
			//primitive data types
			int sum = 0; 		
			double average = 10.456;			
         boolean over18 = false;		       
         char letter = 'A'; 
			 			      
      	//infinite number of 'class' datatypes
         String name = "Yogi Bear";  
			Die myDie = new Die();  	 //Die is a class I wrote
			
        	//datatypes which hold more than one value at at time are called arrays
         int[] grades = new int[5];			
			double[] distanceFromSchool = {1.5, 4.6, 2.0, .34, 7.89}; 
			String[] cousins = {"Alex", "Nathan", "Neil", "Katrina", "Kim", "Paul", "Ian", "Zach"};
			Die[] dice = new Die[5]; 		      
      
			
						
			//for loops
			for(int i = 0; i < 5; i++)
			{
				System.out.println("i is currently " + i);
			}
			System.out.println(); 
			  
			//loop to add values to the grades array
			for(int i = 0; i < grades.length; i++)
			{
			    grades[i] = 90 + i;
			}
			
			//while loop
			int k = 0;    
			while(k < 5)	
			{
				System.out.print("k is " + k + ", ");
				k++; 				
			}
			System.out.println("\n");	
						
			k = 0; 			
			while(k < distanceFromSchool.length)  			
			{
				distanceFromSchool[k] = distanceFromSchool[k] * k;
				k++; 							
			}
			
			//for each loop
			for(String currentName: cousins)
			{
				sum += currentName.length();
			}
			average = sum/cousins.length;
			System.out.println("The average length is " + average +".");
			average = (double)sum/cousins.length;   //cast the int to a double so that my division works correctly
			System.out.println("The average length is now " + average +".");

			/*     DECISIONS     */
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
			
			int num = dice[0].getFaceValue();   
			System.out.println("Looking for 5 " + num + "s.");
			for(Die d: dice)
			{
			   while(d.getFaceValue() != num)
				   d.roll();
			}
			System.out.println(java.util.Arrays.toString(dice)); 
		
					
      }
   
   }