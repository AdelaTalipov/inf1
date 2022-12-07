package Einfuehrung;

public class KW48 
{public static void main(String[] arguments) 
{
System.out.println(mathematik(1, 2));
System.out.println(mathematik(3, 4));
}
public static boolean mathematik(int argument1, int argument2)
{
	return (argument1 + 5) < (argument2 * 2);
}
}