import java.util.ArrayList;

//maintains references to the Menu object and the Orders object. 
//It should provide a getter method for retrieving the Menu and Orders objects (no setters are needed).

public class Aggregator 
{
	
	private Menu menu;
	private Order order;
	
	private Tab tab;
	
	public Aggregator(Menu m, Order o) 
	{
		menu = m;
		order = o;
	}

	
	public Menu getMenu()
	{
		return menu;
	}
	
	public Order getOrder()
	{
		return order;
	}

	

}
