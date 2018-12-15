
public class GetMenuCommand implements Command
{
	Aggregator aggregator;
	
	public GetMenuCommand(Aggregator agg)
	{
		aggregator = agg;
	}

	@Override
	public String execute()
	{
		return aggregator.getMenu().toString();
	}

}

