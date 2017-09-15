package chapter11;

class SavingsAccount extends Account{
	SavingsAccount(int id, double balance){
		super(id,balance);}
	@Override
	public void withdraw(double amt){
		if(amt<=super.getBalance())
			super.setBalance(super.getBalance()-amt);
		else
			System.out.println("Your current balance is less than the withdraw amount and a savings account cannot be overdrawn");
	}
	@Override
	public String toString(){
		return ("This is your Saving Account." +super.toString());
	}
}
class CheckingAccount extends Account{
	private final double OVERDRAFT_FEE=35.0;
	private final double OVERDRAFT_LIMIT_PER=0.05;
	private final double OVERDRAFT_UPPER_LIMIT=1000.0;
	private boolean overdraftLimit;
	CheckingAccount(int id, double balance,boolean overdraftLimit){
		super(id,balance);
		this.overdraftLimit=overdraftLimit;
	}
	boolean getOverdraftLimit(){
		return overdraftLimit;
	}
	public void setPOverdraftLimit(boolean val){
		overdraftLimit=val;
	}
	@Override
	public void withdraw(double amt){
		if(amt<=super.getBalance())
			super.setBalance(super.getBalance()-amt);		
		
		else if(amt>super.getBalance()&& getOverdraftLimit()){
			double a=amt-super.getBalance();
			double overdraftValue=(OVERDRAFT_LIMIT_PER*super.getBalance())<1000.0?OVERDRAFT_LIMIT_PER*super.getBalance():1000.0;
			if(a<=overdraftValue)
				super.setBalance(super.getBalance()-amt-OVERDRAFT_FEE);
			else
				System.out.println("You can only withdraw upto this amt "+(super.getBalance()+overdraftValue));
			}			
		else
			System.out.println("Your current balance is less than the withdraw amount and you have not opted for overdraftlimit");
}
	@Override
	public String toString(){
		return ("This is your Checking Account." +super.toString());
	}
	}
public class Question3 {
	public static void main(String args[]){
		Account a1 = new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println(a1);
		System.out.println();
		SavingsAccount s1 = new SavingsAccount(1123, 20000);
		s1.setAnnualInterestRate(2.0);
		s1.withdraw(2500);
		s1.deposit(3000);
		System.out.println(s1);
		System.out.println();
		s1.withdraw(23490);
		System.out.println();
		CheckingAccount c1 = new CheckingAccount(1124, 2000,true);
		c1.withdraw(2050);		
		System.out.println(c1);
		System.out.println();
		c1.deposit(3000);
		System.out.println("New balance after deposit "+c1.getBalance());
		System.out.println();
		c1.setPOverdraftLimit(false);
		c1.withdraw(23000);
	}
}