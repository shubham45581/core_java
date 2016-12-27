package oops;

import java.util.Scanner;

/*class Rectangle{
	int length;
	int breadth;
	void getdata(int x,int y){
		length=x;
		breadth=y;
	}
	int rectarea(){
	int area=length*breadth;
	return(area);
	}
}*/
public class Area {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length");
		double length=scanner.nextDouble();
		System.out.println("Enter the breadth");
		double breadth=scanner.nextDouble();
		double area=length*breadth;
		System.out.println("Area of rectangle:"+area);
		
	}

}
