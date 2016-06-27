package com.acn.mjn.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FileUtil {
	public static String currentWorkDir = System.getProperty("user.dir")+"\\";
	
	public static String leftPad(String str, int length, char ch) {
		if(str.length() >= length) {
			return str;
		}
		
		System.out.println("First Change");
		System.out.println("Second Change");
		System.out.println("Third Change");
		System.out.println("Forth Change");
		char[] chs = new char[length];
		Arrays.fill(chs, ch);
		char[] src = str.toCharArray();
		return null;
	}
	
	public List<String> splitBySize(String fileName,int byteSize) {
		List<String> parts = new ArrayList<String>();
		File file = new File(fileName);
		//int count = (int)Math.ceil(file.length() / (double));
		//int countLen = (count+"").length();
		return null;
	}
}
