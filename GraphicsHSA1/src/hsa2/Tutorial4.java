package hsa2;

import java.awt.*;

public class Tutorial4 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GraphicsConsole c = new GraphicsConsole(800,800);

		
	//Initialize the variables
	int x = 100, y=100;
	int x2 = 0;
	
	// If you want to use the mouse wheel
	c.enableMouseWheel();
	while(true){
		c.clear();
		c.setColor(Color.RED);
		c.fillStar(x, y, 50, 75);
		
		//Event oriented language- action listener - mouse motion
		//This will allow you to pick up on clicks.

		if(c.getMouseWheelRotation()!=0)
			y += c.getMouseWheelUnitsToScroll() * 5;

		//For game controls use the items in library

	}

	}

}