import jdk.management.jfr.FlightRecorderMXBean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Discussion implements ActionListener{

    JFrame frame;
    JButton button, button2;
    Swing_Discussion(){
        frame = new JFrame("Project");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
        frame.setSize(500,400);

        button  = new JButton("Click me!");
        button.setSize(100,50);
        button.addActionListener(this);

        button2 = new JButton("Click Me!");
        button2.setSize(100,50);
        button2.setLocation(200,0);
        button2.addActionListener(this);


        frame.add(button);
        frame.add(button2);

        frame.getContentPane().setBackground(Color.PINK);
    }



    public static void main(String[] args) {
       Swing_Discussion obj = new Swing_Discussion();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String s =e.getActionCommand();

        if(s.equals("Click me!")){
            frame.getContentPane().setBackground(Color.red);
        }
        if(s.equals("Click Me!")){
            frame.getContentPane().setBackground(Color.BLACK);
        }
    }
}
