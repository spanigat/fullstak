package org.capg.app;

public class TestBankCount {
public static void main(String[] args) {
	BankAcount bc=new BankAcount();
	System.out.println("current balance is "+ bc.curBal);
	bc.deposit(5000);
	System.out.println("Balance now "+bc.curBal);
	
	bc.withraw(2000);
	System.out.println("After withdwaw "+bc.curBal);
}
}
