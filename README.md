# Student Info

Name: Abraham a/l Ravichandran

No Matric: 271376

# Introduction

In this assignment, I am going to investigate a car loan then make a JAVA code to discover the monthly repayment that should be made and the amount of principal, interest, and balance of each year. A car loan is an amount of money taken from a lending provider to purchase a new or used car. Pseudocode and flow chart should be done before solving the problems by coding after identifying the problem. Car price, down payment, loan period and interest rate are required to be known. Use the data given under certain specific conditions, the data would be processed, and analysis may be done then the payment schedule can be shown. This assignment tests me about my understanding of the application (loop and while) in coding and programming.

# Pseudo-Code

START 

Declare

double carPrice=0,downPayment=0,interestRate=0,total_interest,monthly_repayment,principal,interest,balance;

int loanPeriod=0,years=1;

input carPrice

output enter carPrice (RM)

loop enter the carPrice when the carPriceless than RM30000

input downPayment

output enter downPayment(RM)

loop enter downPayment when the less than = to zero

input loan period

output enter loan period(Years)

loop enter when the loan period less than five or bigger than nine

input interest rate 

output enter the interest rate(%)

loop enter the interest when the interest rate smaller than 0.03 or bigger than 0.07

determine the total interest= (carPrice – downPayment) x interest rate x loan period

determine the monthlyRepayment=( carPrice-downPayment + total interest) ÷ ( loan period x 12)

output monthlyRepayment

loop resolve on loan period

    determine principal = monthlyRepayment x 12 x years
		
    determine interest = total interest ÷ loan period x years
		
    determine balance = monthlyRepayment x 12 x (loan period – years)

output years, principal, interest, balance, 

    determine years ++

END

# FlowChart
![code2flow_1hUsDM](https://user-images.githubusercontent.com/55254441/71311406-bffdec00-2459-11ea-8269-983e845fcdd2.png)


# SCREENSHOT OF THE OUTPUT 
![Screenshot (5)](https://user-images.githubusercontent.com/55254441/68542467-c3786f00-03e7-11ea-9add-fa12fefc7bbb.png)



