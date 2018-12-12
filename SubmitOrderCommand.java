
public class SubmitOrderCommand implements Command
{

	private Order order;
	
	public SubmitOrderCommand(Order order) 
	{
		this.order = order;
	}

	@Override
	public String execute()
	{
		return order.toString();
	}

}
