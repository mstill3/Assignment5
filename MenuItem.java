import java.text.DecimalFormat;

public class MenuItem 
{

	private String name;
	private String description;
	private double price;
	
	public MenuItem(String n, String d, double p)
	{
		name = n;
		description = d;
		price = p;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
		DecimalFormat df = new DecimalFormat("$#,###,##0.00");
		return String.format("Name: %-20sDescription: %-40sPrice: %s", name, description, df.format(price));
	}
	
}
