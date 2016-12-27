import java.util.Scanner;

class A{
	A(){
		System.out.println("A cons call");
	}
	void print(){
		System.out.println("A call");
	}
}
class B{
	B(){
		System.out.println("B cons call");
	}
	void disp(){
		System.out.println("B call");
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //A obj=new A();                             //eager way
		System.out.println("Enter the class name");
		Scanner scanner=new Scanner(System.in);
		String className=scanner.next();
		 
			
	}

}
     