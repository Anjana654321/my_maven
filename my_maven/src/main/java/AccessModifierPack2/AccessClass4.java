package AccessModifierPack2;

import AccessModifierPack1.AccessClass1;

public class AccessClass4 extends AccessClass1
{

	public static void main(String[] args) 
	{
		AccessClass4 ob1=new AccessClass4();
		/*
		System.out.println(ob1.a);
		//System.out.println(ob1.b);
		System.out.println(ob1.c);
		//System.out.println(ob1.d);
		 */
		ob1.print();
		//ob1.print1();
		ob1.print2();
		//ob1.print3();
	}

}
