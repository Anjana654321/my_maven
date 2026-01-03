package Excelread;

import java.io.IOException;

public class Excelmain 
{
	public static void main(String[] args) throws IOException 
	{
		String s=Excelcode.readStringData(6,0);
		System.out.println(s);
		double d=Excelcode.readIntegerData(6,1);
		System.out.println(d);
	}

}
