package Collection_List;

import java.util.LinkedList;

public class LinkedList_1 
{
	public static void main(String[] args) 
	{
		LinkedList lt=new LinkedList();
		
		lt.add("harsha");
		lt.add(789);
		lt.add(56.42f);
		lt.add(null);
		lt.add("harsha");
		lt.add('B');
		lt.add(null);
		lt.add(null);
		
		System.out.println(lt.isEmpty());
		System.out.println(lt.size());
		System.out.println(lt.get(4));
		System.out.println(lt);
		
		
		lt.add(3, "abc");
		//----->  NO right shif operation performed---->D.S.=Linear
		
		System.out.println(lt);
		
		lt.remove(4);
		//------->   NO left shift operation
		System.out.println(lt);
		
		
		
	}

}
