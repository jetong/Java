//

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotionEventDemo extends JPanel implements MouseMotionListener {
  private int mX, mY;

// constructor
  public MouseMotionEventDemo() {
    addMouseMotionListener(this);
  }

// detect mouse movement and track coordinates
  public void mouseMoved(MouseEvent me) {
    mX = (int) me.getPoint().getX();
    mY = (int) me.getPoint().getY();
    repaint();
  }

  public void mouseDragged(MouseEvent me) {
    mouseMoved(me);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.fillRect(mX, mY, 5, 5);
  }

  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.getContentPane().add(new MouseMotionEventDemo());
    f.setSize(400, 400);
    f.show();
  }

}