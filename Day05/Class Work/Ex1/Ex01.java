import java.util.Scanner;
class Ex01{
	public static void main(String args[]){
	int Number[]=new int[5];
	Scanner sc=new Scanner(System.in);
	
	int sum=0;
	
	for(int i=0;i<5;i++){
		System.out.println("Enter the number");
		Number[i]=sc.nextInt();
		sum=sum+Number[i]; //sum+=Number[i];
	}
	System.out.println( "summation is "+sum);
	}
}
	