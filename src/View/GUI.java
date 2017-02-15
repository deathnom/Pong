package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Model.Ball;
import Model.Paddle;

public class GUI extends JFrame implements ActionListener{
	public static Font font1 = new Font("Sans-serif", Font.BOLD, 40);
	public static int x = 0;
	public static int y = 0;
	public static JLabel score1 = new JLabel();
	public static JLabel score2 = new JLabel();
	public GUI() {

	}

	public static void initialize() {
		GUI g = new GUI();
		JFrame frame = new JFrame("Pong");
		frame.setSize(1900, 1000);
		frame.setResizable(false);
		frame.setLocation(15, 0);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setExtendedState(MAXIMIZED_BOTH);
	
		g.addMenu(frame);
		g.addPanel(frame);
		frame.setVisible(true);

	}

	public void addMenu(JFrame frame) {
		Ball b = new Ball();
		JMenuItem Newgame = new JMenuItem("New Game");
		JMenuItem Pause = new JMenuItem("Pause/Unpause");
		JMenuItem exit = new JMenuItem("Exit");
		JMenu menu = new JMenu("Options");
		JMenuBar menuBar = new JMenuBar();

		menu.add(Newgame);
		Newgame.addActionListener(this);
		menu.add(Pause);
		Pause.addActionListener(this);
		menu.add(exit);
		exit.addActionListener(this);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
	}

	public void addPanel(JFrame frame) {
		Ball b = new Ball();
		Paddle p = new Paddle();
		JPanel panel = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		 score1.setText("Player 1: " + x);
		score2.setText("Player 2: " + y);
		panel.add(score1,BorderLayout.NORTH );
		panel2.add(score2, BorderLayout.NORTH);
		panel.add(panel2);
		panel2.add(b);
		score1.setFont(font1);
		score2.setFont(font1);
		score1.setForeground(Color.WHITE);
		score2.setForeground(Color.WHITE);
		
		panel.setBackground(Color.GRAY);
		panel2.setBackground(Color.GRAY);
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		if(e.getSource() instanceof JMenuItem){
			if(item.getText().equals("New Game")){
				x = 0;
				y = 0;
				score1.setText("Player 1: 0");
				score2.setText("Player 2: 0");
			}else if(item.getText().equals("Exit")){
				System.exit(0);
			}
		}
	}
}