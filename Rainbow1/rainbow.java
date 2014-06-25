/////////////////////////ldl/

import java.applet.*;
import java.awt.*;
import java.lang.*;

public class rainbow extends Applet {
	void slep() {     //for delay
    	try {
    		Thread.sleep(1000);
    	} catch(InterruptedException ex) {
      		Thread.currentThread().interrupt();
    	}
 	}

 	public void init() {}

 	public void paint(Graphics g) {
		int x,y,z;
  		x=0;y=50;z=100;
		for(int i=0;i<7;i++) {
		   Color c1=new Color(z,x,y);
		   x=(x+50)%255;
		   y=(y+70)%255;
		   z=(z+100)%255;
		   g.setColor(c1);
		   g.fillArc(100+(i*20),100+(i*20),300-(i*40),300-(i*40),0,180);
		   slep();
		   }
	}
}
