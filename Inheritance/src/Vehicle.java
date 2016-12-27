
class Vehicle {
String colour;
int speed ;
int size;
void quality(){
System.out.println("colour :"+colour);
System.out.println("speed :"+speed);
System.out.println("size :"+size);
}
}

class Car extends Vehicle{
	int cc;
	int gears;
	//@Override
	void qualitycar(){
		System.out.println("colour of car:"+colour);
		System.out.println("speed of car:"+speed);
		System.out.println("size of car:"+size);
		System.out.println("CC of car:"+cc);
		System.out.println("No. of  Gears of car:"+gears);
	}
}
