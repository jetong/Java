//

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;
import java.util.*;
import java.applet.*;

public class stamp extends Applet implements MouseListener, MouseMotionListener {
	private int mX, mY;

	int width, height;
	Image backbuffer;
   	Graphics backg;

	public void init() {
		width = getSize().width;
		height = getSize().height;
	   	backbuffer = createImage( width, height );
	   	backg = backbuffer.getGraphics();
	   	backg.setColor( Color.black );
	 	backg.fillRect( 0, 0, width, height );
	    backg.setColor( Color.red );

		addMouseListener(this);
	    addMouseMotionListener(this);
	    setVisible(true);
	}

	public void mouseMoved(MouseEvent me) {
	    mX = (int) me.getX();
	    mY = (int) me.getY();
	}

	public void mouseDragged(MouseEvent me) {
	    mouseMoved(me);
	    backg.fillRect(mX, mY, 5, 5);
	    repaint();
  	}

  	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawImage( backbuffer, 0, 0, this);
	}

	public void mouseEntered(MouseEvent m) { }
	public void mouseExited(MouseEvent m) { }
	public void mouseReleased(MouseEvent m) { }
	public void mouseClicked(MouseEvent m) { }
	public void mousePressed(MouseEvent m) {
		switch(m.getButton()) {
			case MouseEvent.BUTTON1:
			backg.fillRect(mX, mY, 5, 5);
			repaint();
			break;
		}
	}
}