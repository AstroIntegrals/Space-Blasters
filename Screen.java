import java.awt.*;

public class Screen {
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension dim;
	
	public Screen()
	{
		dim = toolkit.getScreenSize();
	}
	
	//Width
	public int getScreenHeight()
	{
		int y = (int)(dim.height / 1.5);
		return y;
	}
	
	//Height
	public int getScreenWidth()
	{
		int x = (int)(dim.width/2.55);
		return x;
	}
}

