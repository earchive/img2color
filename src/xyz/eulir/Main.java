package xyz.eulir;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		for (int i = 1; i < 10; i++) {
			Image a = new Image(i + ".jpg");
			a.create();
		}
	}
}
