////////////////////////////////////////
//Lovely hand-crafted by Conner Bender//
////////////////////////////////////////

//This fie displays the rocket at any size. I left it at 10, 
//but you can change it to anything you want by editing the final int SIZE variable.

public class _5BenderConnerRocketc
{
	public static final int SIZE = 10;
	public static void main(String[] args)
	{
		triangle();
		line();
		for(int i = 1; i <= SIZE - 1; i++)
		{
			if(i%2 == 1)
			{
				topBody();
				bottomBody();
			}			
			else
			{
			bottomBody();
			topBody();
			}
			line();
		}
		triangle();
	}
	
	public static void triangle()
	{
		for(int i = 1; i <= SIZE * 2 - 1; i = i + 1)
		{
			for(int spaces = SIZE * 2; spaces - i >= 1; spaces--) 
			{
				System.out.print(" ");
			}
			for(int forwardslash = 1; forwardslash <= i; forwardslash++)
			{
				System.out.print("/");		
			}	
			
			System.out.print("**");
			
			for(int backslash = 1; backslash <= i; backslash++)
			{
				System.out.print("\\");
			}
		   System.out.println();

		}
	}
		
	public static void line()
	{
		System.out.print("+");
		
		for(int i = 1; i <= SIZE * 2; i++)
		{
			System.out.print("=*");
		}
		
		System.out.println("+");
	}

	public static void topBody()
	{
		for(int i = 1; i <= SIZE; i++)
		{
			System.out.print("|");
			
			for(int firstdot = 1; firstdot <= (i*(-1)) + SIZE; firstdot++)
			{
				System.out.print(".");
			}
			for(int firstslash = 1; firstslash <= i; firstslash++)
			{
				System.out.print("/\\");	
			}
			for(int seconddot = 1; seconddot <= (i*(-2)) + SIZE * 2; seconddot++)
			{
				System.out.print(".");	
			}
			for(int secondslash = 1; secondslash <= i; secondslash++)
			{
				System.out.print("/\\");
			}
			for(int thirddot = 1; thirddot <= (i*(-1))+ SIZE; thirddot++)
			{
				System.out.print(".");
			}	
			
			System.out.print("|");
			System.out.println();
		}
	}
	
	public static void bottomBody()
	{
		for(int i = SIZE; i >= 1; i--)
		{
			System.out.print("|");
		for(int firstdot = 1; firstdot <= (i*(-1)) + SIZE; firstdot++)

		{
			System.out.print(".");
		}	
		for(int firstslash = 1; firstslash <= i; firstslash++)
		{
			System.out.print("\\/");
		}
		for(int seconddot = 1; seconddot <= (i * (-2)) + SIZE * 2; seconddot++)
		{					
			System.out.print(".");	
		}	
		for(int secondslash = 1; secondslash <= i; secondslash++)
		{
			System.out.print("\\/");
		}
		for(int thirddot = 1; thirddot <= (i*(-1)) + SIZE; thirddot++)
		{
			System.out.print(".");
		}
			System.out.print("|");
			System.out.println();
		}
	}	

}	
