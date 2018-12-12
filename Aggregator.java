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
		generate();
	}
	
	private ArrayList<MenuItem> myItems;
	private void generate()
	{
		myItems = new ArrayList<MenuItem>();
		for(OrderItem i : order.getItems())
			myItems.add(menu.getItemByNum(i.getNum()));
		tab = new Tab(this);
	}
	
	public ArrayList<MenuItem> getMyItems()
	{
		return myItems;
	}
	
	public Menu getMenu()
	{
		return menu;
	}
	
	public Order getOrder()
	{
		return order;
	}
	
	public void setOrder(Order o)
	{
		order = o;
	}

	public GetMenuCommand createDisplayMenu() 
	{
		return new GetMenuCommand(menu);
	}

	public SubmitOrderCommand createSubmitOrder() 
	{
		return new SubmitOrderCommand(order);
	}

	public GetTabCommand createDisplayTab() 
	{
		generate();
		return new GetTabCommand(tab);
	}
	

}
