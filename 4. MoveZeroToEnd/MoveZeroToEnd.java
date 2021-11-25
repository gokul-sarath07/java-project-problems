import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = scanner.nextInt();
		System.out.println("Enter " + size + " numbers: ");
		List<Integer> array = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			array.add(scanner.nextInt());
		}
		System.out.println();

		System.out.println("New Array: " + moveZeroToEnd(array, 0).toString());
		scanner.close();
	}

	// 4. Move the zeros to the end:
  	// Read n numbers from the console into an integer array. Move the zeros into the end of the array if any.

	public static List<Integer> moveZeroToEnd(List<Integer> array, int toMove) {
		int i = 0;
		int j = array.size() - 1;
		while (i < j) {
			while (i < j && array.get(j) == toMove) { j--; }
			if (array.get(i) == toMove) { swap(i, j, array); }
			i++;
		}
		return array;
	}

	public static void swap(int i, int j, List<Integer> array) {
		int temp = array.get(j);
		array.set(j, array.get(i));
		array.set(i, temp);
	}
}
