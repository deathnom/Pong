package Model;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Paddle extends JPanel {
	private static final int PAD_1_X = 20;
	   private static final int PAD_1_Y = PAD_1_X;
	   private static final int PAD_WIDTH = 10;
	   private static final int PAD_HEIGHT = 100;

	   @Override
	   protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      // draw the rectangle here
	      g.drawRect(PAD_1_X, PAD_1_Y, PAD_WIDTH, PAD_HEIGHT);
	   }

	  

	
<<<<<<< HEAD
	public paddle
}
=======

	 
	      
	}
	
	
	

>>>>>>> 0ee93fd3d7143c57c49db6ecedabba3d32b0465c
