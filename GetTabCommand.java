
public class GetTabCommand implements Command
{

	private Aggregator aggregator;
	
	public GetTabCommand(Aggregator agg)
	{
		aggregator = agg;
	}

	@Override
	public String execute()
	{
		Tab t = new Tab(aggregator);
		return t.toString();
	}

}
