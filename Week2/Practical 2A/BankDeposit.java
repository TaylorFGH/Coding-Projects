//Taylor McGonagle
//24/09/24
// Bank Deposit
//PO2A Q5

import java.util.Scanner;
  public class BankDeposit
{
  
  public static void main(String[ ] args)
{
   Scanner keyboardIn = new Scanner(System.in);
     int bank_bal = 0;
     int deposit = 0;
      
     System.out.print("Enter Your bank balance: ");
       bank_bal = keyboardIn.nextInt();
         System.out.print("Enter Your Deposit amount: ");
          deposit = keyboardIn.nextInt();
          int newBalance = bank_bal + deposit;
      
      
      
      System.out.println("Your New Balance is: " + newBalance);
}
}