package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		hs.add(45);
		hs.add("priya");
		hs.add(null);
		hs.add("priya");
		hs.add(null);
		hs.add('C');
		hs.add(78.54f);
		
		//we can only use Iterator for fetching
		
		Iterator D = hs.iterator();
		
		while(D.hasNext())
		{
			System.out.println(D.next());
		}
		
		System.out.println("___________");
		
		for(Object t:hs)
		{
			System.out.println(t);
		}
		
	}

}
