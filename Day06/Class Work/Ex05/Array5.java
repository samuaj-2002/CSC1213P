
import java.util.Scanner;
class Array5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size of the array: ");
		int row = sc.nextInt();
		System.out.print("Enter the column size of the array: ");
		int column = sc.nextInt();
		int numbers[][] = new int[row][column];
		int sum = 0;
		int max = numbers[0][0];
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				System.out.print("Enter the element: ");
				numbers[i][j] = sc.nextInt();
				sum = sum + numbers[i][j];
				if(max<numbers[i][j]){
					max = numbers[i][j];
				}
			}
		}
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
			
			
		System.out.println("Sum of the elements: " + sum);
		System.out.println("Max of the elements: " + max);
	}
}