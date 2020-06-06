package myfirstjavaprogram;

public class AccountHolderObjects {

	public static void main(String[] args) {

		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstname = "Tom";
		tom.lastname = "Smith";
		tom.age = 21;
		tom.accountbalance = 1000;
		tom.eligibleforcc();
		System.out.println("Is Tom eligible for CC: "+tom.iseligibleforcreditcard);
		
	}

}
