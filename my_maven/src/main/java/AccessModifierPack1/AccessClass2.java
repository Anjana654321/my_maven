package AccessModifierPack1;

public class AccessClass2 
{
	public static void main(String[] args) 
	{
		AccessClass1 ob=new AccessClass1();
		/*   System.out.println(ob.a);
		//System.out.println(ob.b); Private doesn't have access within the package
		System.out.println(ob.c);
		System.out.println(ob.d);  */
		ob.print();
		//ob.print1(); Private doesn't have access within the package
		ob.print2();
		ob.print3();
	}
}
