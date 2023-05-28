package Collection_List;

import java.util.Enumeration;
import java.util.Vector;

public class Vector5 
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
		
		//Using Enumeration cursor---->Only for Legacy class
		
		 Enumeration E = v.elements();
		 
		 while(E.hasMoreElements())
		 {
			 System.out.println(E.nextElement());
			 
		 }
		 System.out.println("___________\n");
		 
		 for(Object t1:v)
		 {
			 System.out.println(t1);
		 }
		 System.out.println("___________\n");
		 
		 for(int i=0;i<v.size();i++)
		 {
			 System.out.println(v.get(i));
		 }
		 
		 
		 
		
		
	}

}
