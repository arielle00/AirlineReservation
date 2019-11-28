
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
		JLabel adult = new JLabel(uD.getAdult());
		JLabel ChildrenNo = new JLabel("Children:");
		JLabel child = new JLabel(uD.getChild());
		JLabel InfantNo = new JLabel("Infant:");
		JLabel inf = new JLabel(uD.getInf());
		JLabel TicketNo = new JLabel("Ticket Number:");
		JLabel ticket = new JLabel(getSalt());
		JLabel BookedBy = new JLabel("Booked By:");
		JLabel user = new JLabel(uD.getUserName());
		JLabel Contact = new JLabel("Contact #:");
		JLabel contact = new JLabel(uD.getPhone());
		//JButton Dflight1 = new JButton(); 

		Title.setBounds(100,15,500,45);
		From.setBounds(20,80,300,20);
		fromLabel.setBounds(80,80,300,20);
		To.setBounds(20,125,300,20);
		toLabel.setBounds(80,125,300,20);
		
		PassName.setBounds(20,175,300,20);
		name.setBounds(150,175,300,20);
		
		Price.setBounds(20,225,300,20);
		cost.setBounds(75,225,300,20);
		Time.setBounds(20,275,300,20);
		time.setBounds(75,275,300,20);
		AdultsNo.setBounds(20,300,300,20);
		adult.setBounds(90,300,300,20);
		ChildrenNo.setBounds(20,325,300,20);
		child.setBounds(90,325,300,20);
		InfantNo.setBounds(20,350,300,20); 
		inf.setBounds(90,350,300,20);
		TicketNo.setBounds(320,80,300,20);
		ticket.setBounds(425,80,300,20);
		BookedBy.setBounds(320,125,300,20);
		user.setBounds(400,125,300,20);
		
		Contact.setBounds(320,175,300,20);
		contact.setBounds(400,175,300,20);

		panel3.add(Title);
		panel3.add(From);
		panel3.add(fromLabel);
		panel3.add(To);
		panel3.add(toLabel);
		panel3.add(PassName);
		panel3.add(name);
		panel3.add(AdultsNo);
		panel3.add(adult);
		panel3.add(ChildrenNo);
		panel3.add(child);
		panel3.add(InfantNo);
		panel3.add(inf);
		panel3.add(Price);
		panel3.add(cost);
		panel3.add(Time);	
		panel3.add(time);
		panel3.add(TicketNo);
		panel3.add(ticket);
		panel3.add(BookedBy);
		panel3.add(user);
		panel3.add(Contact);
		panel3.add(contact);
		panel3.setBackground(Color.GRAY);
		
		return panel3;


	}

    public String getSalt() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 9) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
