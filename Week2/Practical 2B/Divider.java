//Taylor McGonagle
//26/09/24
//Divide two numbers from keyboard
//P02B Q7

import java.util.Scanner;

public class Divider
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    int firstNum, secNum;
    
    System.out.print("Enter first number: ");
    firstNum = keyboardIn.nextInt();
    System.out.print("Enter second number: ");
    secNum = keyboardIn.nextInt();
    
    int ans = firstNum / secNum;
    int remainder = firstNum % secNum ;
    
    System.out.print(firstNum + " divided by " + secNum + " equals " + ans + " remainder " + remainder);
  
  }
}