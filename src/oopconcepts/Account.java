package oopconcepts;

public class Account {

	private int accountNumber;
	private double balance;
	
	public Account(int accountNumber , double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public Account (int accountNumber){
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void setAccountNumber(int accuntNumber){
		this.accountNumber = accuntNumber;
	}
	
	public void credit(double amount){
		balance += amount;
	}
	
	public void debit(double amount){
		if(balance < amount){
			System.out.println("Amount withdrawn exceeds the current balance !");
		}else{
			balance -= amount;
		}
	}
	
	public String toString() {
		return String.format("The account number is %d Balance = %.2f", accountNumber,balance);
	}
	
}
