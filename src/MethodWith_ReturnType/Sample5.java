package MethodWith_ReturnType;

public class Sample5 
{
	//Static Regular Method with float rutern type
	
	public static void main(String[] args) 
	{
		String name=M1("Neha");
		//M1("Neha");
		System.out.println(M1("Swati"));
		System.out.println("___________\n");
		
		float per=M1(78.54f);
		//M1(78.54f);
		System.out.println(M1(89.40f));
		System.out.println("__________\n");
		
		System.out.println(name+"\n"+per);
		
		
		
	}
	public static String M1(String name)
	{
		return name;
		 
	}
	public static float M1(float per)
	{
		return per;
		 
	}
	
	
	

}
