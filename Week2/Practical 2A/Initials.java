//Taylor McGonagle
//24/09/24
//Initials
//PO2A Q6

import java.util.Scanner;
  public class Initials
{
  
  public static void main(String[ ] args)
{
   Scanner keyboardIn = new Scanner(System.in);
   char firstInt, secondInt;
      
   System.out.print("Enter Your First Initial: ");
   firstInt = keyboardIn.next().charAt(0);
   System.out.print("Enter Your Second Initial: ");
   secondInt = keyboardIn.next().charAt(0);     
      
   System.out.println("Your Initials are: " + firstInt + " " + secondInt);
}
}