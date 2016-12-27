package basic;

public class Test {
	double radius;
	double area;
	public void findArea(double r){
		radius=r;
		area=3.14*radius*radius;
		System.out.println(area);
	}
	 
	 public static int add(int a,int b)
	    {
	    	//int a=10,b=5;
		    int sum=a+b;
		    return sum;
	    }
	 public static int sub(int a ,int b){
		 int diff=a-b;
		 return  diff;
	 }
	 public static int mul(int a ,int b){
		 int prod=a*b;
		 return prod;
	 }
	 public static int div(int a, int b){
		 int rem=a/b;
		 return rem;
	 }
	
	 
	 public static void main(String[] args) {
		 Test c=new Test();
		// c.radius=3.5;
		// c.area=3.14*c.radius*c.radius;
		// System.out.println(c.area);
		 c.findArea(4.7);
		 Test c1=new Test();
		// c1.radius=4.2;
		// c1.area=3.14*c1.radius*c1.radius;
		// System.out.println(c1.area);
		 c1.findArea(.6);
		 int sum=add(10,5);
		 System.out.println(sum);
		 
		 int diff=sub(10,5);
		 System.out.println(diff);
		 
		 int prod=mul(10,5);
		 System.out.println(prod);
		 
		 int rem=div(10,5);
		 System.out.println(rem);
		 
		 
		 
		 
	
	/*
	int a=10,b=5;
	int sum =a+b;
	System.out.println(a+b);
	
	int diff=a-b;
	System.out.println(a-b);
	
	int product=a*b;
	System.out.println(a*b);
	
	int rem=a/b;
	System.out.println(a/b);*/

	}

}



