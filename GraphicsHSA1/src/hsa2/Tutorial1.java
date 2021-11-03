package hsa2;
import java.awt.*;

public class Tutorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsConsole c = new GraphicsConsole(800, 800);
		
		//Sets the background colour to whatever you want.
		c.setBackgroundColor(Color.RED);
		//Clears the screen - but it refreshes the screen thus making it the colour.
		c.clear();
		c.println("Hello World");
	}

}
