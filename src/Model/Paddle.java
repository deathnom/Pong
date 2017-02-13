package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Paddle extends JPanel implements MouseMotionListener,KeyListener, MouseListener{
	private static final int PAD_1_X = 20;
	private static int pad1y = 20;
	private static final int PAD_2_X=1750;
	private static int pad2y = 20;
	private static final int PAD_WIDTH = 20;
	private static final int PAD_HEIGHT = 300;
	private long lastPressProcessed = 0;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// draw the rectangle here
		g.fillRect(PAD_1_X, pad1y, PAD_WIDTH, PAD_HEIGHT);
		g.fillRect(PAD_2_X, pad2y, PAD_WIDTH, PAD_HEIGHT);
		this.setFocusable(true);
		this.addMouseMotionListener(this);
		this.requestFocus(true);
		this.addKeyListener(this);
		setBackground(Color.GRAY);
		
	}

	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		pad1y= e.getY()-(PAD_HEIGHT/2);
		this.repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
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


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		  if(System.currentTimeMillis() - lastPressProcessed > 100) {
	            //Do your work here...
	            
		if(e.getKeyCode()== KeyEvent.VK_W){
			System.out.println("w pressed");
		pad2y-=20;
		
		}
		else if(e.getKeyCode()==KeyEvent.VK_S){
			System.out.println("s pressed");
			pad2y+=20;
			
		}
		this.repaint();
		lastPressProcessed = System.currentTimeMillis();
		  }
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		this.repaint();
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}