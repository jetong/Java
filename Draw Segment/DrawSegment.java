import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;


public class DrawSegment extends Applet implements MouseListener, MouseMotionListener {
	int x1, y1, x2, y2;

	public void init() {
		this.setSize(new Dimension(500,500));
		setBackground(Color.black);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawLine(x1, y1, x2, y2);
	}

	public void mouseEntered (MouseEvent e) { }
	public void mouseExited (MouseEvent e) { }
	public void mouseClicked (MouseEvent e) { }
	public void mousePressed (MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}

	public void mouseReleased (MouseEvent e) { }
	public void mouseMoved (MouseEvent e) { }
	public void mouseDragged (MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}
}