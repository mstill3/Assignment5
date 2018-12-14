import java.util.ArrayList;

public class Menu implements Iterator
{

	private ArrayList<Item> items;

	public Menu() 
	{
		items = new ArrayList<Item>();
		populate();
	}

	private void populate()
	{
		items.add(new HealthyItem(new MenuItem("Roast Beef", "Hand-cut Tenderness", 9.60), 400));
		items.add(new HealthyItem(new MenuItem("Chicken Korma", "Tasty Chiken delight", 8.75), 670));
		items.add(new HealthyItem(new MenuItem("Jiaozi", "Chineese Dumplings", 11.00), 260));
		items.add(new HealthyItem(new MenuItem("French Fries", "Lightly salted, crunchy yummyness", 2.75), 800));
		items.add(new HealthyItem(new MenuItem("Burger", "100% Angus Beef", 3.15), 790));
		items.add(new HealthyItem(new MenuItem("Pizza", "Tomatoy, cheesy deliciousness", 7.50), 1100));
	}

	public int getNumItems()
	{
		return items.size();
	}

	public Item getItemByNum(int num)
	{
		return items.get(num - 1);
	}


	private int current = 0;

	@Override
	public boolean hasNext() 
	{
		return current+1 <= items.size();
	}

	@Override
	public Object next() 
	{
		return items.get(current++);
	}

	@Override
	public String toString() 
	{
		String str = "\n" + charPrint('=', 125) + "\nMENU\n" + charPrint('=', 125) + "\n";
		while(hasNext())
		{
			str += next() + "\n";
		}
		current = 0;
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
