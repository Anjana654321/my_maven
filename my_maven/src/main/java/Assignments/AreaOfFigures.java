//Write a program to find the Area of figures(circle, rectangle, square) by using three methods(should have same method name)
//used method overloading

package Assignments;

public class AreaOfFigures 
{
	public void area(double r)
	{
		double pi=3.142;
		double area1=pi*r*r;
		System.out.println("Area of Circle: "+area1);
	}
	public void area(int l, int b)
	{
		int area2=l*b;
		System.out.println("Area of Rectangle: "+area2);
	}
	public void area(int a)
	{
		int area3=a*a;
		System.out.println("Area of Square: "+area3);
	}
	public static void main(String args[])
	{
		AreaOfFigures obj=new AreaOfFigures();
		obj.area(3.2d);
		obj.area(4,5);
		obj.area(6);
	}
}
