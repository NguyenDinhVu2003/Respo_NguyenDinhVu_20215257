import java.util.Scanner;
public class StarTriangle {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the height of the star-triangle: ");
		int h = n.nextInt();
		for (int i = 0; i < h; i++) {
			for (int j = h - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
}
