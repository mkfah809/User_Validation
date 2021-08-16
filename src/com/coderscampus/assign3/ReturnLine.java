package com.coderscampus.assign3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReturnLine {
	private static String userUsername = "";
	private static String userpassword = "";
	
	public static String getLine() {

		String[] userinfoArray;
		String line = null;

		User[] users = new User[4]; // parent-each user
		int count = 0;
		
		int invalidLogin = 0;

		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));

//			read the file 
			while ((line = fileReader.readLine()) != null) {

				System.out.println(line);

				User user = new User();
				userinfoArray = line.split(",");
				user.setUsername(userinfoArray[0]);
				user.setPassword(userinfoArray[1]);
				user.setName(userinfoArray[2]);
				
				
				users[count] = user;
				count++;
				
				if (count == 4) 
				{break;}
			}
			
			
			promptUser();
			 String welcomeUser = "";
			boolean userFound = false;
			while (invalidLogin < 4) {
				for(User user : users) {
//					username / password validation.
					if (userUsername.equals(user.getUsername()) && userpassword.equals(user.getPassword())) {	
						userFound = true;
						welcomeUser = user.getName();
						
					}
				} 
				
				
				int usernameValidation = userUsername.length();
				
				
				if (userFound == false) {
					invalidLogin++;
					MessageOutput.InvalidLoginMessage(0);
					promptUser();
				}
				else if(userFound == true) {
					MessageOutput.ValidLoginMessage(1, welcomeUser);
					System.exit(0);
				}
			}
			
			MessageOutput.LockOutMessage(2);
			fileReader.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			MessageOutput.ArrayIndexExceptionMessage(3);
			e.printStackTrace();
		} catch (IOException e) {
			MessageOutput.IOExceptionMessage(4);
			e.printStackTrace();
		} catch (NullPointerException e) {
			MessageOutput.NullPointerExceptionMessage(5);
			e.printStackTrace();
		}
	
		return line;


	}
	
	private static void promptUser() {

//		5 loging attempts.
		System.out.println("Enter your Username here: ");
		userUsername = UserInput.userInput();
		System.out.println("Enter your Password here: ");
		userpassword = UserInput.userInput();
	}
	
	private static void userValidation() {
		
	}
}
