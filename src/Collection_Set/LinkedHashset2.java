package Collection_Set;

 
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lh=new LinkedHashSet();
		
				
		lh.add("abc");
		lh.add(65);
		lh.add('M');
		lh.add(78.95f);
		lh.add(null);
		
		//we can only use Iterator for fetching
		
		Iterator G = lh.iterator();
		
		while(G.hasNext())
		{
			System.out.println(G.next());
		}
		
		System.out.println("___________\n");
		
		for(Object H:lh)
		{
			System.out.println(H);
		}
		
		 
		 
		
		
		
		
		
		
		
		
		
		
				
	}

}
