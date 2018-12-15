import java.text.DecimalFormat;
import java.util.ArrayList;

// totaling all of the ordered items

public class Tab 
{

	private Aggregator aggregator;
	
	public Tab(Aggregator agg)
	{
		aggregator = agg;
	}

	
	public double getTaxAmount()
	{
		return aggregator.getMenu().getPrice() * SystemInterface.TAX;
	}
	
	public double getTotalWithTax()
	{
		return aggregator.getMenu().getPrice() + getTaxAmount();
	}
	
	@Override
	public String toString() 
	{
		DecimalFormat df = new DecimalFormat("$#,###,##0.00");
		String str = "\n" + charPrint('=', 125) + "\nMY TAB\n" + charPrint('=', 125) + "\n";
		ArrayList<Item> items = aggregator.getMenu().getItems();
		for(Item item : items){
			str += item + "\n";
		}
		str += charPrint('-', 125) + "\n";
		str += String.format("%-109sTotal: %s\n", "", df.format(aggregator.getMenu().getPrice()));
		str += String.format("%-111sTax: %s\n", "", df.format(getTaxAmount()));
		str += String.format("%-109sTotal: %s\n", "", df.format(getTotalWithTax()));
		str += "\n";
		return str;
	}
	
	private String charPrint(char c, int num)
	{
		String s = "";
		for(int i = 0; i < num; i++)
			s += c;
		return s;
	}
	
}
