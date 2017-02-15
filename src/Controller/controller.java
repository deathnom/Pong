package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.Timer;

public class controller implements ActionListener{
	private Timer timer = new Timer(200, this);
	private boolean paused = true;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JMenuItem){
			JMenuItem mi = (JMenuItem) e.getSource();
			if(mi.getText().equals("New Game")){
				
			}else if(mi.getText().equals("Pause/Unpause")){
				if(paused == true){
					paused = false;
					this.timer.start();
					
				}else{
					paused = true;
					this.timer.stop();
				}
			}
		}
	}
}
