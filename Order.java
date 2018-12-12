import java.util.ArrayList;

public class Order 
{

	private ArrayList<OrderItem> items;

	public Order() 
	{
		items = new ArrayList<OrderItem>();
	}
	
	public void addItem(int n)
	{
		items.add(new OrderItem(n));
	}
	
	public ArrayList<OrderItem> getItems()
	{
		return items;
	}
	
	@Override
	public String toString() 
	{
		String str = "\n======================\nMY ORDER\n======================\n";
		for(OrderItem item : items)
			str += item + "\n";
		return str;
	}

}
