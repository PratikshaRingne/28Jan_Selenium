package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 
{
	public static void main(String[] args) 
	{
		ArrayList d1=new ArrayList();
		
		d1.add("sachi");
		d1.add("sachi");
		d1.add(null);
		d1.add(405);
		d1.add('A');
		d1.add(null);
		d1.add(null);
		
		//Using Iterator
		
		Iterator itr = d1.iterator();
		
		// for each loop --->for fetching all data
		for(Object y:d1)
		{
			System.out.println(y);
		}
		System.out.println("_________\n");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("_________\n");
		
		 for(int i=0;i<d1.size();i++)
		 {
			System.out.println(d1.get(i)); 
		 }
		
		
	}

}
