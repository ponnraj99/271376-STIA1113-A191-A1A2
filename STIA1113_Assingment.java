
import java.util.Scanner;

public class Carloan2 {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        double carPrice=0,downPayment=0,interestRate=0,total_interest,monthly_repayment,principal,interest,balance;
    int loanPeriod=0,years=1;
    
    while (carPrice<30000)
    {System.out.print("Enter the car price(RM): ");
    carPrice = scan.nextDouble();}
 
   while (downPayment<=0)
   {System.out.print ("Enter the down payment(RM): ");
     downPayment = scan.nextDouble();}
   
   while (loanPeriod<5 || loanPeriod>9)
   {System.out.print ("Enter the loan period(Years): ");
   loanPeriod = scan.nextInt();}
   
   while (interestRate<0.03 || interestRate>0.07)
   {System.out.print ("Enter the interest rate(%): ");
   interestRate = scan.nextDouble();}
   
   total_interest = (carPrice- downPayment)* interestRate * loanPeriod;
   monthly_repayment = (carPrice - downPayment + total_interest ) / (loanPeriod * 12);
   
   System.out.printf("Monthly Repayment is RM%.2f ",monthly_repayment );
   
   System.out.print ("\nYears \t\t Principal \t\t Interest \t\t Balance \t ");
   
   while (years<=loanPeriod)
   {principal = monthly_repayment * 12 * years;
   interest = total_interest/loanPeriod * years;
   balance = monthly_repayment * 12 * (loanPeriod - years);
   
   System.out.printf ("\n  %d \t\t\t %.2f \t\t %.2f \t\t %.2f\t", years,principal,interest,balance);
   years ++;}
   
      
    }
    
}
