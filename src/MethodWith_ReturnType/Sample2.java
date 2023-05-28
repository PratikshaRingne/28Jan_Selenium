package MethodWith_ReturnType;

public class Sample2 
{
	
	// METHODS WITH "int" RETURN TYPE
	
				// M1 and M2 are the static regular method with return type "int"
				// It means it return int value.
				// we can store these value in another variable in main method
				//We can print output directly in printing statement
				
	
	 public static void main(String[] args) 
	 {
		 
		// M1(40,80);   ____DOESNT PRINT ANY VALUE
		 
		int c=M1(40,80); 
		System.out.println("c="+M1(40,80));
		
		System.out.println("\n______________\n");
		
		int mul=M2();
		System.out.println("mul="+M2());
		
		System.out.println("\n_______________\n");
		
		 
		System.out.println("sub="+(mul-c));
		
		
		
	 }
	 
	 public static int M1(int a,int b)
	 {
		 int c=a+b;
		 return c;
	 }
	 
	 public static int M2()
	 {
		 int a=20;
		 int b=50;
		 int mul=a*b;
		 return mul;
	 }

}
