package com.countline;

import java.util.*;
import java.io.*;

public class LineCount{
	public static void main(String []args) throws IOException {
		Scanner scanner=new Scanner(new File("P:\\Users\\diratan\\Desktop\\Div.txt"));
		int count=0;
		while(scanner.hasNext()){
			count++;
			scanner.nextLine();
		}
		System.out.println(count);
		
	}
}