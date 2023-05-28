package Collection_Set;

import java.util.LinkedHashSet;

public class LinkedHashset_1 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add("abc");
		lh.add(65);
		lh.add('M');
		lh.add(78.95f);
		lh.add(null);
		
		System.out.println(lh.isEmpty());
		
		System.out.println(lh.size());
		
		System.out.println(lh);  // Order Of Insertion Maintained
		
		 lh.clear();
		 
		 System.out.println(lh.size());
		 
		 
		 //Data Structure ---->Hybrid
		 
		 //Best Choice  -----> To remove duplicate elements 
		 //when order of insertion mandatory
		
	}

}
