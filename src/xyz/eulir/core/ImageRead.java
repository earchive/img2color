package xyz.eulir.core;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageRead {
	public static int[][][] getImagePixel(String image) {
		File file = new File(image);
		BufferedImage bi = null;
		try {
			bi = ImageIO.read(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assert bi != null;
		int width = bi.getWidth();
		int height = bi.getHeight();
		int minx = bi.getMinX();
		int miny = bi.getMinY();
		int[][][] rgb = new int[width][height][3];
		for (int i = minx; i < width; i++) {
			for (int j = miny; j < height; j++) {
				int pixel = bi.getRGB(i, j);
				//System.out.println(pixel);
				rgb[i][j][0] = (pixel & 0xff0000) >> 16;
				rgb[i][j][1] = (pixel & 0xff00) >> 8;
				rgb[i][j][2] = (pixel & 0xff);
			}
		}
		return rgb;
	}

}
