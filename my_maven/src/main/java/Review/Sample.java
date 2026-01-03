//class 1 --> 2 variables fruit and vegetable then print through 2nd class, class 2 has no direct access with the class 1


package Review;

public class Sample 
{
	private String fr;
	private String veg;
	public void setter(String fr, String veg)
	{
		this.fr=fr;
		this.veg=veg;
	}
	public void getter()
	{
		System.out.println("Fruit is "+fr);
		System.out.println("Vegetable is "+veg);
	}
}
