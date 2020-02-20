import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Side 1: ");
		double side1 = scan.nextDouble();
		System.out.print("Side 2: ");
		double side2 = scan.nextDouble();
		System.out.print("Side 3: ");
		double side3 = scan.nextDouble();
		System.out.print("Color: ");
		String color = scan.next();
		System.out.print("Filled: ");
		boolean filled = scan.nextBoolean();

		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString() + "\nColor: " + 
			triangle.getColor() + "\nFilled: "+ triangle.isFilled());

	}

}