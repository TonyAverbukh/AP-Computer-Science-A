public class AsciiUnit2c
{
	public static final int SIZE = 8;
	public static void main(String[] args)
	{ 
		line();
		topHalf();
		bottomHalf();
		line();
		bottomHalf();
		topHalf();
		line();
	}

	public static void line()
	{
		System.out.print("$");
		
		for(int i = 1; i <= 16; i++)
		{
			System.out.print("=");
		}
		
		System.out.println("$");
	}
	
	public static void topHalf()
	{
		for(int line = 1; line <= SIZE; line++)
		{
			for(int stars = 1; stars <= line; stars++)
			{
				System.out.print("*");
			}
			
			for(int spaces = 1; spaces <= -line + SIZE; spaces++)
			{
				System.out.print(" ");
			}
			
			System.out.print("$$");
			
			for(int spaces = 1; spaces <= -line + SIZE; spaces++)
			{
				System.out.print(" ");
			}
			
			for(int stars = 1; stars <= line; stars++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		} 
	}
	
	public static void bottomHalf()
	{
	for(int line = 1; SIZE >= line; line++)
		{
			for(int stars = SIZE; stars >= line; stars--)
			{
				System.out.print("*");
			}
			
			for(int spaces = SIZE; spaces >= -line + SIZE + 2; spaces--)
			{
				System.out.print(" ");
			}
			
			System.out.print("$$");
			
			for(int spaces = SIZE; spaces >= -line + SIZE + 2; spaces--)
			{
				System.out.print(" ");
			}
			
			for(int stars = SIZE; stars >= line; stars--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		} 

	}
}