import java.util.Scanner;
public class Ex01
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("User input Integer");
		int Num=sc.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=Num)
		{
			sum=sum+i;
			i++;
	    }
		System.out.print(sum);
	}
}
	
	
	
	
	
	
	
	
	