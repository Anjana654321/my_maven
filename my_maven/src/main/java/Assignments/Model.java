package Assignments;

public class Model extends Car
{
	int price;
	public Model(int price)
	{
		
		super("Black",4);
		this.price=price;
		System.out.println(price);
	}
	public void tire()
	{
		System.out.println(super.tire);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Model ob=new Model(1000000);
		ob.tire();
	}

}
