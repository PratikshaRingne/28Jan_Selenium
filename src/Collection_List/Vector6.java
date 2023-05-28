package Collection_List;

import java.util.Enumeration;
import java.util.Vector;

public class Vector6 
{
	public static void main(String[] args) 
	{
		Vector s1=new Vector();
		
		
		s1.add(null);
		s1.add(23);
		s1.add("nita");
		s1.add('C');
		s1.add(null);
		s1.add("nita");
		
		//Using Enumeration
		
		Enumeration T = s1.elements();
		
		while(T.hasMoreElements())
		{
			System.out.println(T.nextElement());
		}
		
		System.out.println("__________\n");
		
		for(Object h:s1)
		{
			System.out.println(h);
		}
		
		
	}

}
