
public class Lab3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 89;
		int[][] matrixA;
		matrixA = new int[8][5];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				int random_number1 = a + (int) (Math.random() * b);
				matrixA[i][j] = random_number1;
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
