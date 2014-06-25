// Author: Jose
/////////////////////

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.applet.*;
import java.util.*;

public class MoveRectangle extends Applet implements KeyListener {
	Rectangle r = new Rectangle(50, 50, 100, 50);

	AffineTransform shift = new AffineTransform();

	public void init() {
		this.setSize(new Dimension(400, 400));
		addKeyListener(this);
	}

	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(Color.BLACK);
		g2D.fillRect(0,0,getSize().width,getSize().height);

		g2D.setColor(Color.RED);
		g2D.setTransform(shift);
		g2D.fill(r);
	}

	public void keyReleased(KeyEvent k) {}
	public void keyTyped(KeyEvent k) {}
	public void keyPressed(KeyEvent k) {
		switch (k.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				shift.translate(-1,0);
				repaint();
				break;
			case KeyEvent.VK_RIGHT:
				shift.translate(1,0);
				repaint();
				break;
			case KeyEvent.VK_UP:
				shift.translate(0,-1);
				repaint();
				break;
			case KeyEvent.VK_DOWN:
				shift.translate(0,1);
				repaint();
				break;
		}
	}



}
