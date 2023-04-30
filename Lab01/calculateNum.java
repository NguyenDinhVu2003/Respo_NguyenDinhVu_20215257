import java.util.Scanner;

public class calculateNum {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double firstNum;
		firstNum = n.nextDouble();
		System.out.print("Enter the second number: ");
		double secondNum;
		secondNum = n.nextDouble();
		double sum, difference, product, quotient;
		sum = firstNum + secondNum;
		System.out.print("The sum of two numbers: " + sum);
		difference = firstNum - secondNum;
		System.out.print("The difference of two numbers: " + difference);
		product = firstNum * secondNum;
		System.out.print("The product of two numbers: " + product);
		quotient = firstNum / secondNum;
		System.out.print("The quotient of two numbers: " + quotient);
	}
}
