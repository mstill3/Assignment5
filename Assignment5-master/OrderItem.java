

public class OrderItem 
{

	private int ordernum;
	
	public OrderItem(int num)
	{
		ordernum = num;
	}
	
	public int getNum()
	{
		return ordernum;
	}
	
	public void setNum(int n)
	{
		ordernum = n;
	}
	
	@Override
	public String toString() 
	{
		return "Ordered Menu Item #" + ordernum;
	}
	
}
