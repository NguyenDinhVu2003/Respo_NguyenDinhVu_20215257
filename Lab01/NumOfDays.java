import java.util.Scanner;
public class NumOfDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = input.nextLine();
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (month.equals("January") || month.equals("Jan.") || month.equals("Jan") || month.equals("1") ||
			month.equals("March") || month.equals("Mar.") || month.equals("Mar") || month.equals("3") ||
			month.equals("May") || month.equals("5") ||
			month.equals("July") || month.equals("Jul") || month.equals("7") ||
			month.equals("August") || month.equals("Aug.") || month.equals("Aug") || month.equals("8") ||
			month.equals("October") || month.equals("Oct.") || month.equals("Oct") || month.equals("10") ||
			month.equals("December") || month.equals("Dect.") || month.equals("Dec") || month.equals("12")){
			System.out.println("The number of days in " + month + ", " + year + " is 31 days.");
		}
		else if (month.equals("February") || month.equals("Feb.") || month.equals("Feb") || month.equals("2")) {
			System.out.println("The number of days in " + month + ", " + year + " is " + ((leapYear) ?  "29 days" : "28 days"));
		}
		else if (month.equals("April") || month.equals("Apr.") || month.equals("Apr") || month.equals("4") ||
				 month.equals("June") || month.equals("Jun") || month.equals("6") ||
				 month.equals("September") || month.equals("Sep.") || month.equals("Sep") || month.equals("9") ||
				 month.equals("November") || month.equals("Nov.") || month.equals("Nov") || month.equals("11")){
			System.out.println("The number of days in " + month + ", " + year + " is 30 days.");
		}
		else System.out.println("Invalid input. Please try again.");
	}
}
