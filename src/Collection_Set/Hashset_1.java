package Collection_Set;

import java.util.HashSet;

public class Hashset_1 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		hs.add(45);
		hs.add("priya");
		hs.add(null);
		hs.add("priya");
		hs.add(null);
		hs.add('C');
		hs.add(78.54f);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.add(62);
		
		System.out.println(hs);
		
		hs.add("ishu");
		
		System.out.println(hs);
		
		hs.remove('C');
		
		System.out.println(hs);
		
		//Best Choice  -----> To remove duplicate elements 
		 //when order of insertion IS NOT mandatory
		
		
	}

}
