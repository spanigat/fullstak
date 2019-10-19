import java.util.Scanner;

public class Account {
	 double diposit, withdraw;
	 double balance=0;
	 public Account(double balance)
	 {
	     this.balance=balance;
	 }
	  void deposit(double ammount)
	{
	       Scanner b=new Scanner(System.in);
	    System.out.println("diposit a amount");
	     ammount=b.nextInt();
	     balance +=ammount;
	}
	  void withdraw (double amount) throws InsufficientBalanceException
	  {
	      if (amount > balance)
	          throw new InsufficientBalanceException("balance is less ");
	      else
	          balance -= amount;
	  }

	  void display()
	  {
	      System.out.println(balance);
	  }
	public static void main(String[]args)
	{
		try{  
			withdraw(Double amount);  
		      }catch(Exception m){System.out.println("Exception occured: "+m);}  
		  
		      System.out.println("rest of the code..."); 

	}

}
