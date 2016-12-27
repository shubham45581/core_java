import java.util.Scanner;

import org.apache.log4j.Logger;

class MinorAgeException extends Exception{                                         // checked exception are inherited by EXCEPTION
	private int age;                                                                //unchecked exception are inherited by Runtime EXCEPTION

	MinorAgeException(int age){
		this.age=age;
	}
	@Override
	public String toString(){
		return "Your  Age "+age+"  Is Less than 18 U Can't Apply for VoterId and Driving License";
	}
}
public class CustomExceptions {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger(CustomExceptions.class);
		logger.debug("Inside the main");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your age");
		int age= scanner.nextInt();
		try{
			int e1=10/0;
			if(age<18){
				throw new MinorAgeException(age);
			}

			System.out.println("Now U Can Apply for VoterId Card");
			System.out.println("Now U Can Apply for Driving License");
			System.out.println("Now Outside the Main");
		}
		catch(MinorAgeException e){
			System.out.println(e);
			System.out.println("Age Is Less than 18 U Can't Apply for VoterId and Driving License");
		}
		catch(Exception e){
			logger.error(e);
			System.out.println("Some Other Problem Raised in System"); 
		}
		
	}

}
