package hello;

import java.util.Scanner;

class Area{
	
	Area(int x ,int y ){

     System.out.println("Area of rectangle"+(x*y));
}
	}
public class AreaRect {

	public static void main(String[] args) {
		

		System.out.println("Enter the length");
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		System.out.println("Enter the width");
		Scanner scanner1 = new Scanner(System.in);
		int y=scanner1.nextInt();
		Area A= new Area(x,y);
	}

}
