package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector_1 
     //cursor can be used---->*Iterator *Enumeration
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add(203);
        v.add("Rashi");		
		v.add(203);
        v.add(null);
        v.add('B');
        v.add(55.62f);
        
        System.out.println(v.size());
        System.out.println(v.get(2));
        System.out.println(v);
        
        //By using Iterator cursor
        
        Iterator itr=v.iterator();
        
        for(int i=0;i<v.size();i++)
        {
        	System.out.println(v.get(i));
        	
        }
        
        System.out.println("______________");
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        System.out.println("______________");
        
        for(Object S:v )
        {
        	System.out.println(S);
        }
        
        
        
        
        
        
        
        
        
        
        
         
	} 
	 
}
