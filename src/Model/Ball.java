package Model;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;





public class Ball extends JPanel implements ActionListener, MouseListener, MouseMotionListener, KeyListener{
	private int x = 1280, y = 657, xVelocity = 20, yVelocity = 20, width = 65, height = 65;
	private Timer timer = new Timer((int) (30), this);
	private boolean right = true;
	public int player1 = 0;
	public int player2 = 0;
	private static final int PAD_1_X = 20;
	private static int pad1y = 20;
	private static final int PAD_2_X=1750;
	private static int pad2y = 20;
	private static final int PAD_WIDTH = 20;
	private static final int PAD_HEIGHT = 200;
	private long lastPressProcessed = 0;
	
	public Ball(){
		
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.fillOval(x, y, width, height);
		this.addMouseListener(this);
		
	}
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
	//setBackground(Color.GRAY);
	}

	
	public void actionPerformed(ActionEvent e){
		if(right == true){
			x += xVelocity;
			y += yVelocity;
		}else if(right == false){
			x -= xVelocity;
			y += yVelocity;
		}
		if(x >= (this.getWidth() - width)){
			player1++;
			timer.stop();
			x = 1280;
			y = 657;
			right = false;
		}
		if(x <= 0){
			player2++;
			timer.stop();
			x = 1280;
			y = 657;
			right = true;
		}
		if(y >= (this.getHeight() - height) || y <= 0){
			yVelocity *= -1;
		}
		this.repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		timer.start();
		this.repaint();
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
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getY()-(PAD_HEIGHT/2)> 0&&e.getY()-(PAD_HEIGHT/2)<620){
		pad1y= e.getY()-(PAD_HEIGHT/2);
		}
		this.repaint();
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		

		  if(System.currentTimeMillis() - lastPressProcessed > 10) {
	            
		if(e.getKeyCode()== KeyEvent.VK_W){
			System.out.println("w pressed");
			if (pad2y>0){
		pad2y-=20;
			}
		
		}
		else if(e.getKeyCode()==KeyEvent.VK_S){
			System.out.println("s pressed");
			
			if(pad2y<620){
			pad2y+=20;
			}
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


