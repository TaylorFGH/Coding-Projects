//Taylor McGonagle
//26/09/24
// Display Change that is due
// P02B Q3

import java.util.Scanner;
public class ChangeDue
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
   
    double priceItem = 0;
    double amountPaid = 0;
  
    System.out.println("Enter Price of item:");
    priceItem = keyboardIn.nextDouble();
    System.out.println("How much money did u hand over:");
    amountPaid = keyboardIn.nextDouble();
    
    double changeDue = amountPaid - priceItem;
    
    System.out.println("Your change due is" + " " + changeDue); 
  
  
  
  
  
  }
}