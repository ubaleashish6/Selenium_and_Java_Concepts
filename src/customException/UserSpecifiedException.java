package customException;

public class UserSpecifiedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCustomException(18);

	}
	
	static void getCustomException(int age) {
		try {
			if(age<18) {
				throw new CustomException1("Not Valid");
			}
			else {
				System.out.println("Eligible for voting");
			}
		
		}
		catch(Exception m) {
			System.out.println("Error thown " +m);
		}
	}

}
