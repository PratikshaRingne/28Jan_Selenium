package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector3 
{
	public static void main(String[] args) 
	{
       
		Vector v=new Vector();
		
		v.add(205);
		v.add(205);
		v.add(null);
		v.add(null);
		
		System.out.println("---Using Iterator---"); 
		
		Iterator jk = v.iterator();
		
		while(jk.hasNext())
		{
			System.out.println(jk.next());
		}
		
		System.out.println("________\n");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("________\n");
		
		for(Object s1 : v)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
