package day08;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Demo4 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com");
		// ShootingStrategy s = ShootingStrategies.viewportPasting(1000)
		AShot shot = new AShot();
		ShootingStrategy s = ShootingStrategies.viewportPasting(1000);
		Screenshot screenshot = shot.shootingStrategy(s).takeScreenshot(driver);

		ImageIO.write(screenshot.getImage(), "png", new File("./image/actimind2.png"));

		driver.quit();

	}

}
