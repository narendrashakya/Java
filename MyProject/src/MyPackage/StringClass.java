package MyPackage;

public class StringClass {

	public static void main(String[] args) 
	{
		String First="Narendra";
		String Last="Shakya";
		boolean status=First.startsWith("Narendra");
		System.out.println("status is "+status);

		boolean status1=Last.endsWith("Shakya");
		System.out.println("status is "+status1);
		
		boolean check=First.equals(Last);
		System.out.println("Check result is "+check);
		
		boolean test=First.contains(Last);
		System.out.println("Contain result is "+test);
		
		String fullname="My_Name_is_Narendra_Shakya";
		String test2[]=fullname.split("_");
		
		for (int i=0;i<test2.length;i++)
		{
			System.out.println(test2[i]);
			if (test2[i].contains("Shakya"))
			{
				System.out.println("Split contains Shakya");
			}
		}
		
	}

}
