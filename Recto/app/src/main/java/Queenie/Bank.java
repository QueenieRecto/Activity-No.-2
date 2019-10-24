package Queenie;

import java.util.Scanner;

public class Bank {

 public static void main(String[] args)
 
 {
   double loan, intPYr, moPay, intPMo;
   double intPMo2, moPay2 = 0;
   double count = 0;
   
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("•••••••••••••••••••••••••");
    System.out.println("      LOAN SYSTEM        ");
    System.out.println("•••••••••••••••••••••••••");
    System.out.print(" Loan Amount: $");
    loan = myObj.nextDouble();
    System.out.print(" Interest Per Year: ");
    intPYr = myObj.nextDouble();
    System.out.print(" Monthly Payment: $");
    moPay = myObj.nextDouble();
    
    double intRa = intPYr/100;
  
  
  do
  {
    intPMo = intRa / 12;
    intPMo2 = loan * intPMo;
    moPay2 = moPay - intPMo;
    
    if(moPay < intPMo2)
    {
      System.out.println("The monthly payment is less than the first month's interest payment loan amount could not be repaid.");
    }
    
    else
    {
     loan = loan - moPay2;
     count++;
     
    }
  } 
 
  
   while (loan > 0);  
  
    System.out.println(" Months To Paid: " + count);
    System.out.println("•••••••••••••••••••••••••");
    
  }

}
 