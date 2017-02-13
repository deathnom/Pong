package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Model.Ball;
import Model.Paddle;

public class GUI {
	public static Font font1 = new Font("Sans-serif", Font.BOLD, 40);
	public static int x = 0;
	public static int y = 0;

	public GUI() {

	}

	public static void initialize() {

		JFrame frame = new JFrame("Pong");
		frame.setSize(1900, 1000);
		frame.setResizable(false);
		frame.setLocation(15, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	
		addMenu(frame);
		addPanel(frame);
		
		frame.setVisible(true);

	}

	public static void addMenu(JFrame frame/* , Drawing drawingPanel */) {
		JMenuItem Newgame = new JMenuItem("New Game");

		JMenuItem Pause = new JMenuItem("Pause/Unpause");

		JMenu menu = new JMenu("Options");
		JMenuBar menuBar = new JMenuBar();

		menu.add(Newgame);
		menu.add(Pause);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
	}

	public static void addPanel(JFrame frame) {
		Ball b = new Ball();
		Paddle p = new Paddle();
		JPanel panel = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		JPanel panel3 = new JPanel(new FlowLayout());
		JLabel score1 = new JLabel("Player 1: " + x);
		JLabel score2 = new JLabel("Player 2: " + y);
		panel.add(panel2);
		panel2.add(panel3);
		panel2.add(b);
		panel2.add(p);
		score1.setFont(font1);
		score2.setFont(font1);
		score1.setForeground(Color.WHITE);
		score2.setForeground(Color.WHITE);
		panel.add(score1,BorderLayout.NORTH );
		panel2.add(score2, BorderLayout.NORTH);
		panel.setBackground(Color.GRAY);
		panel2.setBackground(Color.GRAY);
		frame.add(panel);
	}
}

