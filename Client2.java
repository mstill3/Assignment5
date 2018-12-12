import java.util.Scanner;

public class Client2 
{

	public static void main(String[] args) 
	{

		int choice;
		Scanner cin = new Scanner(System.in);
				
		Menu menu = new Menu();
		Order order = new Order();
		
		Invoker inv = new Invoker(new Aggregator(menu, order));
		
		do
		{
			SystemInterface.displayPrompt();
			System.out.println("\nEnter choice:\n--------------");
			choice = cin.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println(inv.getMenu());
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
				
				inv.updateOrder(order);
				System.out.println(inv.submitOrder());
				break;
			case 3:
				System.out.println(inv.getTab());
				break;
			}

		} while(choice != 4);

	}
	
}
