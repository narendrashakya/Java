package MyPackage;

public class DemoClass {
	int a=50;
	int b=30;
	
	public static void main(String[] args) 
	{
		DemoClass obj=new DemoClass();
		obj.Emp();
		System.out.println("Global variable a value is"+obj.a);
		System.out.println("Global variable b value is"+obj.b);
		Calculator obj2=new Calculator();
		obj2.sum();
	}
	
	public void Emp()
	{
		int a=10;
		int b=20;
		System.out.println("sum value is "+(a+b));
		
		
	}
}
