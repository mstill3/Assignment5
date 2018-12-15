import java.text.DecimalFormat;

public class MenuItem extends Item
{
	public MenuItem(int i, String n, String d, double p)
	{
		itemNum = i;
		name = n;
		description = d;
		price = p;
	}

	public int getItemNum()
	{
		return itemNum;
	}

	public void setItemNum(int itemNum)
	{
		this.itemNum = itemNum;
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
		return String.format("# %-5d Name: %-20sDescription: %-40sPrice: %s", itemNum, name, description, df.format(price));
	}
	
}
