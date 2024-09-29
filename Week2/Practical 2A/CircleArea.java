//Taylor McGonagle
//24/09/24
// Find Circle Area
//PO2A Q3

import java.util.Scanner;   
  public class CircleArea
{
  public static void main(String[ ] args)
{
   //Create Scanner
   Scanner keyboardIn = new Scanner(System.in);
    //Define Const and Variable
    final double PI = 3.141592;
    int radiusOne = 0;
    
    //User Input  
     System.out.print("Enter Radius Please: ");
      radiusOne = keyboardIn.nextInt();
        double circleArea = PI * radiusOne * radiusOne;
      
          System.out.println("The area of your circle is: " + circleArea);
}
}