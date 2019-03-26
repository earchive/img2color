package xyz.eulir.core;

import java.awt.*;

public class Algorithm {
	public static int calculateColor(int[][][] rgb) {
		// Calculate the mean value of each color as the panel standard
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
		Color themeColor = new Color((int) red, (int) green, (int) blue);

		// Test the panel
		int min = Integer.MAX_VALUE;
		final int margin = 10;
		for (int i = red >= margin ? (int) (red - margin) : 0; i < ((red <= 256 - margin) ? (int) (red + margin) : 256); i++) {
			for (int j = green >= margin ? (int) (green - margin) : 0; j < ((green <= 256 - margin) ? (int) (green + margin) : 256); j++) {
				for (int k = blue >= margin ? (int) (blue - margin) : 0; k < ((blue <= 256 - margin) ? (int) (blue + margin) : 256); k++) {
					for (int l = 0; l < rgb.length; l++) {
						for (int m = 0; m < rgb[i].length; m++) {
							int dif = Math.abs(i - rgb[l][m][0]) + Math.abs(j - rgb[l][m][1]) + Math.abs(k - rgb[l][m][2]);
							if (dif < min) {
								min = dif;
								themeColor = new Color(i, j, k);
							}
						}
					}
				}
			}
		}
		return themeColor.getRGB();
	}
}
