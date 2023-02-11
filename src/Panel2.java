import javax.swing.*;
import java.awt.*;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Panel2 extends Observer{
    JFrame frame = new JFrame("Panel 2");
    JPanel panel = new JPanel();

    public Panel2(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

        frame.setSize(300, 200);
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
