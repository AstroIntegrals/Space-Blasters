import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Method to import Images.
 * 
 * @param needs
 *            to be in the Pictures folder at least for the image to be imported
 *            must be an operation that has registered itself with the object
 * @return imported Images that are imported
 */
public enum Images implements ImgPathConstants {

	Background(MENU_PATH + "/Background.png"),Background2(MENU_PATH + "/Background2.png");
	
	private String filePath;
	private Image image;
	private boolean imageLoaded;

	private Images(String imagePath) {
		filePath = imagePath;
		imageLoaded = false;

	}

	public Image getImage() {
		if (!imageLoaded) {
			loadImage();
		}
		return image;

	}

	public void loadImage() {
		try {
			image = ImageIO.read(new File(filePath));
		} catch (IOException e) {
			System.err.println("Failed to load image!");
			e.printStackTrace();
		}
		imageLoaded = true;
	}
}
