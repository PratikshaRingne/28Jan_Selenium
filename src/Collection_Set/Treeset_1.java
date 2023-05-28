package Collection_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_1 
{
	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();
		
		//Only Stores Homogenious Data
		
		tr.add(65);
		tr.add(74);
		tr.add(98);
		tr.add(41);
		tr.add(82);
		tr.add(23);
		tr.add(74);
		 
		
		System.out.println(tr);
		System.out.println(tr.isEmpty());
		System.out.println(tr.size());
		
		Iterator it = tr.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("_____________\n");
		
		for(Object u:tr)
		{
			System.out.println(u);
		}
		 
		
		
	}

}
