//Taylor McGonagle
//27/09/24
//Enter Name and Price of a Product
// P02C Q2

import java.util.Scanner;

public class NamePriceProduct
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    final double DISCOUNT_AMOUNT = 20.0;
    String nameProduct = "";
    double priceProduct = 0;
    
    System.out.print("Please emter product name: ");
    nameProduct = keyboardIn.next();
    System.out.print("Please enter product price: ");
    priceProduct = keyboardIn.nextDouble();
    
    double finalMath = priceProduct * DISCOUNT_AMOUNT / 100;
    double finalPrice = priceProduct - finalMath;
    
    System.out.println(nameProduct + " original price is " + priceProduct);
    System.out.println("Discount " + DISCOUNT_AMOUNT);
    System.out.println("Final Price is " + finalPrice);
  }
}