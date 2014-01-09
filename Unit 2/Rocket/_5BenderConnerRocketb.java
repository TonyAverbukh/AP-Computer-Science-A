////////////////////////////////////////
//Lovely hand-crafted by Conner Bender//
////////////////////////////////////////

//This file displays the rocket at a size of 3.

public class _5BenderConnerRocketb
{
	public static final int SIZE = 3;
	public static void main(String[] args)
	{
		triangle();
		line();
		topBody();
		bottomBody();
		line();
		bottomBody();
		topBody();
		line();
		triangle();
	}
	
	public static void triangle()
	{
		for(int i = 1; i <= 5; i = i + 1)
		{
			for(int spaces = 6; spaces - i >= 1; spaces--) 
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
		
		for(int i = 1; i <= 6; i++)
		{
			System.out.print("=*");
		}
		
		System.out.println("+");
	}

	public static void topBody()
	{
		for(int i = 1; i <= 3; i++)
		{
			System.out.print("|");
			
			for(int firstdot = 2; firstdot >= i; firstdot--)
			{
				System.out.print(".");
			}
			for(int firstslash = 1; firstslash <= i; firstslash++)
			{
				System.out.print("/\\");	
			}
			for(int seconddot = 1; seconddot <= (i*(-2)) + 6; seconddot++)
			{
				System.out.print(".");	
			}
			for(int secondslash = 1; secondslash <= i; secondslash++)
			{
				System.out.print("/\\");
			}
			for(int thirddot = 2; thirddot >= i; thirddot--)
			{
				System.out.print(".");
			}	
			
			System.out.print("|");
			System.out.println();
		}
	}
	
	public static void bottomBody()
	{
		for(int i = 1; i <= 3; i++)
		{
			System.out.print("|");
			
		for(int firstdot = 1; firstdot <= i - 1; firstdot++)
		{
			System.out.print(".");
		}	
		for(int firstslash = 1; firstslash <= (i * (-1) + 4); firstslash++)
		{
			System.out.print("\\/");
		}
		for(int seconddot = 1; seconddot <= i * 2 - 2; seconddot++)
		{					
			System.out.print(".");	
		}	
		for(int secondslash = 1; secondslash <= (i * (-1) + 4); secondslash++)
		{
			System.out.print("\\/");
		}
		for(int thirddot = 1; thirddot <= i - 1; thirddot++)
		{
			System.out.print(".");
		}
			System.out.print("|");
			System.out.println();
		}
	}	

}	
