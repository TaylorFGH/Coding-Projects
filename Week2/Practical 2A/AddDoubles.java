//Taylor McGonagle
//24/09/24
// Add two double values together
//PO2A Q1

import java.util.Scanner;
  public class AddDoubles
{
  
  public static void main(String[ ] args)
{
   Scanner keyboardIn = new Scanner(System.in);
      
      System.out.print("Enter the first number: ");
      double num1 = keyboardIn.nextDouble();
      System.out.print("Enter the second number: ");
      double num2 = keyboardIn.nextDouble();
      
      double answer = num1 + num2;
      System.out.println("The answer is: " + answer);
}
}