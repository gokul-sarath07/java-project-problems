import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

		Set<Integer> array = new HashSet<>();
		for (int i = 0; i < size; i++) {
			array.add(scanner.nextInt());
		}
		System.out.println();

		System.out.println("Sum of " + array.toString() + " is " + getSumOfArray(array));
		scanner.close();
	}

	// 3. Sum of integers which are not repeated:
   // Read n numbers from the console and print the sum of numbers which are not repeated in the list.
   // Should read atleast 2 numbers.

	public static int getSumOfArray(Set<Integer> array) {
		return array.stream().mapToInt(Integer::intValue).sum();
	}
}
