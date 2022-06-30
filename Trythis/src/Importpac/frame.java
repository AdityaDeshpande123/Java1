package Importpac;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class frame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("Hello World");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setForeground(Color.blue);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		
		JLabel label1 = new JLabel();
        label1.setText("This is Aditya");
        label1.setSize(250, 250);
        label1.setBackground(Color.red);
        label1.setOpaque(true);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
		Border border = BorderFactory.createLineBorder(Color.orange,3);
		label.setBorder(border);
		frame.setLayout(null);
		label.setBounds(0,0,250,250);
		label1.setBounds(250,250,250,250);
		frame.add(label);
		frame.add(label1);
		
		
	}

}
