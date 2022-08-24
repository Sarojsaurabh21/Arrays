package Array;



public class Takeinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner();
		int size= sc.nextInt();
		System.out.println("enter user inpute");
		int a[]=new int [size];
		//System.out.println("enter user inpute");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println("print out put");
		for(int i=0;i<size;i++)
		{
			System.out.println("enter user inpute"+a[i]);
		}
	}

}
