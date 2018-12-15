
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
		GetMenuCommand getMenu = new GetMenuCommand(aggregator);
		String results = getMenu.execute();
		return results;
	}
	
	public String submitOrder()
	{
		SubmitOrderCommand subOrder = new SubmitOrderCommand(aggregator);
		String results = subOrder.execute();
		return results;
	}
	
	public String getTab()
	{
		GetTabCommand getTab = new GetTabCommand(aggregator);
		String results = getTab.execute();
		return results;
	}
	
}
