/**
 ou should create a User POJO that will store the information that will be read from the file.

The User POJO should contain three properties:

  1. username
  2. password
  3. name

The file information should be stored in your Java application as an Array of User objects.

Once this data is appropriately stored in your Java application, you can begin the process of prompting for username and password. 
 */
package com.coderscampus.assign3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mina K. Fahmy
 *
 */
public class User {
	private String username;
	private String password;
	private String name;
	private int unsucessfulLoginAttempts;

	/**
	 * @return the unsucessfulLogin Attempts
	 */

	/**
	 * @return the username
	 */
	public String getUsername() {

		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getUnsucessfulLoginAttempts() {
		return unsucessfulLoginAttempts;
	}

	/**
	 * @param unsucessfulLoginAttempts the unsucessfulLoginAttempts to set
	 */
	public void setUnsucessfulLoginAttempts(int unsucessfulLoginAttempts) {
		this.unsucessfulLoginAttempts = unsucessfulLoginAttempts;
	}

//	UserService userService = new UserService();
//	User[] users = new User[4];
//	for (int i=0; i < 4 ; i++) {
//		users[i] = userService.createUser("user" + (i + 1), "password" + (i + 1), "name" + (i+1));
//	}
//	System.out.println(users);

	
}
