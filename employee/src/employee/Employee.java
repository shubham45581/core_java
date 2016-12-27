package employee;

public class Employee {
public int id;
public String name;
public String email;
public String mobileno;
public String companyname;
public String managername;
public String adress;
public String companyaddress;
public double salary;
Employee(){
	companyname="INFOSYS";
	companyaddress="Gurgaon";
}
Employee(int id,String name ,double salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getCompanyaddress() {
	return companyaddress;
}
public void setCompanyaddress(String companyaddress) {
	this.companyaddress = companyaddress;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getManagername() {
	return managername;
}
public void setManagername(String managername) {
	this.managername = managername;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void setId(int id) {
	this.id = id;
}

}
