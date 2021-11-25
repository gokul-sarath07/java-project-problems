import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LettersInEvenAndOdd {
   public static void main(String[] args) {
	   LettersInEvenAndOdd cls = new LettersInEvenAndOdd();

	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter a string: ");
	   String string = scanner.nextLine();
      System.out.println();

	   try {
		   List<String> result = cls.getOddAndEvenPositions(string);
		   System.out.println("Odd String: " + result.get(0));
		   System.out.println("Even String: " + result.get(1));

	   } catch(Exception e) {
		   System.out.println(e);
	   }
	   scanner.close();
   }

   // 2. Print letters in even and odd possitions:
   // Create a program which will accept a line of text ffom console and print as two output lines. First line will be the chars in the odd index and the second will be the chars in even index.
   // The input sentence should atleast have 2 chars.

   public List<String> getOddAndEvenPositions(String str) throws Exception {
	   if (str.length() < 2) {
		   throw new Exception("String length must be atleast 2.");
	   }
	   StringBuilder oddString = new StringBuilder();
	   StringBuilder evenString = new StringBuilder();
	   for(int i = 0; i < str.length(); i++) {
		   if (i % 2 == 0) {
			   oddString.append(str.charAt(i));
		   } else {
			   evenString.append(str.charAt(i));
		   }
	   }
	   return Arrays.asList(oddString.toString(), evenString.toString());
   }
}
