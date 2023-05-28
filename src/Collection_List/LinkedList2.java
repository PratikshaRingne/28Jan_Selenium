package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 
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
		
		//Using Iterator
		
		Iterator op = lt.iterator();
		
		while(op.hasNext())
		{
			System.out.println(op.next());
		}
		
		System.out.println("___________\n");
		
		for(Object h:lt)
		{
			System.out.println(h);
		}
		
		System.out.println("___________\n");
		
		for(int i=0;i<lt.size();i++)
		{
			System.out.println(lt.get(i));
		}
		
	}

}
