import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.awt.geom.*;


public class Exercise1 extends Applet implements KeyListener, MouseListener {
	private int[] xpoints = {-5, 0, 5};
	private int[] ypoints = {5, -10, 5};

	private Polygon poly;

	int rotation = 0;

	public void init() {
		poly = new Polygon(xpoints, ypoints, xpoints.length);

		addKeyListener(this);
		addMouseListener(this);
//		this.setSize(new Dimension(800,800));
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
//		AffineTransform identity = new AffineTransform();

		int width = getSize().width;
		int height = getSize().height;

		g2d.setColor(Color.BLACK);
		g2d.fillRect(0,0,width,height);
		g2d.setColor(Color.RED);
		g2d.drawString(Integer.toString(width), 0,10);

		g2d.translate(width/2, height/2);
		g2d.scale(10,10);
		g2d.rotate(Math.toRadians(rotation));

		g2d.setColor(Color.RED);
		g2d.fill(poly);
		g2d.setColor(Color.BLUE);
		g2d.draw(poly);
	}

	public void keyReleased(KeyEvent k) { }
    public void keyTyped(KeyEvent k) { }
    public void keyPressed(KeyEvent k) {
        switch (k.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            rotation--;
            if (rotation < 0) rotation = 359;
            repaint();
            break;
        case KeyEvent.VK_RIGHT:
            rotation++;
            if (rotation > 360) rotation = 0;
            repaint();
            break;
        }
    }
	    //handle mouse events
    public void mouseEntered(MouseEvent m) { }
    public void mouseExited(MouseEvent m) { }
    public void mouseReleased(MouseEvent m) { }
    public void mouseClicked(MouseEvent m) { }
    public void mousePressed(MouseEvent m) {
        switch(m.getButton()) {
        case MouseEvent.BUTTON1:
            rotation--;
            if (rotation < 0) rotation = 359;
            repaint();
            break;
        case MouseEvent.BUTTON3:
            rotation++;
            if (rotation > 360) rotation = 0;
            repaint();
            break;
        }
   	}

}