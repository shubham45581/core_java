package basic;

public class Switch {

	public static void main(String[] args) {
		final int SUNDAY=1;
        final int MONDAY=2;
        int choice = SUNDAY;
        switch(choice){
        case SUNDAY:
        	System.out.println("funny day");
        	break;
        case MONDAY:
        	System.out.println("boring day");
        	break;
        default:
        System.out.println("invalid day");
        
        }
		
	}

}
