/**
 * 
 */
package com.coderscampus.assign3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mina K. Fahmy
 *

public class File {

	public String getFile() {

		User user = new User();

		BufferedReader fileReader = null;
		String line = "";
		@SuppressWarnings("unused")
		UserInput input = new UserInput();

		try {

			fileReader = new BufferedReader(new FileReader("data.txt"));

//break line
			while ((line = fileReader.readLine()) != null) {
				String[] userinfoArray = line.split(",");
				userinfoArray = line.split(",");

				// break comma
				for (String OneRawSplit : userinfoArray) {
					
					System.out.println(OneRawSplit);
					String[] numbersArray = OneRawSplit.split(",");
					
				    OneRawSplit.split(",");
					user.setUsername(OneRawSplit);
					System.out.println("Username is: " + user.getUsername() );
					user.setPassword(OneRawSplit);
					 OneRawSplit.split(",");
					System.out.println("Password is: " + user.getPassword());
					user.setName(OneRawSplit);
					 OneRawSplit.split(",");
					System.out.println("Name is: " + user.getName());

					for (int i = 1; i == 5; i++) {
						System.out.println("Enter your username: " + input.IsValidInput());
						System.out.println("Enter your password: " + input.IsValidInput());
						if (input.IsValidInput().equals(user.getUsername())
								&& input.IsValidInput().equals(user.getPassword())) {
							System.out.println("Welcome " + user.getName() + " to the Heeky-Beeky Company!");
							break;
						} else {
							System.out.println("Invalid login, please try again\r\n" + "\r\n" + "");
							user.setUnsucessfulLoginAttempts(1);
							i++;
						}
					}
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Oop, the file wasn't found");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Oop, it can't be empty");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oop, there is an I/O exceptions");
			e.printStackTrace();
		}

		return line;
	}

} */
