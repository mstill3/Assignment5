import java.util.ArrayList;

public class Menu implements Iterator
{

	private ArrayList<Item> items;

	public Menu() 
	{
		items = new ArrayList<Item>();
		populate();
	}

	public void populate()
	{
		if(items.size() <= 0) {
			items.add(new HealthyItem(new MenuItem(1, "Roast Beef", "Hand-cut Tenderness", 9.60), 400));
			items.add(new HealthyItem(new MenuItem(2, "Chicken Korma", "Tasty Chiken delight", 8.75), 670));
			items.add(new HealthyItem(new MenuItem(3, "Jiaozi", "Chineese Dumplings", 11.00), 260));
			items.add(new HealthyItem(new MenuItem(4, "French Fries", "Lightly salted, crunchy yummyness", 2.75), 800));
			items.add(new HealthyItem(new MenuItem(5, "Burger", "100% Angus Beef", 3.15), 790));
			items.add(new HealthyItem(new MenuItem(6, "Pizza", "Tomatoy, cheesy deliciousness", 7.50), 1100));
		}
	}

	public ArrayList<Item> getItems()
	{
		return items;
	}

	public void add(Item i)
	{
		items.add(i);
	}

	public int getNumItems()
	{
		return items.size();
	}

	public Item getItemByNum(int num)
	{
		return items.get(num - 1);
	}

	public float getPrice()
	{
		float total = 0;
		for( Item i : items)
		{
			total += i.price;
		}
		return total;
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
