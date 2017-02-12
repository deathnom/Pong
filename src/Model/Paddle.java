package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Paddle extends JPanel implements MouseMotionListener, MouseListener{
	private static final int PAD_1_X = 50;
	   private static  int pad1y=20;
	   private static final int PAD_2_X=1750;
	   private static  int pad2y=20;
	   private static final int PAD_WIDTH = 20;
	   private static final int PAD_HEIGHT = 300;
	   
	   public Paddle(){
		  
	   }
	   @Override
	public void paint(Graphics g) {
	      super.paint(g);
	      // draw the rectangle here
	      g.setColor(Color.WHITE);
	      g.fillRect(PAD_1_X, pad1y, PAD_WIDTH, PAD_HEIGHT);
	       g.fillRect(PAD_2_X, pad2y, PAD_WIDTH, PAD_HEIGHT);
	      
	   }
	   
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		pad1y= e.getY();
		this.repaint();
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
