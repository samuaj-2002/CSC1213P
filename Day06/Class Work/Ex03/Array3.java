class Array3{
	public static void main(String[] args){
		int marks[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		int sum = 0;
		int sumi = 0;
		
		//printing the array and calculating the total sum
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				System.out.print(marks[i][j] + " ");
				sum = sum + marks[i][j];
			}
			System.out.println();
		}
		System.out.println("Total Sum: " + sum);
		
		//calculating the row sum
		for(int i=0; i<3; i++){
			sumi = 0;
			for(int j=0; j<4; j++){
				sumi = sumi + marks[i][j];
			}
			System.out.println("Sum of the " + (i+1) + " student's marks: " + sumi);
		}
	}
}