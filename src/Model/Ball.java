package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

import edu.neumont.csc150.graphics.Ball;





public class Ball extends JPanel{
		private int x, y, width, xVelocity, yVelocity;
		
		private Color color;
		
		public Ball() {}
		
		public Ball(int x, int y, int w, int h, int xV, int yV) {
			this.setX(x);
			this.setY(y);
			this.setWidth(w);
			this.setxVelocity(xV);
			this.setyVelocity(yV);
		}
		
		public void detectWallCollision(int rObjX, int rObjY, int lObjX, int lObjY) {
			if(this.x >= rObjX - this.width || this.x < lObjX) {
				this.xVelocity *= -1;
			}
			if(this.y >= rObjY - this.width || this.y < lObjY) {
				this.yVelocity *= -1;
			}
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}


		public int getxVelocity() {
			return xVelocity;
		}

		public void setxVelocity(int xVelocity) {
			this.xVelocity = xVelocity;
		}

		public int getyVelocity() {
			return yVelocity;
		}

		public void setyVelocity(int yVelocity) {
			this.yVelocity = yVelocity;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
		
		public static Ball newBall(
				int minWidth, int maxWidth, int minHeight, int maxHeight,
				int minX, int maxX, int minY, int maxY,
				int minXV, int maxXV, int minYV, int maxYV) {
			Ball ball = new Ball();
			ball.setWidth((maxWidth - minWidth) + minWidth);
			ball.setX((maxX - minX) + minX);
			ball.setY((maxY - minY) + minY);
			ball.setxVelocity((maxXV - minXV) + minXV);
			ball.setyVelocity((maxYV - minYV) + minYV);
			ball.setColor(Color.BLACK);
			return ball;
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
					g.setColor(ball.getColor());
					g.fillOval(ball.getX(), ball.getY(), ball.getWidth(),ball.getWidth());
				}
			
		}


