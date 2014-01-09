public class MoreAsciib
{
	public static void main(String[] args)
	{
		figure1();
		System.out.println();
		figure2();
		System.out.println();
		figure3();
	}
	
	public static void figure1()
	{
		line();
		birds();
		birds();
		line();
		vees();
		vees();
		line();
	}
	
	public static void figure2()
	{
		line();
		birds();
		vees();
		line();
		vees();
		birds();
		line();
	}
	
	public static void figure3()
	{
		line();
		line();
		line();
		birds();
		vees();
		vees();
		birds();
		birds();
		vees();
		line();
		line();
		line();
	}
	
	public static void line()
	{
		System.out.print("+");
		
		for(int i = 1; i <= 6; i++)
		{
			System.out.print("-");
		}
		System.out.println("+");
	}

	public static void birds()
	{
		for(int line = 1; line <= 3; line++)
		{
			System.out.print("|");
			
			for(int spaces = 1; spaces <= -line + 3; spaces++)
			{
				System.out.print(" ");
			}
			
			System.out.print("^");
			
			for(int spaces = 1; spaces <= 2 * line - 2; spaces++)
			{
				System.out.print(" ");
			}
			System.out.print("^");
			
			for(int spaces = 1; spaces <= -line + 3; spaces++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			
			System.out.println();
		}	
	}
	public static void vees()
	{
		for(int line = 1; line <= 3; line++)
		{
			System.out.print("|");
			
			for(int spaces = 1; spaces <= line - 1; spaces++)
			{
				System.out.print(" ");
			}
		
			System.out.print("V");
			
			for(int spaces = 1; spaces <= -line * 2 + 6; spaces++)
			{
				System.out.print(" ");
			}
			System.out.print("V");
			
			for(int spaces = 1; spaces <= line - 1 ; spaces++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			
			System.out.println();

		}
	
	}

}
