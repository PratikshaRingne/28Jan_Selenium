package Collection_List;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList3
{
	public static void main(String[] args) 
	{
		LinkedList lt=new LinkedList();
		
		lt.add("harsha");
		lt.add(789);
		lt.add(56.42f);
		lt.add(null);
		lt.add("harsha");
		lt.add('B');
		lt.add(null);
		lt.add(null);
		
		//Using ListIterator
		
		ListIterator K = lt.listIterator();
		
		while(K.hasNext())
		{
			System.out.println(K.next());
		}
		
		System.out.println("__________\n");
		
		for(Object R:lt)
		{
			System.out.println(R);
		}
		
		System.out.println("__________\n");
		
		for(int i=0;i<lt.size();i++)
		{
			System.out.println(lt.get(i));
		}
		
	}

}
