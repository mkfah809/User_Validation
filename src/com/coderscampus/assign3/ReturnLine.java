package com.coderscampus.assign3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReturnLine {
	private static String userUsername = "";
	private static String userpassword = "";
	private static String[] userinfoArray;
	private static String line = null;
	private static String welcomeUser = "";
	private static int count = 0;
	public static int invalidLogin = 0;
	static User[] users = new User[4]; // parent-each user
	private static boolean userFound = false;

	public static String getLine() {

		getuserreadInfo();
		do {
			getpromptUser();
			getUserLogin();
			getValidation();

		} while (invalidLogin <= 4);

		return line;

	}

//	prompt user
	private static void getpromptUser() {

//		5 loging attempts.
		System.out.println("Enter your Username here: ");
		userUsername = UserInput.userInput();
		System.out.println("Enter your Password here: ");
		userpassword = UserInput.userInput();
	}

//	read the file 
	private static void getuserreadInfo() {

		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
				User user = new User();
				userinfoArray = line.split(",");
				user.setUsername(userinfoArray[0]);
				user.setPassword(userinfoArray[1]);
				user.setName(userinfoArray[2]);
				users[count] = user;
				count++;
				if (count == 4) {
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			MessageOutput.ArrayIndexExceptionMessage(3);
			e.printStackTrace();
		} catch (IOException e) {
			MessageOutput.IOExceptionMessage(4);
			e.printStackTrace();
		} catch (NullPointerException e) {
			MessageOutput.NullPointerExceptionMessage(5);
			e.printStackTrace();
		} finally {
			// fileReader.close();
		}
	}

	private static void getValidation() {
		if (invalidLogin == 4 && userFound == false) {
			MessageOutput.LockOutMessage(2);
			System.exit(0);

		}
		if (userFound == false) {

			invalidLogin++;
			MessageOutput.InvalidLoginMessage(0);
		} else if (userFound == true) {
			MessageOutput.ValidLoginMessage(1, welcomeUser);
			System.exit(0);
		}

	}

	private static void getUserLogin() {

		for (User user : users) {

			// User Sensivity
			boolean validSensvitiy = userUsername.equalsIgnoreCase(user.getUsername());
			if (validSensvitiy == false) {
			} else {
				userUsername = user.getUsername();
			}
//				username / password validation.
			if (userUsername.equals(user.getUsername()) && userpassword.equals(user.getPassword())) {
				userFound = true;
				welcomeUser = user.getName();
			}

		}
	}
}
