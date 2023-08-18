package Matrix;

public class sum_of_all_element {
	public static void main(String[] args) {
		int sum=0;
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				sum=sum+matrix[i][j];
			}
		}
		System.out.println(sum);
	}
}
