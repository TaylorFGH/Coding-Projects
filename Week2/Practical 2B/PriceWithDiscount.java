//Taylor McGonagle
//26/09/24
//Prices with discount
//P02B Q4

import java.util.Scanner;

public class PriceWithDiscount
{
  
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    final double DISCOUNT_PERCENT = 0.1;
    double productOne = 0;
    double productTwo = 0;
    double productThree = 0;
    
    System.out.println("Price of product 1: ");
    productOne = keyboardIn.nextDouble();
    System.out.println("Price of product 2: ");
    productTwo = keyboardIn.nextDouble();
    System.out.println("Price of product 3: ");
    productThree = keyboardIn.nextDouble();
    
    double grossAmount = productOne + productTwo + productThree;
    double discountEarned = grossAmount * 0.1;
    double totalAmount = grossAmount - discountEarned;
    
    System.out.println("Gross Amount Is: " + grossAmount);
    System.out.println("The discount earned is: " +  discountEarned);
    System.out.println("The Total Amount due is: " +  totalAmount);
  }
}