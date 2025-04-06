import java.util.Scanner;
public class Ex03
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int EvenCounter=0,OddCounter=0;
		char Control=' ';
		int Sumeven=0;
		
		do{
		System.out.println("Enter the Number ");
		int Number=sc.nextInt();
		if(Number%2==0)
			EvenCounter=EvenCounter+1;
		else
			OddCounter=OddCounter+1;
		
		System.out.println("Do you Want to Continue(Y/N):");
		Control=sc.next().charAt(0);
		
		}while(Control=='Y' || Control=='y');
		System.out.println("Count the Even Numbers of User has Entered is: "+EvenCounter);
		System.out.println("Count the Odd Numbers of User has Entered is: "+OddCounter);
	}
}
