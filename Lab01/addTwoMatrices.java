import java.util.Scanner;

public class addTwoMatrices {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the number of rows of the matrices: ");
		int maxRow = n.nextInt();
		System.out.print("Enter the number of columns of the matrices: ");
		int maxColumn = n.nextInt();
		int[][] matrix1st = new int[maxRow][maxColumn];
		int[][] matrix2nd = new int[maxRow][maxColumn];
		System.out.println("1st matrix: ");
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxColumn; j++) {
				matrix1st[i][j] = n.nextInt();
			}
		}
		System.out.println("2nd matrix: ");
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxColumn; j++) {
				matrix2nd[i][j] = n.nextInt();
			}
		}
		int[][] sumMatrix = new int[maxRow][maxColumn];
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxColumn; j++) {
				sumMatrix[i][j] = matrix1st[i][j] + matrix2nd[i][j];
			}
		}
		System.out.println("The sum of two input matrices is the matrix: ");
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxColumn; j++) {
				System.out.println(sumMatrix + " ");
			}
			System.out.println();
		}
	}
}
