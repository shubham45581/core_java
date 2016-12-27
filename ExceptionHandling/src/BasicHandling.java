import java.util.InputMismatchException;
import java.util.Scanner;

class Input{
	static int FirstNo=0;
	static int SecondNo=0;
	static Scanner scanner=new Scanner(System.in);
	public int firstno(){
		System.out.println("Enter the first number:");
		try{
		FirstNo=scanner.nextInt();
		}
		catch(InputMismatchException e){
		System.out.println("Sorry,You have entered the characters,please enter only numerics");
		scanner.nextLine();
		firstno();
	}
	return FirstNo;
	}
	public int secondno(){
		System.out.println("Enter the second number:");
		try{
			SecondNo=scanner.nextInt();
			}
			catch(InputMismatchException e){
			System.out.println("Sorry,You have entered the characters,please enter only numerics");
			scanner.nextLine();
		    secondno();
		}
		return SecondNo;
	}
}

public class BasicHandling {

	public static void main(String[] args) {
		Input input=new Input();
		int FirstNo=input.firstno();
		int SecondNo=input.secondno();
		//int Result=0;
		//try{
		int Result=FirstNo/SecondNo;
		//}
		//catch(ArithmeticException e){
			System.out.println("Result is" + Result);
		//System.out.println("U have entered wrong input");
	//}
	   // Result=FirstNo/SecondNo;
	//	System.out.println("Result is" + Result);
	}
}
