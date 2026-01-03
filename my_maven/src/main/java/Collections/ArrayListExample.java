package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(); //non generic ArrayList
		al.add("Anjana"); //add is the method to add elements to the ArrayList
		al.add(12);
		al.add('A');
		al.add(23.34f);
		System.out.println(al);
		
		ArrayList<String> a=new ArrayList(); //generic ArrayList
		a.add("Hello");
		a.add("World");
		a.add("java");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		a.remove("java");
		System.out.println(a);
		
		ArrayList<String> st=new ArrayList();
		st.add("Apple");
		st.add("Mango");
		st.add("Orange");
		System.out.println(st);
		
		a.addAll(st);
		System.out.println(a);
		
		al.removeAll(al);
		System.out.println(al);
		
		System.out.println(st.get(2));
		System.out.println(st.size());
		
		boolean b=st.contains("Apple");
		System.out.println(b);
		
		boolean b1=st.contains("Guava");	
		System.out.println(b1);	
		
		boolean b2=st.isEmpty();
		System.out.println(b2);
		
		Iterator it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println(st);
		it.remove();
		System.out.println(st);
	}
}
