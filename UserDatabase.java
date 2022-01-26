package com.neonsense.user_registration;

import java.util.ArrayList;

public class UserDatabase {
	
		ArrayList<User> userDatabase = new ArrayList<>();
		
		
		// Create Method
		public void addUser(User user) {
			userDatabase.add(user);
			System.out.println(user.getFirstName() + " " + user.getLastName() + " was added successfully!");
		}
		
		// Read Method
		public void viewAllUsers() {
			for (User user : userDatabase) {
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				System.out.println("First Name - " + user.getFirstName());
				System.out.println("Last Name - " + user.getLastName());
				System.out.println("Phone Number - " + user.getPhoneNumber());
				System.out.println("Username - " + user.getUserName());
				System.out.println("User Age - " + user.getUserAge());
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			}
		}
		
		// Update Method
		// TODO
		
		
		// Delete Method
		public void deleteUser(User user) {
			
			if (userDatabase.contains(user)) {
				userDatabase.remove(user);
				System.out.println(user.getFirstName() + " " + user.getLastName() + " was removed successfully!");
			} else {
				System.out.println("User not in database! Please enter a valid user.");
			}
			
		}
}
