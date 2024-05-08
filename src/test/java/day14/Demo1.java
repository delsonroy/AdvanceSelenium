package day14;

import java.awt.AWTException;
import java.awt.Robot;

public class Demo1 {

	public static void main(String[] args) throws Exception {

		Robot r = new Robot();
		int x = 100;
		for (int i = 1; i <= 20; i++) {
			r.mouseMove(x, 100);
			x = x + 50;
			Thread.sleep(500);
		}
	}
}
