package test;

import beans.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello");
			User user=new User("test@test.com","123234234   456");
			if(user.validate())
				System.out.println("Bean Validated");
			else
				System.out.println(user.getMessage());
	}

}
