package MyPackage;

public class array {

	public static void main(String[] args) 
	{

		int test[]=new int[5];
		test[0]=10;
		test[1]=20;
		test[2]=30;
		test[3]=40;
		test[4]=50;
		
		int sizeofarray=test.length;
		System.out.println("size of array is "+sizeofarray);
		
		for (int i=0;i<test.length;i++)
		{
			System.out.println("array is "+test[i]);
		}
	}

}
