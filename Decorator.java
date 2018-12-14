
public abstract class Decorator extends Item
{

	protected Item item;
	protected int calories;
	
	public abstract int getCalories();
	public abstract void setCalories(int cals);
	
}
