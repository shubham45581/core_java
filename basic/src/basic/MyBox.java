package basic;
class Box{
	double width;
	double height;
	double depth;
	Box(double w,double h,double d){
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	double volume(){
		return width*height*depth;
	}
}
public class MyBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box(10,7,8);
		Box box1=new Box(3,6,9);
		double vol;
		/*box.width=10;
		box.height=7;
		box.depth=8;*/
		//vol=box.depth*box.height*box.width;
		vol=box.volume();
		System.out.println("Volume is"+vol);
		
		/*box1.width=9;
		box1.height=6;
		box1.depth=5;*/
		//vol=box1.depth*box1.height*box1.width;
		vol=box1.volume();
		System.out.println("Volume is"+vol);
		}

}
