package basic;
class Stack{
	int tos;
	int st[]=new int[10];
	
	Stack(){
		tos=-1;
	}
	void push(int item){
	if(tos==9){
	System.out.println("stack is full");	
	}
	else{
		st[++tos]=item ;
		}
	}
	int pop(){
		if(tos<0){
			System.out.println("stack underflow");
			return 0;
		}
		else{
			return st[tos--];
		}
	}
}
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack stack=new Stack();
Stack stack1=new Stack();
for (int i=0;i<10;i++)
	stack.push(i);
for(int i=10;i<20;i++)
	stack1.push(i);
System.out.println("Stack in mystack1:");
for(int i=0; i<10; i++)
System.out.println(stack.pop());
System.out.println("Stack in mystack2:");
for(int i=0; i<10; i++)
System.out.println(stack1.pop());
	}

}
