package com.kevin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class IODemo {

	public static void main(String[] args) throws Exception {

		/*字符流 读取文件*/
		BufferedReader br = new BufferedReader(new FileReader(new File("d:\\Personal Data\\桌面\\game\\AES.js")));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

		/*字节流 读取文件*/
		InputStreamReader isr = new InputStreamReader(new FileInputStream(new File(
				"d:\\Personal Data\\桌面\\game\\AES.js")));
		int val;
		while ((val = isr.read()) != -1) {
			System.out.print((char) val);
		}
		isr.close();

		/*字符流 写文件*/
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:\\Personal Data\\桌面\\1.txt")));
		for (int i = 0; i < 100; i++) {
			bw.write((char) (new Random().nextInt(20901) + 19968));
		}
		bw.close();

		/*字节流 写文件*/
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("d:\\Personal Data\\桌面\\2.txt")));
		for (int i = 0; i < 100; i++) {
			osw.write((char) (new Random().nextInt(20901) + 19968));
		}
		osw.close();

	}
}
