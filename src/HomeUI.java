import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class HomeUI extends JFrame{

		Subject subject = new Subject();


    public HomeUI() {
        JFrame frame = new JFrame("Home UI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();


        JButton button = new JButton("Change Color");
        JButton button1 = new JButton("Open");
        JButton exit = new JButton("Exit");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Panel1(subject);
                new Panel2(subject);
                new Panel3(subject);

            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color randomColor = new Color(r, g, b);
                subject.setState(randomColor);
            }
        });


        panel.add(button);
        panel.add(button1);
        panel.add(exit);


        frame.add(panel);

        frame.setVisible(true);


    }


}
