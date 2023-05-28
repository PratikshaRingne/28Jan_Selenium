package Collection_List;

import java.util.ArrayList;

public class ArrayList_1 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList(); 
		
		//Initial capacity =10
		//ArrayList a1=new ArrayList(6);----->Resizable
		//duplicate values allowed
		//Storage Type--->index
		//order of insertion maintained
		//manupulation is worst
		
		
		a1.add("Swati");
		a1.add(205);
		a1.add("Ruhi");
		a1.add(78.35f);
		a1.add('A');
		a1.add(89);
		a1.add("Ruhi");
		a1.add(null);
		
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(5));
		System.out.println(a1.size());
		
		//add info in between arraylist---->RIGHT SHIFT OPERATION
		
		a1.add(5, 100);
		System.out.println(a1);
		
		
		//Remove info in between arraylist---->LEFT SHIFT OPERATION
		
		a1.remove(5);
		System.out.println(a1);
		
		a1.clear();
		System.out.println(a1.size());
		 
		
		
	}

}
