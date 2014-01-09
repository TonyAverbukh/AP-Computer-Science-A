public class Mirror
{
	public static final int SIZE = 18;
	public static void main(String[] args)
	{
		line();
		topHalf();
		bottomHalf();
		line();
	}
	
	public static void line()
	{
		System.out.print("#");
		for(int i = 1; i <= 4 * SIZE; i++)
		{
			System.out.print("=");
		}
			System.out.println("#");
	}
	
	public static void topHalf()
	{
		for(int line = 1; line <= SIZE; line++)
		{
			System.out.print("|");
			for(int spaces = 1; spaces <= -2 * line + 2 * SIZE; spaces++)
			{
				System.out.print(" ");
			}	
			System.out.print("<>");
			for(int dots = 1; dots <= 4 * line - 4; dots++)
			{
				System.out.print(".");
			}
			System.out.print("<>");
			for(int spaces = 1; spaces <= -2 * line + 2 * SIZE; spaces++)
			{
				System.out.print(" ");
			}
			System.out.println("|");
		}
	
	}
	public static void bottomHalf()
	{
		{
			for(int line = SIZE; line >= 1; line--)
			{
			System.out.print("|");
			for(int spaces = 1; spaces <= -2 * line + 2 * SIZE; spaces++)
			{
				System.out.print(" ");
			}	
			System.out.print("<>");
			for(int dots = 1; dots <= 4 * line - 4; dots++)
			{
				System.out.print(".");
			}
			System.out.print("<>");
			for(int spaces = 1; spaces <= -2 * line + 2 * SIZE; spaces++)
			{
				System.out.print(" ");
			}
			System.out.println("|");
		}

		}

	}

}
