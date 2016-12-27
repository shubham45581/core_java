class Shape{
	int length;
	int breadth;
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	// default constructor
	Shape(){
		length=0;
		breadth=0;
		System.out.println("Inside default constructor of shape"); 
	}
	// parameterized constructor
	Shape(int l,int b){
		int length=l;
		int breadth=b;
		System.out.println("inside paramterised constructor of shape");
		System.out.println("length:"+length);
		System.out.println("breadth:"+breadth);
	}
}
class Rectangle extends Shape{
	public String type;
	Rectangle(){
		super();
		type=null;
		System.out.println("Inside default constructor of rectangle");
		}
	Rectangle(String type,int l,int b){
		super(l,b);
		type=null;
		System.out.println("inside parametrized constructor of rectangle");
		System.out.println("length:"+length);
		System.out.println("breadth:"+breadth);
	}
}
public class Test {

	public static void main(String[] args) {
	Rectangle rectangle=new Rectangle();
	rectangle.getBreadth();
	rectangle.getLength();
 }

}
