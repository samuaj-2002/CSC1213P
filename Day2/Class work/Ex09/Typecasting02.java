public class Typecasting02{
	public static void main(String args[]){
		int num=5004;
		double doubleNum=(double)num;
	System.out.println("The Value of "+num+" after converting to the double is "+doubleNum);
	
	int convertedInt=(int)doubleNum;
	System.out.println("The value of "+doubleNum+" after converting in to int again is "+convertedInt);
	}
}