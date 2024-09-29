//Taylor McGonagle
//26/09/24
//Euro2Sterling
//P02C Q1

import java.util.Scanner;

public class EuroSterling
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    // 1 euro = 90p
    final double CONVSERION_RATE = 0.90;
    double euros = 0;
    
    System.out.println("Enter Euro amount: ");
    euros = keyboardIn.nextDouble();
    
    double sterling = euros * CONVSERION_RATE;
    
    System.out.print(euros + " euros when converted to sterling is " + sterling);
    
  
  }
}