import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;

public class PowerOfNumber {

   public static void main(String[] args) {
	   PowerOfNumber prob = new PowerOfNumber();
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a number: ");
      double number = scanner.nextDouble();
      System.out.print("Enter power: ");
      double power = scanner.nextDouble();

      try {
         System.out.println(prob.getPowerOfNumber(number, power));
      } catch(Exception e) {
         System.out.println(e);
      }
      scanner.close();
   }

   // 1. create a program which will calculate the power of a number:
   // You need to read number 'n' and power value 'p' from the console and calculate the power and print he same into the console.
   // If n or p is zero you need to throw an exception and print the same in console like 'java.lang.Exception: n and p should not be zero.'
   // If n or p is negative you need to throw and exception and print the same in console like 'java.lang.Exception: n and p should not be zero.'

   public double getPowerOfNumber(double n, double p) throws Exception {
      if(n == 0 || p == 0) {
         throw new Exception("n and p should not be zero.");
      }
      if(n < 0 || p < 0) {
         throw new Exception("n and p should not be negative.");
      }
      return Math.pow(n, p);
   }
}
