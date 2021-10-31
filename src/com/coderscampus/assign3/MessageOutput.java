package com.coderscampus.assign3;

public class MessageOutput {

	private static String[] OutputMessage = new String[10];

	static void InvalidLoginMessage(int invalidloginmesssageid) {
		User user = new User();
		OutputMessage[0] = "Invalid login, please try again";
		if (invalidloginmesssageid == 0) {
			System.out.println(OutputMessage[0]);
			int invalidLogin = 0;
			invalidLogin = invalidLogin + 1;
			user.setUnsucessfulLoginAttempts(1);
		}
	}

	static void ValidLoginMessage(int validloginmesssageid, String userName) {

		OutputMessage[1] = "Welcome: ";
		if (validloginmesssageid == 1) {
			System.out.println(OutputMessage[1] + userName);
		}
	}

	static void LockOutMessage(int lockoutloginmesssageid) {
		OutputMessage[2] = "Too many failed login attempts, you are now locked out";
		if (lockoutloginmesssageid == 2) {
			System.out.println(OutputMessage[2]);
		}
	}

	static void ArrayIndexExceptionMessage(int arrayindexexceptionmesssageid) {
		OutputMessage[3] = "Ops, it is beyond the file you are trying to reach.";
		if (arrayindexexceptionmesssageid == 3) {
			System.out.println(OutputMessage[3]);

		}

	}

	static void IOExceptionMessage(int ioexceptionmesssageid) {
		OutputMessage[4] = "Ops, It coudln't find the file.";
		if (ioexceptionmesssageid == 4) {
			MessageOutput.LockOutMessage(4);

		}
	}

	static void NullPointerExceptionMessage(int nullpointerexceptionmesssageid) {
		OutputMessage[5] = "Ops, I can find an empty pointer.";
		if (nullpointerexceptionmesssageid == 5) {
			MessageOutput.LockOutMessage(5);

		}
	}
}
