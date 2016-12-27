import java.util.InputMismatchException;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int FirstNo=0;
		int SecondNo=0;
		int Result=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number:");
		try{
		FirstNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
		System.out.println("Sorry,You have entered the characters,please enter only numerics");
		//scanner.nextLine();
		//System.out.println("Enter the second number:");
		scanner.nextLine();
		}
		System.out.println("Enter the second number:");
        try{
		SecondNo  = scanner.nextInt();
        }
        catch(InputMismatchException e1){
        System.out.println("Sorry,You have entered the characters,please enter only numerics");
        //scanner.nextLine();
        }
         //Result=FirstNo/SecondNo;
        
        //catch(ArithmeticException e2){
       //System.out.println("invalid input");
		//}
      Result=FirstNo/SecondNo;
      System.out.println("Result is " + Result);
		//scanner.close();

	}

}
