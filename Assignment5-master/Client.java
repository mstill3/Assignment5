import java.util.Scanner;

public class Client 
{

	public static void main(String[] args) 
	{
		int choice = 0;
		Scanner cin = new Scanner(System.in);
		do
		{
            printInterface();
			System.out.println("\nEnter choice:\n--------------");
			choice = cin.nextInt();

			switch(choice)
			{
			case 1:
				SystemInterface.printMenu();
                break;
			case 2:
                SystemInterface.submitOrder();
				break;
			case 3:
				SystemInterface.displayTab();
				break;
			}

		} while(choice != 4);

	}


	public static void printInterface()
    {
        System.out.println("MATT'S FOOD LODGE\n=================");
        System.out.println("1) Display Menu");
        System.out.println("2) Submit Order");
        System.out.println("3) Display Tab");
        System.out.println("4) Quit");
    }
}
