
public class GetMenuCommand implements Command
{

	private Menu menu;
	
	public GetMenuCommand(Menu menu) 
	{
		this.menu = menu;
	}

	@Override
	public String execute()
	{
		return menu.toString();
	}

}

