package com.josh.java.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
	public static void main(String[] args) {
		Path temp;
		try {
			// move method is used to pass the existing file content to another file
			temp = Files.move(Paths.get("C:\\Users\\Admin\\eclipse-workspace\\Java\\FileHandlingExmple.txt"), Paths.get("C:\\Users\\Admin\\eclipse-workspace\\Java\\CopyText.txt"));
			if (temp != null) {
				System.out.println("File renamed and moved successfully");
			} else {
				System.out.println("Failed to move the file");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
