package com.wordcount;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
	public static void main(String []args) throws IOException {
		Scanner scanner=new Scanner(new File("P:\\Users\\diratan\\Desktop\\Div.txt"));
		int count=0;
		while(scanner.hasNext()){
			count++;
			scanner.next();
		}
		System.out.println(count);
		
	}
}
