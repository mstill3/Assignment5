
//can be a class of all static methods – one for each of the three commands of the user interface, 
//if it does not have any state in your extension of the program.

public abstract class SystemInterface 
{

	public final static double TAX = 0.06;
	public final static String STATE = "MD";

	public static void displayPrompt()
	{
		System.out.println("MATT'S FOOD LODGE\n=================");
		System.out.println("1) Display Menu");
		System.out.println("2) Submit Order");
		System.out.println("3) Display Tab");
		System.out.println("4) Quit");
	}

}
