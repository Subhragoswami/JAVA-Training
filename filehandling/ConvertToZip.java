package com.josh.java.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ConvertToZip {
	public static void main(String[] args) {

		String file = "FileHandling\\FileHandlingExmple.txt";
		String gzipFile = "FileHandling\\FileHandlingExmple.gz";
		String newFile = "FileHandling\\FileHandlingExmple.txt";
		// Converting text file to compressed gzip file
		compressGzipFile(file, gzipFile);
		// Converting gzip file to normal text file again
		decompressGzipFile(gzipFile, newFile);

	}

	/*
	 * This method is used to decompress the GZIP file to normal text file
	 */
	private static void decompressGzipFile(String gzipFile, String newFile) {
		FileInputStream fis = null;
		GZIPInputStream gis = null;
		FileOutputStream fos = null;
		try {

			fis = new FileInputStream(gzipFile);
			gis = new GZIPInputStream(fis);
			fos = new FileOutputStream(newFile);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = gis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// closing resources
			try {
				fos.close();
				gis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	/*
	 * This method is used to compress the normal text file to compressed GZIP file
	 * here
	 */
	private static void compressGzipFile(String file, String gzipFile) {
		GZIPOutputStream gzipOS = null;
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(gzipFile);
			gzipOS = new GZIPOutputStream(fos);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = fis.read(buffer)) > 0) {
				gzipOS.write(buffer, 0, len);
			}

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			// close resources
			try {
				gzipOS.close();
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}


