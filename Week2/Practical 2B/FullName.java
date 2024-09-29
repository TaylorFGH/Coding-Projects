//Taylor McGonagle
//26/09/24
//First and surname
//P02B Q6

import java.util.Scanner;

public class FullName
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    // Ended up using string here as char didnt work, was confused when worked, String did not highlight as valid syntax..? aka pink.
    String firstN, surN;
    
    
    System.out.print("Please enter your first name: ");
    
    // used .next(); here and worked, tried char and string but got results with just .next();
    firstN = keyboardIn.next();
    System.out.print("Please enter your second name: ");
    surN= keyboardIn.next();
    
    System.out.println("Your full name is: " + firstN + " " + surN);
  }
}