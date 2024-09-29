//Taylor McGonagle
//27/09/24
//Calculate wages
//P02C Q4

import java.util.Scanner;

public class TotalWages
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    final int HOUR_RATE = 11;
    double hoursWorked;
    double wages;
    
    System.out.print("How many hours did you work this week? ");
    hoursWorked = keyboardIn.nextDouble();
    
    wages = hoursWorked * HOUR_RATE;
    
    System.out.println("Your total wage this week was: " + wages + " Euro");
  }
}