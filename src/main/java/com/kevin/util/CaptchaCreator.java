package com.kevin.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

public class CaptchaCreator {

	private static final String RAND_STRING = "abcdefghijkmnpqrstuvwxyz23456789ABCDEFGHJKLMNPQRSTUVWXYZ";// 随机产生的字符串

	private static Random random = new Random();

	private final static int width = 80;// 图片宽
	private final static int height = 26;// 图片高
	private final static int lineSize = 40;// 干扰线数量
	private final static int stringNum = 4;// 随机产生字符数量

	public static void main(String[] args) {
		generate();
	}

	public static void generate() {
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		Graphics g = image.getGraphics();// 产生Image对象的Graphics对象,改对象可以在图像上进行各种绘制操作
		// 绘制矩形
		g.fillRect(0, 0, width, height);
		// 边框
		g.setColor(new Color(0x999999));
		g.drawLine(0, 0, width, 0);
		g.drawLine(0, 0, 0, height);
		g.drawLine(width - 1, 0, width - 1, height - 1);
		g.drawLine(0, height - 1, width - 1, height - 1);
		g.setFont(new Font("Microsoft Yahei", Font.ROMAN_BASELINE, 18));
		g.setColor(getRandColor(110, 133));
		// 绘制干扰线
		for (int i = 0; i <= lineSize; i++) {
			drawBlurLine(g);
		}
		// 绘制随机字符
		String qrString = "";
		for (int i = 1; i <= stringNum; i++) {
			qrString = drawString(g, qrString, i);
		}

		System.out.println(qrString);

		g.dispose();
		try {
			ImageIO.write(image, "JPEG", new FileOutputStream(new File("c://1.jpeg")));// 将内存中的图片通过流动形式输出到客户端
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 绘制字符串
	 */
	private static String drawString(Graphics g, String randomString, int i) {
		g.setFont(getFont());
		g.setColor(new Color(random.nextInt(101), random.nextInt(111), random.nextInt(121)));

		String rand = String.valueOf(getRandomString(random.nextInt(RAND_STRING.length())));
		randomString += rand;

		g.translate(random.nextInt(3), random.nextInt(3));
		g.drawString(rand, 13 * i, 16);
		return randomString;
	}

	/*
	 * 获取随机的字符
	 */
	public static String getRandomString(int num) {
		return String.valueOf(RAND_STRING.charAt(num));
	}

	/*
	 * 绘制干扰线
	 */
	private static void drawBlurLine(Graphics g) {
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(13);
		int yl = random.nextInt(15);
		g.drawLine(x, y, x + xl, y + yl);
	}

	/*
	 * 获得字体
	 */
	private static Font getFont() {
		return new Font("Fixedsys", Font.CENTER_BASELINE, 18);
	}

	/*
	 * 获得颜色
	 */
	private static Color getRandColor(int fc, int bc) {
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc - 16);
		int g = fc + random.nextInt(bc - fc - 14);
		int b = fc + random.nextInt(bc - fc - 18);
		return new Color(r, g, b);
	}

}
