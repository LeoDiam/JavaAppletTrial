package Lesson13ClassProgrammsDevolopJavaWebsite;

import java.awt.Graphics;
import java.awt.Font;
import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class DigitalClockPanel extends JFrame implements Runnable {
    Font theFont = new Font("TimesRoman",Font.BOLD,24);
    Date theDate;
    Thread runner;

    JPanel p = new JPanel();

    public DigitalClockPanel() {
	super();
	setSize(400,200);
	setVisible(true);
	setLayout(new FlowLayout());	
	add(p);

	paint(p.getGraphics());
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }    }

    public void run() {
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
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
	DigitalClockPanel x = new DigitalClockPanel();

   }

}



