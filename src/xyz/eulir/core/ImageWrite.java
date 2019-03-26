package xyz.eulir.core;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ImageWrite {
	public static void createImage(int xMin, int yMin, int width, int height, int rgb, String fileName) throws IOException {
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics2D graphic = bi.createGraphics();
		graphic.setColor(new Color(0.2f, 0.3f, 0.4f, 0.4f));
		graphic.fillRect(0, 0, width, height);
		for (int i = xMin; i < width; i++) {
			for (int j = yMin; j < height; j++) {
				bi.setRGB(i, j, rgb);
			}
		}
		Iterator<ImageWriter> it = ImageIO.getImageWritersByFormatName("png");
		ImageWriter writer = it.next();
		File f = new File("./imgOutput/" + fileName.substring(0, fileName.indexOf('.')) + "-pure-color.png");
		ImageOutputStream ios = ImageIO.createImageOutputStream(f);
		writer.setOutput(ios);
		writer.write(bi);
		System.out.println("The image " + fileName + " has been successfully transformed into " + fileName.substring(0, fileName.indexOf('.')) + "-pure-color.png");
	}
}
