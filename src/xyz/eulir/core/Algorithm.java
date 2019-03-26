package xyz.eulir.core;

import java.awt.*;

public class Algorithm {
	public static int calculateColor(int[][][] rgb) {
		long red = 0;
		long green = 0;
		long blue = 0;
		for (int i = 0; i < rgb.length; i++) {
			for (int j = 0; j < rgb[i].length; j++) {
				red += rgb[i][j][0];
				green += rgb[i][j][1];
				blue += rgb[i][j][2];
			}
		}
		long totalPixel = rgb.length * rgb[0].length;
		red /= totalPixel;
		green /= totalPixel;
		blue /= totalPixel;
		return new Color((int) red, (int) green, (int) blue).getRGB();
	}
}
