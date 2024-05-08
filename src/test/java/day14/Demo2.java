package day14;

import java.awt.Robot;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		Robot r = new Robot();
		for (int i = 1; i <= 50; i++) {
			r.mouseMove(10, 50);
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}
