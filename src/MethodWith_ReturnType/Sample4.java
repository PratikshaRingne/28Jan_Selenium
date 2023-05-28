package MethodWith_ReturnType;

public class Sample4 
{
	
//  Regular Methods With "String" return type
	
	public static void main(String[] args) 
	{
		String Upper=M1("vijaya"); 
		System.out.println(M1("vijaya"));
		
		System.out.println("____________\n");
		
		Sample4 S= new Sample4();
		
		String Lower=S.M2("DESKTOP");
		System.out.println(S.M2("DESKTOP"));
		
		
		
	}	
		
		
		public static String M1(String name)
		{

			String Upper=name.toUpperCase();
			return Upper;
		}
		
		public String M2(String name)
		{
			String Lower=name.toLowerCase();
	        return Lower;
			
		}
		
		
		
		
	

}
