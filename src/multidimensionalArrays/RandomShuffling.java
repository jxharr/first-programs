package multidimensionalArrays;

public class RandomShuffling {

	public static void main(String[] args) {
		int[][] matrix = new int[12][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int i1 = (int) (Math.random() * matrix.length);
				int j1 = (int) (Math.random() * matrix[i].length);
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
			}
		}
	}

}
