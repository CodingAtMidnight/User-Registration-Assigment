package com.neonsense.user_registration;

public class FrontEndUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		UserDatabase userDatabase = new UserDatabase();
		
		User jerry = new User("Jerry", "Miller", 1 , "chillyDog", 20 );
		User mikael = new User("Mikael", "Stefon", 2 , "xxPoweradexX", 21 );
		User brandon = new User("Brandon", "Lomaine", 3 , "bLomaine", 22);
		User terry = new User("Terry", "Somalier", 4 , "somDay21", 23 );
		
		userDatabase.addUser(jerry);
		userDatabase.addUser(mikael);
		userDatabase.addUser(brandon);
		userDatabase.addUser(terry);
		
		userDatabase.viewAllUsers();
	}

}
