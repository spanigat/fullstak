package org.capg.app;

public class BankAcount {
int id;
String name;
float curBal;
void deposit(float amt){
	curBal=curBal+amt;
}
void withraw(float amt){
	curBal=curBal-amt;
}
}
