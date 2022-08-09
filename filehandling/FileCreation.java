package com.josh.java.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileCreation {
	public static void main(String[] args) {
		File myFile = new File("FileHandlingExmple.txt");
		try {
			// Creating a file
			myFile.createNewFile();
			System.out.println("File created successfully.");
			// Writing to a file
			FileWriter fileWriter = new FileWriter("FileHandlingExmple.txt");
			fileWriter.write("In this tutorial we will see how to create a file in Java using createNewFile() method.");
			fileWriter.close();
			// Reading a file
			Scanner scanner = new Scanner(myFile);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
			String fileName = "FileHandlingExmple.txt";
			String text = "Hello world";
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));

			// Writing on output stream
			out.write(text);
			// Closing the connection
			out.close();
			
			// deleting a file-----
			/*
			 * if (myFile.delete()) { System.out.println("I have deleted: " +
			 * myFile.getName()); } else {
			 * System.out.println("Some problem occurred while deleting the file"); }
			 */
			// Specifying the file name and path
			File file = new File("FileHandlingExmple.txt");
			SimpleDateFormat lmf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("Last modified date :" + lmf.format(file.lastModified()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
