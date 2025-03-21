import java.util.Scanner;
class Exercise{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
	System.out.println("Input the side length values: ");
	double Val=ob.nextDouble();
	System.out.printf("Square: %.2f\n",Val*Val);
	System.out.printf("Cube: %.2f\n",Val*Val*Val);
	System.out.printf("Fourth power: %.2f\n",Math.pow(Val,4));
	}
}