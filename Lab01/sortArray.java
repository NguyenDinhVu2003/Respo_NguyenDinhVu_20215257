import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = n.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("a[" + i + "]=");
			arr[i] = n.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The given array is now sorted as: " + Arrays.toString(arr));
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of array elements: " + sum);
		double average = (double) sum / size;
		System.out.println("Average value of array elements: " + average);
	}
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
