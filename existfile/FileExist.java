package com.existfile;

import java.util.Scanner;
import java.io.File;

public class FileExist {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file of path");
		String path=scanner.next();
		File file=new File(path);
		if (file.exists()) {
			System.out.println("file exists, and it is a file");
		}
	}
}