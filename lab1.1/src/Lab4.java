public class Lab4 {
	public static void main(String[] args) {
		int a = -99;
		int b = 199;
		int[][] matrixA;
		matrixA = new int[5][8];
		int max = -100;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				int random_number1 = a + (int) (Math.random() * b);
				matrixA[i][j] = random_number1;
				if(matrixA[i][j] > max){
					max=matrixA[i][j];
				}
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println(max);
	}

}