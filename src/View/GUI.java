package View;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;





public class GUI {

	
	public GUI(){
		
	}
	public static void initialize(){
		
	JFrame frame = new JFrame("Pong");
	frame.setSize(1800, 1000);
	frame.setResizable(false);
	frame.setLocation(75,0);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	addMenu(frame);
	addPanel(frame);
	frame.setVisible(true);
	
	
	
	}
	public static void addMenu(JFrame frame/*, Drawing drawingPanel*/) {
		JMenuItem Newgame = new JMenuItem("New Game");
		//startsAnimation.addActionListener(drawingPanel);
		JMenuItem Pause = new JMenuItem("Pause");
		//stopsAnimation.addActionListener(drawingPanel);
		JMenu menu = new JMenu("Options");
		JMenuBar menuBar = new JMenuBar();
		
		menu.add(Newgame);
		menu.add(Pause);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
	}
	
	public static void addPanel(JFrame frame){
		JPanel panel =new JPanel();
		panel.setBackground(Color.GRAY);
		frame.add(panel);
	}
}
	
	
	

