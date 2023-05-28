package Collection_List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_ForListIterator 
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
		
		//ONLY USED FOR LIST INTERFACES'S IMPLEMENTATION CLASSES
		//BIDIRECTIONAL CURSOR
		//CAN PERFORM READ,ADD,REMOVE AND REPLACE
		
		
		ListIterator lit=al.listIterator();
		
		//Traversing in Forword direction
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("___________\n");
		
		//Traversing in Backword direction
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		System.out.println("___________\n");
		
		//  lit.add(1000);
		//  lit.remove();
		//  lit.set("swara");
		
		System.out.println(al);
		 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
