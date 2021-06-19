package screenshot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class ScreenShot {

	public static void main(String[] args) {
		int count = 1;
		while (true) {
			try {
				// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				//screen corner points
				Rectangle screenRectangle = new Rectangle(290, 70, 650, 550);
				Robot robot = new Robot();
				BufferedImage image = robot.createScreenCapture(screenRectangle);
				// screenchost save img
				ImageIO.write(image, "png", new File("C:/screenshots/redAppleB_" + count + ".png"));
				System.out.println("saved.." + "C:/screenshots/apple_" + count + ".png");

			} catch (Exception e) {
				System.out.println("Hata : " + e.getMessage());
			}
			count++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}