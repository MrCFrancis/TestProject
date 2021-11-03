package hsa2;

import java.awt.*;
public class Tutorial3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GraphicsConsole c = new GraphicsConsole(800,800);

		
	//Initialize the variables
	int x = 100, y=100;
	int x2 = 0;
	
	// Part 1-  Controlling graphics with key down command

	while(x2<490){
		c.clear();
		c.setColor(Color.RED);
		c.fillStar(x, y, 50, 75);
		c.fillStar(x2, 200, 10, 10);
		// Change the following to 13 or 14 to reduce flicker
		Thread.sleep(14);
	// If I wanted to animate on its own, comment or uncomment the following line
	x++;
	
	 if(c.isKeyDown('A')){
		 x=x-10;
	 }
	 else if (c.isKeyDown('D')){
		 x=x+10;
	 }
	 
	 x2++;
	 if (x2 >500)
		 x2=0;
	}
	
	// Part 2 - No flicker movement.
	char input;
	while(true){
		c.clear();
		c.setColor(Color.RED);
		c.fillStar(x, y, 50, 75);
		
		//For game controls use the items in library
		input=c.getChar();	
		if (input =='w'){
			y=y+10;
		}
		else if (input =='a'){
			x=x-10;
		}
		else if (input =='d'){
			x=x+10;
		}
		else if (input =='s'){
			y=y-10;
		}
		else{
	
		}
	}

	}

}

