public class StringDemo
{
	public static void main(String[] args)
	{
		String a = "apple";
		String z = "zebra";
		String m = "monkey";
		String a2 = a;
		a = a.toUpperCase();
		boolean az = a.equals(z);
		boolean aaLower = a.equals("apple");
		boolean aaUpper = a.equals("APPLE");
		int compAZ = a.compareTo(z);
		int compZA = z.compareTo(a);
		int compMmonkey = m.compareTo("monkey");
		System.out.println(m);
	}
}