package Matrix;

public class print_all_element_of_matrix {
	public static void main(String[] args) {
		int number=0;
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
