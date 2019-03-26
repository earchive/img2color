package xyz.eulir;

import xyz.eulir.core.Algorithm;
import xyz.eulir.core.ImageRead;
import xyz.eulir.core.ImageWrite;

import java.io.IOException;

public class Image {
	private int width;
	private int height;
	private String fileName;
	private int[][][] rgb;

	public Image(String fileName) {
		this.fileName = fileName;
		rgb = ImageRead.getImagePixel("./imgInput/" + fileName);
		width = rgb.length;
		height = rgb[0].length;
	}

	public void create() throws IOException {
		ImageWrite.createImage(0, 0, width, height, Algorithm.calculateColor(rgb), fileName);
	}
}
