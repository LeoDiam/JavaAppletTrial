package Lesson13ClassProgrammsDevolopJavaWebsite;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet
{
	String s;

	public void init()
	{
		s = "Hello";
		Draw x = new Draw();
	}

	public void start()
	{ 
		// runs after init;
	}

	public void paint(Graphics g)
	{
		g.drawString(s, 10, 20);
	}

	public void stop()
	{ 
		// runs before the applet finishes it execution;
	}

}
