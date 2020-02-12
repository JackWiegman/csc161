import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int nums = 8;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter " + nums + " numbers.");

		for (int i = 0; i < nums; i++) {
			list.add(scan.nextInt());
		}

		sortNums(list);

	}

	public static void sortNums(ArrayList<Integer> list) {
		Collections.sort(list);

		System.out.println("Sorted:");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}