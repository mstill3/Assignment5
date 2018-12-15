
public class SubmitOrderCommand implements Command
{

	Aggregator aggregator;
	
	public SubmitOrderCommand(Aggregator agg)
	{
		aggregator = agg;
	}

	@Override
	public String execute()
	{
		return aggregator.getOrder().toString();
	}

}
