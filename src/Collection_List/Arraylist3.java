package Collection_List;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist3
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
		
		//Using ListIterator
		
		ListIterator mn = d1.listIterator();
		
		while(mn.hasNext())
		{
			System.out.println(mn.next());
		}
		
		System.out.println("___________\n");
		
		for(int i=0;i<d1.size();i++)
		{
			System.out.println(d1.get(i));
		}
		
		System.out.println("___________\n");
		
		for(Object P:d1)
		{
			System.out.println(P);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
