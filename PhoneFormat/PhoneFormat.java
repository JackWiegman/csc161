import java.util.Scanner;
import java.util.regex.*;

public class PhoneFormat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter phone number in the format of (555)-555-5555:");
		String input = scan.next();

		if (checkNumber(input.trim())) {
			System.out.println("Valid Phone Number");
		} else {
			System.out.println("Bad Format for Phone number");
		}
	}

	public static boolean checkNumber(String number) {
		return number.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}");
	}

}