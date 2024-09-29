//Taylor McGonagle
//27/09/24
//Name, Age, Year
// P02C Q3

import java.util.Scanner;

public class NameAgeYear
{
  public static void main(String[] args)
  {
    Scanner keyboardIn = new Scanner(System.in);
    
    String nameN = "";
    int ageE = 0;
    int yearR = 0;
    
    System.out.print("What is your name? ");
    nameN = keyboardIn.next();
    System.out.print("What age are you? ");
    ageE = keyboardIn.nextInt();
    System.out.print("What year is it? ");
    yearR = keyboardIn.nextInt();
    
  }
}