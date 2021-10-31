package com.coderscampus.assign3;

public class UserLoginSensvity {

	static String userUsername;
	static String userPassword;
	static User user = new User();

	public static String getValidation(String usernameFinal) {

		int usernameValidation = userUsername.length();
		int passwordValidation = userPassword.length();
		for (int index = 0; index < usernameValidation; index++) {
			char chusername = userUsername.charAt(index);
			if (Character.isUpperCase(chusername) || Character.isLowerCase(chusername))
				userUsername = user.getUsername();

		}
		return usernameFinal;

	}
}
