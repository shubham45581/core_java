class A{
	int i,j;
	void show(){
		System.out.println("i and j"+i+""+j);
	}
	
}
class B extends A{
	int k;
	void showk(){
		System.out.println("k:"+k);
	}
	void sum(){
		System.out.println("i+j+k:"+ (i+j+k));
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		A obj =new A();
		B obj1=new B();
		obj.i=10;
		obj.j=20;
		
		System.out.println("Contents of obj:");
		obj.show();System.out.println();
		obj1.i=6;
		obj1.j=7;
		obj1.k=9;
		System.out.println("Contents of obj1:");
		obj1.show();
		obj1.showk();
		System.out.println();
		System.out.println("sum:");
		obj1.sum();
		
		System.out.println("sum:");
		

	}

}
