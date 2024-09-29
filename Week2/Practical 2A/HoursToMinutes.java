//Taylor McGonagle
//24/09/24
// Hours to minutes
//PO2A Q4

import java.util.Scanner;
  public class HoursToMinutes
{
  
  public static void main(String[ ] args)
{
   Scanner keyboardIn = new Scanner(System.in);
     final int MIN_IN_HOUR = 60;
     int hours = 0;
      
     System.out.print("Enter number of hours: ");
       hours = keyboardIn.nextInt();
      
      int totalMinutes = hours * MIN_IN_HOUR; 
      
      System.out.println("Your Selected Amount of Hours has: " + totalMinutes + " " + "Minutes");
}
}