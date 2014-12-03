package com.kevin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		File in = new File("d:\\Personal Data\\桌面\\MongoDB.java");
		BufferedReader br = new BufferedReader(new FileReader(in));
		String line = "";
		StringBuffer outString = new StringBuffer();
		while ((line = br.readLine()) != null) {
			outString.append(line).append("\n");
		}
		br.close();
		File out = new File("d:\\Personal Data\\桌面\\out.java");
		if (!out.exists()) {
			out.createNewFile();
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(out));
		bw.write(outString.toString());
		bw.close();
	}
}
