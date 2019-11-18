import javax.swing.*;       
import java.awt.*;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Needs work
public class Ticket {

	public JPanel ticketPanel(UserDetails uD) {
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		
		JLabel Title = new JLabel("Airline Reservation Ticket");
		Title.setFont(Title.getFont().deriveFont(30.0f));
		JLabel From = new JLabel("From:");
		JLabel To = new JLabel("To:");
		JLabel BookDate = new JLabel("Login:");
		JLabel Price = new JLabel("Price:");
		JLabel Time = new JLabel("To:");
		JLabel AdultsNo = new JLabel("Adults:");
		JLabel ChildrenNo = new JLabel("Children:");
		JLabel InfantNo = new JLabel("Infant:");
		JLabel TicketNo = new JLabel("Ticket Number:");
		JLabel BookedBy = new JLabel("Booked By:");
		JButton Dflight1 = new JButton(); 

		Title.setBounds(100,15,500,45);
		From.setBounds(20,80,300,20);
		To.setBounds(20,125,300,20);
		BookDate.setBounds(20,200,300,20);
		Price.setBounds(20,250,300,20);
		Time.setBounds(20,280,300,20);
		AdultsNo.setBounds(20,320,300,20);
		ChildrenNo.setBounds(20,350,300,20);
		InfantNo.setBounds(20,430,300,20);
		TicketNo.setBounds(320,80,300,20);
		BookedBy.setBounds(320,125,300,20);


		panel3.add(Title);
		panel3.add(From);
		panel3.add(To);
		panel3.add(BookDate);
		panel3.add(AdultsNo);
		panel3.add(ChildrenNo);
		panel3.add(InfantNo);
		panel3.add(Price);
		panel3.add(Time);	
		panel3.add(TicketNo);
		panel3.add(BookedBy);
		panel3.setBackground(Color.GRAY);
		
		return panel3;


	}
}
