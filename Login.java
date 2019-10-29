import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		WindowUtilities.setNativeLookAndFeel(); //sets the look and feel with the Window Utilities class

		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel title = new JLabel("Airline Reservation");
		JLabel username = new JLabel("Username");
		JLabel password = new JLabel("Password");
		JButton enter = new JButton("Login");
		
		JTextField user = new JTextField(15);
		JTextField pass = new JTextField(15);
	
		title.setBounds(160, 10, 200, 100);
		username.setBounds(100, 100, 150, 21);
		user.setBounds(250, 100, 100, 21);
		password.setBounds(100, 140, 100, 21);
		pass.setBounds(250, 140, 100, 21);
		enter.setBounds(160, 200, 100, 25);
		
		panel.add(title);
		panel.add(username);
		panel.add(user);
		panel.add(password);
		panel.add(pass);
		panel.add(enter);
		
		frame.add(panel);
		
		
		enter.addActionListener(event -> 
		{
			String userName = user.getText();
			String passWord = pass.getText();
			
			if (userName.compareTo(passWord)==0) {
				//JFrame ticketFrame = new JFrame();
				//ticketFrame.setSize(500, 300);
				//ticketFrame.setVisible(true);
                                frame.remove(panel);
                                frame.repaint();
                                frame.revalidate();
			}
		});
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.GRAY);
	    //frame.pack();
	    frame.setVisible(true);

	}

}
