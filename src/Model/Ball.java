package Model;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;





public class Ball extends JPanel implements ActionListener, MouseListener{
	private int x = 1280, y = 657, xVelocity = 20, yVelocity = 20, width = 65, height = 65;
	private Timer timer = new Timer((int) (30), this);
	
	public Ball(){
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paint(g);
		g.fillOval(x, y, width, height);
		this.addMouseListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		x += xVelocity;
		y += yVelocity;
		if(x >= (this.getWidth() - width) || x <= 0){
			xVelocity *= -1;
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
}


