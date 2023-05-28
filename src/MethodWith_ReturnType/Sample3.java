package MethodWith_ReturnType;

public class Sample3 
{
	//Non-Static Rgular Method with reurn type "int"
	
	public static void main(String[] args) 
	{
		Sample3 S=new Sample3();
		int Mult=S.M1(20, 30);
		System.out.println("Mult="+S.M1(20, 30));
		
		System.out.println("_________\n");
		
		int Add=S.M2(10, 20, 40);
		System.out.println("Add="+S.M2(10, 20, 40));
		
		
	}
	
	public int M1(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public int M2(int x,int y,int z)
	{
		int v=x+y+z;
		return v;
	}

}
