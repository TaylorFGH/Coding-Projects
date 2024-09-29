//Taylor McGonagle
//26/09/24
// Average of 3 double numbers
// P02B Q1
import java.util.Scanner;
 public class DoubleValues
{
   
   public static void main(String[ ] args)
 {
   Scanner keyboardIn = new Scanner(System.in);
   
   double numOne = 0;
   double numTwo = 0;
   double numThree = 0;
   
   System.out.print("Enter a Double Number: ");
   numOne = keyboardIn.nextDouble();
   System.out.print("Enter a Double Number: ");
   numTwo = keyboardIn.nextDouble();
   System.out.print("Enter a Double Number: ");
   numThree = keyboardIn.nextDouble();
   
   double totalAverage = (numOne + numTwo + numThree) / 3;
   
   
   System.out.println("The average of your values is: " + totalAverage);
  }
}