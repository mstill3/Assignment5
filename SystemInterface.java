
//can be a class of all static methods – one for each of the three commands of the user interface, 
//if it does not have any state in your extension of the program.

import java.util.Scanner;

public class SystemInterface
{

	public final static double TAX = 0.06;
	public final static String STATE = "MD";

	static Menu menu = new Menu();
	static Order order = new Order();


	static Aggregator agg = new Aggregator(menu, order);
	static Invoker inv = new Invoker(agg);

	public static void printMenu()
	{
		menu.populate();
		System.out.println(inv.getMenu());
	}
	public static void submitOrder()
	{
		int choice;
		Scanner cin = new Scanner(System.in);

		int itemNum;
		do
		{
			System.out.println("\nEnter Menu Item you wish to add to your order (-1 to stop): ");
			itemNum = cin.nextInt();
			if(itemNum != -1)
				if(itemNum > 0 && itemNum <= menu.getNumItems())
					order.addItem(itemNum);
				else
					System.out.println("Invalid item number");
		}
		while(itemNum != -1);
		System.out.println(inv.submitOrder());
	}
	public static void displayTab()
	{
		System.out.println(inv.getTab());
	}

}
