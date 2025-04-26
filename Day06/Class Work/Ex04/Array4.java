class Array4{
	public static void main(String[] args){
		int marks [][] = {{54,2,45},{67,54,87},{76,46,89},{9,10,65}};
		int max;
		
		for(int i=0; i<4; i++){
			max = marks[i][0];
			for(int j=0; j<3; j++){
				System.out.print(marks[i][j] + " ");
				if(max<marks[i][j]){
					max = marks[i][j];
				}
			}
			System.out.println();
			System.out.println("Max of the " + (i+1) + " row: " + max);
		}
		
	}
}