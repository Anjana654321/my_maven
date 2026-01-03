package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample 
{
	public static void main(String[] args) 
	{
		List ob=new ArrayList();
		ob.add('A');
		ob.add(23);
		ob.add("Anjana");
		ob.add(1223.23d);
		System.out.println(ob);
				
		List<String> ob1=new ArrayList();
		ob1.add("Apple");
		ob1.add("Mango");
		ob1.add("Pineapple");
		ob1.add("Orange");
		System.out.println(ob1);
		
		ob.remove(0);
		System.out.println(ob);
		ob.remove("Anjana");
		System.out.println(ob);
		
		List<String> ob2=new ArrayList();
		ob2.add("Parrot");
		ob2.add("Peacock");
		ob2.add("Hen");
		ob2.add("Crow");
		System.out.println(ob2);
		
		ob1.addAll(ob2);
		System.out.println(ob1);
		
		ob.removeAll(ob);
		System.out.println(ob);
		
		System.out.println(ob1.get(4));
		System.out.println(ob1.size());
		
		boolean b=ob1.contains("Parrot");
		System.out.println(b);
		
		boolean b1=ob1.contains("Carrot");
		System.out.println(b1);
		
		boolean b2=ob1.isEmpty();
		System.out.println(b2);
		
		boolean b3=ob.isEmpty();
		System.out.println(b3);
		
		Iterator i=ob1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(ob1);
		i.remove();
		System.out.println(ob1);
	}

}
