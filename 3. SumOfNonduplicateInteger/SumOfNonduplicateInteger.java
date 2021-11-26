import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfNonduplicateInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		while (size < 2) {
			System.out.println();
			System.out.print("Enter array size (> 1): ");
			size = scanner.nextInt();
		}
		System.out.println("Enter " + size + " numbers: ");

		Map<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < size; i++) {
			int value = scanner.nextInt();
			if (hmap.containsKey(value)) {
				hmap.remove(value);
			} else {
				hmap.put(value, value);
			}
		}
		System.out.println();

		System.out.println("Sum of " + hmap.values().toString() + " is " + getSumOfArray(hmap));
		scanner.close();
	}

	// 3. Sum of integers which are not repeated:
   // Read n numbers from the console and print the sum of numbers which are not repeated in the list.
   // Should read atleast 2 numbers.

	public static int getSumOfArray(Map<Integer, Integer> hmap) {
		return hmap.values().stream().mapToInt(Integer::intValue).sum();
	}
}
