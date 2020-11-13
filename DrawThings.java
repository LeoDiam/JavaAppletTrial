package Lesson13ClassProgrammsDevolopJavaWebsite;

import java.awt.Graphics;
import java.awt.Font;
import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class DrawThings extends JFrame  {
    Font theFont = new Font("TimesRoman",Font.BOLD,24);
    Date theDate;

    JLabel l = new JLabel("Test"); 
    JPanel p = new JPanel();

    public DrawThings () {
	super();
	setSize(400,200);
	setVisible(true);
	setLayout(new FlowLayout());
	l.setFont(theFont);	
	l.setForeground(new Color(255,0,0));
	add(l);	
	
	add(p);

	paint(p.getGraphics());
}
      
  public void paint(Graphics screen) {
        theDate = new Date();
        screen.setFont(theFont);
	screen.setColor(Color.WHITE);
	screen.fillRect(0,0,400,200);
	screen.setColor(Color.BLACK);
        screen.drawString("" + theDate.toString(), 10, 100);
    }


   public static void main(String[] args)
   {
	DrawThings x = new DrawThings();

   }

}
