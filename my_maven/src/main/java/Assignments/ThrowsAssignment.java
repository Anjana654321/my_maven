package Assignments;

public class ThrowsAssignment 
{
	public static void print(int score) throws LowScoreException 
	{
		if(score<40)
		{
			throw new LowScoreException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) throws LowScoreException 
	{
		ThrowsAssignment.print(29);
	}
}
