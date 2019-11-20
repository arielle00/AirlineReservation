import javax.swing.*;       
import java.awt.*;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Needs work
public class Ticket {

	public JPanel ticketPanel(UserDetails uD) {
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
	
		final String alphabet = "0123456789ABCDEFG";
	    final int N = alphabet.length();

	    Random r = new Random();

	    for (int i = 0; i < 9; i++) {
	        System.out.print(alphabet.charAt(r.nextInt(N)));
	    }
		
		JLabel Title = new JLabel("Airline Reservation Ticket");
		Title.setFont(Title.getFont().deriveFont(30.0f));
		JLabel From = new JLabel("From:");
		JLabel fromLabel = new JLabel(uD.getFrom());
		JLabel To = new JLabel("To:");
		JLabel toLabel = new JLabel(uD.getTo());
		JLabel PassName = new JLabel("Passanger Name:");
		JLabel name = new JLabel(uD.getName());

		
		JLabel Price = new JLabel("Price:");
		JLabel cost = new JLabel(uD.getCost());
		JLabel Time = new JLabel("Time:");
		JLabel time = new JLabel(uD.getTime());
		JLabel AdultsNo = new JLabel("Adults:");
		JLabel ChildrenNo = new JLabel("Children:");
		JLabel InfantNo = new JLabel("Infant:");
		JLabel TicketNo = new JLabel("Ticket Number:");
		JLabel ticket = new JLabel(Integer.toString(N));
		JLabel BookedBy = new JLabel("Booked By:");
		JLabel user = new JLabel(uD.getUserName());
		JButton Dflight1 = new JButton(); 

		Title.setBounds(100,15,500,45);
		From.setBounds(20,80,300,20);
		fromLabel.setBounds(100,80,300,20);
		To.setBounds(20,125,300,20);
		toLabel.setBounds(100,125,300,20);
		
		PassName.setBounds(20,175,300,20);
		name.setBounds(150,175,300,20);
		
		Price.setBounds(20,225,300,20);
		cost.setBounds(75,225,300,20);
		Time.setBounds(20,275,300,20);
		time.setBounds(75,275,300,20);
		AdultsNo.setBounds(20,300,300,20);
		ChildrenNo.setBounds(20,325,300,20);
		InfantNo.setBounds(20,430,300,20); 
		TicketNo.setBounds(320,80,300,20);
		ticket.setBounds(450,80,300,20);
		BookedBy.setBounds(320,125,300,20);
		user.setBounds(400,125,300,20);


		panel3.add(Title);
		panel3.add(From);
		panel3.add(fromLabel);
		panel3.add(To);
		panel3.add(toLabel);
		panel3.add(PassName);
		panel3.add(name);
		panel3.add(AdultsNo);
		panel3.add(ChildrenNo);
		panel3.add(InfantNo);
		panel3.add(Price);
		panel3.add(cost);
		panel3.add(Time);	
		panel3.add(time);
		panel3.add(TicketNo);
		panel3.add(ticket);
		panel3.add(BookedBy);
		panel3.add(user);
		panel3.setBackground(Color.GRAY);
		
		return panel3;


	}
}
