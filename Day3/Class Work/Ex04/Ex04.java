import java.util.Scanner;
class Ex04
{
	public static void main(String args[])
	{
	 Scanner ob =new Scanner(System.in);
     System.out.println("Enter a charater");
     char bb=ob.next().charAt(0);
	 
	  switch(bb){
	    case 'a': case 'e': case 'i': case 'o': case 'u': 
		case 'A': case 'E': case 'I': case 'O': case 'U': 
		System.out.println("it is  a Vowel");	
		break;
		default	:	System.out.println("Not a Vowel");	
		}
		

		
	}

	
	
	
}