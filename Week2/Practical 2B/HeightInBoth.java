//Taylor McGonagle
//26/09/24
//Height in feet and inches
//P02B Q5

import java.util.Scanner;

public class HeightInBoth
{ 
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    double heightInches = 0;
    
    System.out.println("Whats your height in inches..? ");
    heightInches = keyboardIn.nextDouble();
    
    double heightFeet = heightInches / 12;
    
    System.out.println("Your height in inches is: " + heightInches);
    System.out.println("Your height in feet is: " + heightFeet + "Ft");
  }
}