package Collection_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset2 
{
	public static void main(String[] args) 
	{
		TreeSet<String> tr=new TreeSet<String>();
		
		tr.add("teju");
		tr.add("trisha");
		tr.add("raj");
		tr.add("viju");
		tr.add("jaya");
		tr.add("viru");
		tr.add("bhushan");
		
		System.out.println(tr);
		
		System.out.println(tr.isEmpty());
		
		System.out.println(tr.size());
		
		tr.remove("viju");
		
		System.out.println(tr);
		
		Iterator <String> or = tr.iterator();
		
		while(or.hasNext())
		{
			System.out.println(or.next());
		}
		
		System.out.println("_______________\n");
		
		for(String L:tr)
		{
			System.out.println(L);
		}
		
		
		
		
		
		
		
	}

}
