
public class Invoker 
{

//	private Command command;
	private Aggregator aggregator;
	
	public Invoker(Aggregator agg) 
	{
		aggregator = agg;
	}
	
//	public void setCommand(Command command)
//	{
//		this.command = command;
//	}
	
	public String getMenu()
	{
		GetMenuCommand getMenu = aggregator.createDisplayMenu();
		String results = getMenu.execute();
		return results;
	}
	
	public void updateOrder(Order o)
	{
		aggregator.setOrder(o);
	}
	
	public String submitOrder()
	{
		SubmitOrderCommand subOrder = aggregator.createSubmitOrder();
		String results = subOrder.execute();
		return results;
	}
	
	public String getTab()
	{
		GetTabCommand getTab = aggregator.createDisplayTab();
		String results = getTab.execute();
		return results;
	}
	
}
