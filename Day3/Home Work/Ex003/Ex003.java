import java.util.Scanner;
public class Ex003
{
	public static void main(String[] args)
	{
		System.out.println("Check If a number divisible by 5 and 12");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int Num=sc.nextInt();
		
		if( Num%5==0 && Num%12==0)
		{
			System.out.println("Number is divisible by both number");
			
		}else
		{
			System.out.println("Number is not divisible by both number");
		}
	}
}
	
			