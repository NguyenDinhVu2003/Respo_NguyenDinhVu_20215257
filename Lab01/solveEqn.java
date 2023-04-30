import java.util.Scanner;
import java.lang.Math;

public class solveEqn {
    public void first_degree_eqn(double a, double b) {        
    	System.out.println("Select the form: ax + b = 0");
    	if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            double root = -b / a;
            System.out.println("The solution is: " + root);
        }
    }

    public void system_of_first_degree_eqn(double a11, double a12, double b1, double a21, double a22, double b2) {
    	System.out.println("Select a11x1 + a12x2 = b1; a21x1 + a22x2 = b2.");
        double D = a11 * a22 - a21 * a12;
        double Dx = b2 * a12 - b1 * a22;
        double Dy = b1 * a11 - b2 * a21;
    
        if (D == 0 && Dx != 0) {
            System.out.println("No solution.");
        }
        else if (D == 0 && Dx == 0) {
        	System.out.println("Infinite number of solution.");
        }
        else {
            double x1 = Dx / D;
            double x2 = Dy / D;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public void second_degree_eqn(double a, double b, double c) {
        System.out.println("Select the form: ax^2 + bx + c = 0.");
        
        if (a == 0) {
        	first_degree_eqn(b, c);
            }
        else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no solution");
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("The solution is x = " + root);;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct solutions: x1 = " + x1 + " ,x2 = " + x2);
            }
        }

    }
    
    public static void main(String[] args) {
    	solveEqn obj = new solveEqn();
    	System.out.println("1.The first-degree equation (linear equation) with one variable.");
    	System.out.println("2.The system of first-degree equations (linear system) with two variables.");
    	System.out.println("3.The second-degree equation with one variable.");
    	Scanner keyboard = new Scanner(System.in);
    	int option = keyboard.nextInt();
        switch (option) {
            case 1:
            	
            	double a, b;
            	System.out.print("Enter a = ");
            	a = keyboard.nextDouble();
            	System.out.print("Enter b = ");
            	b = keyboard.nextDouble();
                obj.first_degree_eqn(a, b);
                break;
            case 2:
            	double a11, a12, b1, a21, a22, b2;
            	System.out.print("Enter a11 = ");
            	a11 = keyboard.nextDouble();
            	System.out.print("Enter a12 = ");
            	a12 = keyboard.nextDouble();
            	System.out.print("Enter b1 = ");
            	b1 = keyboard.nextDouble();
            	System.out.print("Enter a21 = ");
            	a21 = keyboard.nextDouble();
            	System.out.print("Enter a22 = ");
            	a22 = keyboard.nextDouble();
            	System.out.print("Enter b2 = ");
            	b2 = keyboard.nextDouble();
            	obj.system_of_first_degree_eqn(a11, a12, b1, a21, a22, b2);
                break;
            case 3:
            	double c, d, e;
            	System.out.print("Enter c = ");
            	c = keyboard.nextDouble();
            	System.out.print("Enter d = ");
            	d = keyboard.nextDouble();
            	System.out.print("Enter e = ");
            	e = keyboard.nextDouble();
                obj.second_degree_eqn(c, d, e);
                break;
            default:
                System.out.println("No options selected");
                break;
        }
    }
}
