class BankAccount{
	String ownerName;
	int accNumber;
	float balance;
	BankAccount(){
        System.out.println("Construction method is used!!!! ");
	}

}
class TestBankAcc{
	public static void main(String[] args){
	System.out.println("Before creating the object!!!");
	BankAccount myAccount=new BankAccount();
	System.out.println("The object has created!!!");
	System.out.println("ownerName="+myAccount.ownerName);
	System.out.println("acountNumber="+myAccount.accNumber);
	System.out.println("balance="+myAccount.balance);
	}
}