package hsa2;

import java.awt.*;
public class Tutorial2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GraphicsConsole c = new GraphicsConsole(800,800);

		
	// Part 1-  Controlling graphics and animating them
	//Initialize the variables
	int x = 100, y=100;
	int x2 = 0;
	
	while(x<300){
		c.clear();
		c.setColor(Color.RED);
		//Moving Star
		c.fillStar(x, y, 50, 75);
		//Static because we do not modify x2
		c.fillStar(x2, 200, 10, 10);
		Thread.sleep(10);
		// If I wanted to animate on its own horizontally
		x++;
		y++;
	}
	
	//Part 2 - if you want to use graphics.
	Image rocket = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource(
			"rocketship.png"));
	c.drawImage(rocket, 10, 10);
	}

}
