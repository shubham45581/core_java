class Account {
void withdraw(){
	System.out.println("Account runs:withdraw");
}
void deposit(){
	System.out.println("Account runs:deposit"); 
}
/*void roi(){
	System.out.println("Account runs:roi");
}*/
}
class SavingAccount extends Account{
	void roi(){
		System.out.println("Saving Account:roi"); 
	}
} 
class CurrentAccount extends Account{	
	}

