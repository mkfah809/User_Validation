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
 */
public class File {
	
	public String getFile() {

		BufferedReader fileReader = null;
		String line = "";
		@SuppressWarnings("unused")
		String[] userinfoArray = line.split(",");

		try {

			fileReader = new BufferedReader(new FileReader("data.txt"));

			while ((line = fileReader.readLine()) != null) {
				userinfoArray = line.split(",");
				System.out.println(line);

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

}
