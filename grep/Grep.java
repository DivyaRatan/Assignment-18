package com.grep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Grep {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file path");
		String infile=scanner.nextLine();
		File file=new File(infile);
		System.out.println("Enter the string you want to search");
		String string=scanner.nextLine();
	    int linecount=0;
	    int flag=0;
	    BufferedReader br=new BufferedReader(new FileReader(infile));
	    String line;
	    while((line=br.readLine())!=null) {
	    	linecount++;
	    	if(line.contains(string)) {
	    		flag=1;
	    		System.out.println("Line number " +linecount+ " Line: " +line);
	    	}
	    }
	    if(flag!=1)
	    	System.out.println("the string is not present in file");
	}

}
