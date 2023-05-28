package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector_2 
{
	public static void main(String[] args) 
	
	{
		// default capacity 10
		//d.s.= doubly
		//storage type= index
		//incremental capacity=10*2=20
		// legacy class
		//best choice-->retrieval operation (RANDOM ACCEESS INTERFACE IS IMPLEMENTED)
		//worst choice--->manipulation
		//ITERATOR || LISTITERATOR || ENUMERATION
		
		Vector v=new Vector();
		
		v.add(205);
		v.add(205);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		
		v.add("abc");
		System.out.println(v);
		
		v.add(1, "mnb");
		v.remove(1);
		System.out.println(v);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
