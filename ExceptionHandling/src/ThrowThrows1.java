class LoginView{
	//design
	void DoLogin(){
	System.out.println("Login Design appear");
	System.out.println("User enter the login");
	System.out.println("submit the login things");
	LoginHelper helper=new LoginHelper();
	try{
	helper.DoLogin();
	System.out.println("welcome user");
	}
	catch(ArithmeticException e){
		System.out.println("some error occured"+e);
		e.printStackTrace();
	}
	System.out.println("loginview ends");
	}
}

class LoginHelper{
	//Business Logic
	void DoLogin() throws ArithmeticException{
		System.out.println("user already login or not");
		LoginDAO loginDAO=new LoginDAO();
				loginDAO.DoLogin();
		System.out.println("login success");
		System.out.println("logic ends");
	}
}

class LoginDAO{
	//Data access object

	void DoLogin() throws ArithmeticException{
		System.out.println("connection open");
		System.out.println("query for user id and password");
		try{
		int e=10/0;
		System.out.println("get the result and send to helper");
		
		}
		finally{
			System.out.println("connection close");
		}
	}
}
public class ThrowThrows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoginView view=new LoginView();
view.DoLogin();
	}

}
