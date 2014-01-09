public class ForLoopDemo5
{
	public static void main(String[] args)
	{/*
		//create a loop that counts from 1 to 10 on a single line
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		//create a loop that counts from 2 to 20 by 2s
		for(int i = 2; i <=20; i += 2)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		//create a loop that prints form -100 to -200 by 10
		for(int i = -100; i >= -200; i -= 10)
		{
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		//create a loop that displays the multiples of -5 from 1 to 20
		for(int i = 1; i <= 20; i++)
		{
			System.out.print(i * -5 + " ");
		}
		
		
		System.out.println();
		//create a loop that displays the multiples of -5 from 1 to 20
		for(int i = 1; 1 <= 20; i *= -5)
		{
			System.out.print(i + " ");
		}
	

		//create a loop that prints from 1 to 100
		for(int i = 1; 1 <= 100; i++)
		{
			
			if(i < 10)
			{
				System.out.print(i + " ");
		   }
			else
			{
				System.out.print(i + " ");
			}
			if( i % 10 == 0)
			{
				System.out.println();
			}
		}
		
		*/
		for(int line = 1; line <= 10; line++)
		{
			for(int inner = 1; inner <= 10; inner++)
	 		{
				System.out.print(inner + " ");
			}  
			System.out.println();	
		}
	
		int number = 4; for (int count = 1; count <= number; count++) { System.out.println(number); number = number / 2; 

	
	}
	}
}