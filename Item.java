
public abstract class Item 
{

	protected String name;
	protected String description;
	protected double price;
	
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getDescription();
	public abstract void setDescription(String description);
	public abstract double getPrice();
	public abstract void setPrice(double price);
	
}
