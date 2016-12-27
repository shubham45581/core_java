package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class testInput {

	public static void main(String[] args) throws IOException  {
		/*System.out.println("Enter your name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String data=br.readLine();
		System.out.println("Your name is " +data);*/
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String dat=scanner.nextLine();
		System.out.println("Your name is " +dat);

	}

}
