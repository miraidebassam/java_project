import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel3 extends Observer {
	JFrame frame = new JFrame("Panel 3");
	JPanel panel = new JPanel();
	
	public Panel3(Subject subject) {
		this.subject = subject; 
		this.subject.attach(this);
		
		frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setBackground(Color.GREEN);
        frame.setVisible(true);   
	}

	@Override
	public void update() {
		panel.setBackground(subject.getState());
	}

}
