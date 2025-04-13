import java.util.Scanner;
public class Ex03{
	public static void main(String args[]){
	int Number[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	for(int i=0;i<5;i++){
		
		Number[i]=sc.nextInt();
	}
	int min=Number[0];
	int max=Number[0];
	for(int i=0;i<5;i++){
		if(Number[i]<min){
			min=Number[i];
		}
		
		if(Number[i]>max){
			max=Number[i];
		}
		
	}
	System.out.println("min:"+min);
		System.out.println("max:"+max);
	}
}