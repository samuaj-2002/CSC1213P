import java.util.Scanner;
public class ex1{
	
	public void facto(int num){
		int fac = 1;
		for(int i=num;i>=1;i--){
			fac=fac*i;
		}
		System.out.println("Factorial of "+num+" : "+fac);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		ex1 ob = new ex1();
		ob.facto(num);
	}
}