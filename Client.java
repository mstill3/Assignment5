import java.util.Scanner;

public class Client 
{

	public static void main(String[] args) 
	{

		int choice;
		Scanner cin = new Scanner(System.in);
		
		Menu menu = new Menu();
		Order order = new Order();
		
		do
		{
			display();
			System.out.println("\nEnter choice:\n--------------");
			choice = cin.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println(menu);
				break;
			case 2:

				int itemNum = 0;
				do
				{
					System.out.println("\nEnter Menu Item you wish to add to your order (-1 to stop): ");
					itemNum = cin.nextInt();

					if(itemNum != -1)
						if(itemNum > 0 && itemNum <= menu.getNumItems())
							order.addItem(itemNum + 1);
						else
							System.out.println("Invalid item number");
				}
				while(itemNum != -1);

				System.out.println(order);
				break;
			case 3:
				Aggregator aggregator = new Aggregator(menu, order);
				Tab tab = new Tab(aggregator);
				System.out.println(tab);
				break;
			}

		} while(choice != 4);

	}

	//	The user interface should just be a text-based numbered list of options, implemented in the main method. 
	//	(It can be a GUI if you desire and are familiar with the development of GUIs, but no extra points will be given for this).

	public static void display()
	{
		System.out.println("MATT'S FOOD LODGE\n=================");
		System.out.println("1) Display Menu");
		System.out.println("2) Submit Order");
		System.out.println("3) Display Tab");
		System.out.println("4) Quit");
	}

}
