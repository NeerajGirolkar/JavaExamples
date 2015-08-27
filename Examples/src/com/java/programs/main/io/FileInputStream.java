package com.java.programs.main.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream {
	public static void main(String[] args){
		int content;
		InputStream inputStream = null;
		File file = new File("resources\\quote.txt");
		try{
			inputStream = new java.io.FileInputStream(file);
			while((content = inputStream.read()) != -1){
				System.out.println(content);
				System.out.println((char)content);
			}
		} catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(inputStream != null){
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
