package com.josh.java.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileCreation {
	public static void main(String[] args) {
		File myFile = new File("FileHandling\\FileHandlingExmple.txt");
		FileWriter fileWriter = null;
		Scanner scanner = null;
		BufferedWriter out = null;
		try {
			// Creating a file
			myFile.createNewFile();
			System.out.println("File created successfully.");
			// Writing to a file
			fileWriter = new FileWriter("FileHandling\\FileHandlingExmple.txt");
			fileWriter.write("In this tutorial we will see how to create a file in Java using createNewFile() method.");

			// Reading a file
			scanner = new Scanner(myFile);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}

			String fileName = "FileHandling\\FileHandlingExmple.txt";
			String text = "Hello world";
			out = new BufferedWriter(new FileWriter(fileName, true));

			// Writing on output stream
			out.write(text);

			// deleting a file-----
			/*
			 * if (myFile.delete()) { System.out.println("I have deleted: " +
			 * myFile.getName()); } else {
			 * System.out.println("Some problem occurred while deleting the file"); }
			 */
			// Specifying the file name and path
			File file = new File("FileHandling\\FileHandlingExmple.txt");
			SimpleDateFormat lmf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("Last modified date :" + lmf.format(file.lastModified()));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
				out.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			scanner.close();
		}
	}
}
