/**
 @author Mina K. Fahmy
 @date   08/04/2021
 @desc
 
The goal for this assignment will be to mimic a user login from a Java console application.
You will prompt a user for a username and a password, and then use the inputs you receive 
to validate whether or not the username / password combination is valid.
In order to validate this username / password combination, 
you'll need to read this information from a file (called "data.txt") and import the data into your Java application
 */
package com.coderscampus.assign3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UserApplication {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException, NullPointerException {

		User user = new User();
		UserInput input = new UserInput();
		File line = new File();

		String checkUser = "";
		checkUser = line.getFile();

		user.setUsername(checkUser);
		user.setUsername(checkUser);
		user.setUsername(checkUser);

//		user.setUsername("test@email.com_MF");
//		user.setPassword("passwordTest!1_MF");
//		user.setName	("Test User_MF");

		System.out.println("Please enter you username: ");
		input.IsValidInput();

		System.out.println("Please enter you password: ");
		input.IsValidInput();

		while (input.IsValidInput() != user.getUsername() || input.IsValidInput() != user.getPassword()) {

			if (input.IsValidInput().equals(user.getUsername()) && input.IsValidInput().equals(user.getPassword())) {

				System.out.println(user.getUsername());
				System.out.println(user.getPassword());
				System.out.println(user.getName());

			} else {

				user.setUnsucessfulLoginAttempts(1);
				System.out.println("Unvalid login: " + user.getUnsucessfulLoginAttempts());
			}
		}

// [0] = "test@email.com,passwordTest!1,Test User"
// [1] = "another@user.com,asdfasdf,Another User"
// [2] = "john.doe@mydomain.net,Hdk398jf!,John Doe"
// [3] = "jane.doe@myotherdomain.com,sunrise-sunset,Jane Doe"	

	}
}
