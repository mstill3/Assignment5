import java.util.ArrayList;

public class Menu 
{

	private ArrayList<MenuItem> items;

	public Menu() 
	{
		items = new ArrayList<MenuItem>();
		populate();
	}
	
	private void populate()
	{
		items.add(new MenuItem("Roast Beef", "Hand-cut Tenderness", 9.60));
		items.add(new MenuItem("Chicken Korma", "Tasty Chiken delight", 8.75));
		items.add(new MenuItem("Jiaozi", "Chineese Dumplings", 11.00));
		items.add(new MenuItem("French Fries", "Lightly salted, crunchy yummyness", 2.75));
		items.add(new MenuItem("Burger", "100% Angus Beef", 3.15));
		items.add(new MenuItem("Pizza", "Tomatoy, cheesy deliciousness", 7.50));
	}
	
	public int getNumItems()
	{
		return items.size();
	}
	
	public MenuItem getItemByNum(int num)
	{
		return items.get(num - 1);
	}
	
	@Override
	public String toString() 
	{
		String str = "\n" + charPrint('=', 100) + "\nMENU\n" + charPrint('=', 100) + "\n";
		for(MenuItem item : items)
			str += item + "\n";
		return str;
	}
	
	private String charPrint(char c, int num)
	{
		String s = "";
		for(int i = 0; i < num; i++)
			s += c;
		return s;
	}

}
