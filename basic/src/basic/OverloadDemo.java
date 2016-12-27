package basic;
class Overload{
	void test(){
		System.out.println("no parameters");
	}
	int test(int a){
		System.out.println("a:"+a);
	}
	void test(int a,int b){
		System.out.println("a and b: " + a + " " + b);
		}
	double test(double a){
		System.out.println("double a:"+a);
		return a*a;
	}
}
public class OverloadDemo {
	Overload obj=new Overload();
	double result;
obj.test();
obj.test(10);
}
