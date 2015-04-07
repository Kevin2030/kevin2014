package com.kevin.util;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ScreenShotUtil {

	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage image = robot.createScreenCapture(new Rectangle(dimension.width, dimension.height));
		ImageIO.write(image, "png", new File("C:/imageTest.png"));
	}

}
