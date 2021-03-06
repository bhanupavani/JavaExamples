package com.java.examples.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReading {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(
					"c:\\temp\\sample.txt"));
			String line = null;

			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, "|");
				while(tokenizer.hasMoreTokens()){
					String element = (String)tokenizer.nextElement();
					System.out.println(element);
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found in the given location");
		} catch (IOException e) {
			System.out.println("Error while reading the file");
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}

		System.out.println("File reading completed.");
	}

}
