import java.util.Scanner;
class Ex01{
 public static void main(String args[])
 {
	Scanner ob =new Scanner(System.in);
	System.out.println("Entert a number :");
	int num=ob.nextInt();
	if (num >0)
	{
		System.out.println("possitive number");
		
		
	}
	 else if (num <0){
		 
		 System.out.println("negative number");
	 }
	 
	 else{
		 System.out.println("It is zero");
	 }
 } 
	
}
