package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_ForIterator 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add("sumit");
		al.add(45);
		al.add(null);
		al.add("sumit");
		al.add(null);
		al.add(745);
		
		
		// BY USING ITERATOR CURSOR WE CAN PERFORM ONLY READ AND REMOVE OPERATION
		
		//   (CANT PERFORM REPLACE AND ADDITION)
		
		//SINGLE DIRECTIONAL CURSOR
	
		 //Universal cursor---->can fetch properties from all implementation classes
		
		Iterator itr = al.iterator(); 
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("______________");
		
		
		
		 
		
		
		
		
		
	}

}
