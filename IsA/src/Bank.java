public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount sa=new SavingAccount();
		CurrentAccount ca=new CurrentAccount();
		Account myacc=new Account();
		sa.deposit();
	    sa.roi();
	    sa.withdraw();
	    ca.deposit();
	    ca.withdraw();
	//    ca.roi();
	    myacc.deposit();
	    myacc.withdraw();
	//    myacc.roi();
	}
	}


