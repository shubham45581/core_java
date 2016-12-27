package basic;

public class Perrson {
	String name;
	int age;
	String address;
	Perrson(String n,int a,String add)
	{
		//this();
	System.out.println("Parametrized constructor was called");
	 name=n;
	 age=a;
	 address=add;
	 
	}
	
	Perrson()
	{
		this("s",56,"mzn");
		System.out.println("Default constructor was called");
		name="shubham";age=20;address="mzn";
		
	}

	public static void main(String[] args) {
	Perrson p= new Perrson("shubham",20,"sisauli");
	Perrson q=new Perrson();
	System.out.println(p.name);
	System.out.println(p.age);
	System.out.println(p.address);
	
	System.out.println(q.name);
	System.out.println(q.age);
	System.out.println(q.address);
	}

}
