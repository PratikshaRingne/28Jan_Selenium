package Collection_List;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_ForEnumeration 
{
	 public static void main(String[] args) 
	 {
		 
		 Vector v=new Vector();
		 
		 v.add(null);
		 v.add("rutuja");
		 v.add(845);
		 v.add("dishant");
		 v.add(null);
		 v.add(845);
		 
		 
		 //Enumeration cursor is Only for LEGACY CLASS
		 //SINGLE DIRECTIONAL CURSOR
		 //CAN PERFORM ONLY "READ" OPERATION (REMOVE,REPLACE,ADD CANT PERFORM)
		 
		 Enumeration en = v.elements();
		 
		 while(en.hasMoreElements())
		 {
			System.out.println(en.nextElement()); 
		 }
		 
		 
		 
		 
		 
		
	 }
	 
	 
	 
}	 
