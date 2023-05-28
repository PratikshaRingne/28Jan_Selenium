package MethodWith_ReturnType;

public class Sample1 
{
	// METHODS WITH "VOID" RETURN TYPE
	
	// M1 and M2 are the static regular method with return type void
	// It means it doesnt return any value.
	// we cant store these value in another variable in main method
	
	
	
	public static void main(String[] args) 
	{
		M1();   
		         //Only Prints the result
	    M2();
		 
		
	}
	
	public static void M1()
	{
		System.out.println("Method 1 of void return type");
	}
	
	public static void M2()
	{
		 int a=10;
		 int b=20;
		 System.out.println(a+b);
		 
	}

}
