class Customer{
	private int id;
	private String name;
	private String address;
	Customer(int id,String name ,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString(){
		return "Id"+id+"Name"+name+"Address"+address;
	}
}
public class ObjectPrint {

	public static void main(String[] args) {
		Customer customer=new Customer(12345,"Shubham","Ghaziabad");
		System.out.println(customer);
		System.out.println(customer.toString());

	}

}
