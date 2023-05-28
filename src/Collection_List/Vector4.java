package Collection_List;

import java.util.ListIterator;
import java.util.Vector;

public class Vector4 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add("trisha");
		v.add("trisha");
		v.add(null);
		v.add(null);
		v.add(65);
		v.add('B');
		
	
		
		//Using ListIterator
		
		ListIterator gh = v.listIterator();
		
		
		while(gh.hasNext())
		{
			System.out.println(gh.next());
		}
		System.out.println("_______\n");
		
		for(Object R:v)
		{
			System.out.println(R);
		}
		
		System.out.println("_______\n");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
		
		
	}

}
