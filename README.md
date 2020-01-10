# Student Info

Name: Abraham a/l Ravichandran

No Matric: 271376

# Introduction

In this assignment, I am going to investigate a car loan then make a JAVA code to discover the monthly repayment that should be made and the amount of principal, interest, and balance of each year. A car loan is an amount of money taken from a lending provider to purchase a new or used car. Pseudocode and flow chart should be done before solving the problems by coding after identifying the problem. Car price, down payment, loan period and interest rate are required to be known. Use the data given under certain specific conditions, the data would be processed, and analysis may be done then the payment schedule can be shown. This assignment tests me about my understanding of the application (loop and while) in coding and programming.

# Pseudo-Code

 
Start

Declare 



double A=0,B=0,D=0,total_interest,monthly_repayment,principal,interest,balance


int C=0,years=1


Input car price


Output enter the car price


Loop enter the car price if the car price less than RM30000


Input down payment 


Output enter the down payment	




Loop enter the down payment if the down payment less than equal to zero 
Input loan period 


Output enter the loan period


Loop enter the loan period if the loan period less than five or more than nine 


Input interest rate 


Output enter the interest rate


Loop enter the interest rate if the interest rate less than 0.03 or more than 0.07


Calculate the total interest = (car price - down payment) * interest rate * loan period


Calculate the total monthly repayment = ( car price - down payment + total interest ) / (loan period * 12)


Output monthly repayment


Loop depending on loan period 


	Calculate principal = monthly repayment *12*years 
	
	
	Calculate interest = total interest / loan period * years 
	
	
	Calculate balance = monthly repayment*12*(loan period-years)
	
	
	
Output years,principal,interest,balance


	Calculate years ++
End

# FlowChart
![flowchart assignment 1](https://user-images.githubusercontent.com/59041081/72139353-a4876080-33c9-11ea-947f-ffd1259be695.png)



# SCREENSHOT OF THE OUTPUT 
![Screenshot (5)](https://user-images.githubusercontent.com/55254441/68542467-c3786f00-03e7-11ea-9add-fa12fefc7bbb.png)



