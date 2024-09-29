//Taylor McGonagle
//24/09/24
// Add Age in days
//PO2A Q2

import java.util.Scanner;
  public class AgeDays
{
  
  public static void main(String[ ] args)
{
   Scanner keyboardIn = new Scanner(System.in);
     final int DAYS_IN_YEAR = 365;
     int age = 0;
      
     System.out.print("Enter Your Age: ");
       age = keyboardIn.nextInt();
      
      int totalAgeDays = age * DAYS_IN_YEAR; 
      
      System.out.println("Your Age in Days is: " + totalAgeDays);
}
}