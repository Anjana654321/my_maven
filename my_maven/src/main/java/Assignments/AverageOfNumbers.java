//Write a program to find the Average of three integer numbers, three float numbers(should have same method name)
//used method overloading

package Assignments;

public class AverageOfNumbers 
{
	public void add(int a,int b,int c)
	{
		System.out.println((a+b+c)/3);
	}
	public void add(float x,float y,float z)
	{
		System.out.println((x+y+z)/3);
	}
	public static void main(String args[])
	{
		AverageOfNumbers obj=new AverageOfNumbers();
		obj.add(2,3,4);
		obj.add(2.5f,3.5f,4.5f);
	}
}
