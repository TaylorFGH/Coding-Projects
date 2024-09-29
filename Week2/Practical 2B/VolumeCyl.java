//Taylor McGonagle
//26/09/34
//volume of a cylinder
//P02B Q2

import java.util.Scanner;
public class VolumeCyl
{
  public static void main(String[] args)
  {
     Scanner keyboardIn = new Scanner(System.in);
     
     double PI_CONST = 3.141592;
     double radius = 0;
     double height = 0;
     
     System.out.println("Enter the radius of your cylinder");
     radius = keyboardIn.nextDouble();
     System.out.println("Enter the height of your cylinder");
     height = keyboardIn.nextDouble();
     
     double volumeTotal = PI_CONST + radius * radius + height;
     
     System.out.println("The volume of your cylinder is" + " " + volumeTotal);
   }
}