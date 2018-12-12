
public class GetTabCommand implements Command
{

	private Tab tab;
	
	public GetTabCommand(Tab tab) 
	{
		this.tab = tab;
	}

	@Override
	public String execute()
	{
		return tab.toString();
	}

}
