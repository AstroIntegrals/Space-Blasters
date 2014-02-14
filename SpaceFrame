import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D ;
import java.awt.Graphics ;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JComponent ;
import javax.swing.WindowConstants;


public class SpaceFrame extends JFrame implements ActionListener{
	MyDrawPanel dPnl1;
	Timer tmrBackground = new Timer(50,this);
	Image imgBG;
	File f = new File("PokemonFont.ttf");
	FileInputStream in = new FileInputStream(f);
	Font dFont = Font.createFont(Font.TRUETYPE_FONT, in);
	Font f1 = dFont.deriveFont(40f), f2 = dFont.deriveFont(10f), f3 = dFont.deriveFont(50f);
	int y =0, velY =1;//For Background Scrolling
	int colorChange =0, velColor = 2, red =0, green =0, blue =0;
	
	public static void main(String[] args) throws Exception{
		SpaceFrame spaceFrame = new SpaceFrame();
	}
	
	public SpaceFrame() throws Exception {
		//Math image variable name to imageURL
		imgBG = Images.Background.getImage();
		
		dPnl1 = new MyDrawPanel();
		dPnl1.setLayout(null);
		
		Screen screen = new Screen();
		
		this.add(dPnl1);
		this.addKeyListener(new AL());
		this.setFocusable(true);
		this.setSize(screen.getScreenWidth(), screen.getScreenHeight());
		this.setVisible(true);
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		final JPanel panel = new JPanel();//Create a panel
		//this.add(panel);//Add the panel to the frame
		final JButton startButton = new JButton("Start");
	}
	
	
		public void actionPerformed(ActionEvent event){	
			y = y + velY; 
			if(y==1024){//Its 1024 because the image height is 1024,
				y =0;
			}
			colorChange = colorChange + velColor;
			if(colorChange % 30 >= 20){
				red =255; blue =255; green = 255;
			}
			else if(colorChange % 30 >= 10){
				red =0; blue =255; green = 0;
			}
			else if(colorChange % 30 >= 0){
				red =255; blue =0; green = 0;
			}
			repaint();
		}
        
	
	class MyDrawPanel extends JPanel{
		
			public void paintComponent(Graphics g){
				g.setFont(f3);
				g.drawImage(imgBG,-400,y-400,this);
				g.drawImage(imgBG,-400,y-1424,this);
				ArrayList<Color> list = new ArrayList<Color>() ;
				g.setColor(new Color(red,green,blue));
				g.drawString("Space Blasters " + y + " " + colorChange, 180,100);
				tmrBackground.start();
			}
	}
	public class AL extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
	
		}
	}
	
//	public static void main(String[] args) {
//		JFrame frame = new JFrame("Space Blasters");
//		frame.setSize(625,625);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
//		frame.setVisible(true);
//		
//		final SpaceMainMenu comp  = new SpaceMainMenu();
//		JPanel panel = new JPanel();//Create a panel
//		frame.add(panel,BorderLayout.NORTH);//Add the panel to the frame
//		
//		JButton startButton = new JButton("Start");//Create a start button
//		panel.add(startButton);//Add button to panel
//		JButton controlButton = new JButton("Controls");//Create a controls button
//		panel.add(controlButton);
//		JButton highScoresButton = new JButton("HighScores");//Create a HighScores button
//		panel.add(highScoresButton);
//		
//		class StartButtonListener implements ActionListener{
//			public void actionPerformed(ActionEvent event){
//				
//			}
//		}
//		ActionListener startButtonListener = new StartButtonListener();//Create StartButtonListener object
//		startButton.addActionListener(startButtonListener);//Attach button listener to startButton
//		
//		class ControlButtonListener implements ActionListener{
//			public void actionPerformed(ActionEvent event){
//				
//			}
//		}
//		ActionListener controlButtonListener = new ControlButtonListener();//Create ControlButtonListener object
//		controlButton.addActionListener(controlButtonListener);//Attach button listener to controlButton
//		
//		class HighScoresButtonListener implements ActionListener{
//			public void actionPerformed(ActionEvent event){
//				
//			}
//		}
//		ActionListener highScoresButtonListener = new HighScoresButtonListener();//Create HighScoresButtonListener object
//		highScoresButton.addActionListener(highScoresButtonListener);//Attach button listener to highScoresButton
//		
//		
//		
//	      
//	      tmrBackground.start();
//	    
//	}
//	
//	public void paintComponent(Graphics g){
//		Graphics2D g2 = (Graphics2D)g;
//	}
	

}
