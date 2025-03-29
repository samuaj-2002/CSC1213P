import java.util.Scanner;
class Ex02{
public static void main(String args[])
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num1 =Sc.nextInt();
	
	
	System.out.println("Enter the number 2 ");
	int num2=Sc.nextInt();
	
	
	
	System.out.println("Enter the number 3 ");
	int num3=Sc.nextInt();
	
	if (num1>num2 && num1>num3){
		System.out.println(num1+"  is the maximum number ");
		
	}
	else if (num2>num1 && num2>num3){
		System.out.println(num2+"  is the maximum number ");
		
	}
	
	else  {
		System.out.println(num3+"  is the maximum number ");

	
}	

	
}
}