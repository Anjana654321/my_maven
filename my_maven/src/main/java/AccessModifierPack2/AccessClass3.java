package AccessModifierPack2;

import AccessModifierPack1.AccessClass1;

public class AccessClass3 {

	public static void main(String[] args) 
	{
		AccessClass1 ob=new AccessClass1();
		/*
		System.out.println(ob.a);
		//System.out.println(ob.b);
		//System.out.println(ob.c);
		//System.out.println(ob.d);
		 */
		ob.print();
		//ob.print1();
		//ob.print2();
		//ob.print3();
	}

}
