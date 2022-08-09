package com.josh.java.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ConvertToZip {
	public static void main(String[] args) {

		String file = "C:\\Users\\Admin\\eclipse-workspace\\Java\\FileHandlingExmple.txt";
		String gzipFile = "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Java\\\\FileHandlingExmple.gz";
		String newFile = "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Java\\\\FileHandlingExmple.txt";
		// Converting text file to compressed gzip file
		compressGzipFile(file, gzipFile);
		// Converting gzip file to normal text file again
		decompressGzipFile(gzipFile, newFile);

	}

	/*
	 * This method is used to decompress the GZIP file to normal text file
	 */
	private static void decompressGzipFile(String gzipFile, String newFile) {
		try {

			FileInputStream fis = new FileInputStream(gzipFile);
			GZIPInputStream gis = new GZIPInputStream(fis);
			FileOutputStream fos = new FileOutputStream(newFile);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = gis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}
			// closing resources
			fos.close();
			gis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * This method is used to compress the normal text file to compressed GZIP file
	 * here
	 */
	private static void compressGzipFile(String file, String gzipFile) {
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(gzipFile);
			GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) > 0) {
				gzipOS.write(buffer, 0, len);
			}
			// close resources
			gzipOS.close();
			fos.close();
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
