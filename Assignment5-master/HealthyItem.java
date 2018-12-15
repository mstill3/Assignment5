import java.text.DecimalFormat;

public class HealthyItem extends Decorator
{

	public HealthyItem(Item item, int calories)
	{
		itemNum = item.itemNum;
		name = item.name;
		description = item.description;
		price = item.price;
		this.calories = calories;
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
	
	public int getCalories() 
	{
		return calories;
	}

	public void setCalories(int cals) 
	{
		calories = cals;
	}
	
	@Override
	public String toString() 
	{
		DecimalFormat df = new DecimalFormat("$#,###,##0.00");
		return String.format("# %-5d Name: %-20sDescription: %-40sCalories: %-20sPrice: %s", itemNum,  name, description, calories, df.format(price));
	}
	
}
