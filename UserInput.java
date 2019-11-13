import javax.swing.*;

/**
 *
 * @author abhis
 */
public class UserInput {

    public JPanel inputPanel() {
        JPanel userInputPanel = new JPanel();
        userInputPanel.setLayout(null);
        
        
        JLabel tOrigin = new JLabel("From ");
        tOrigin.setBounds(20, 20, 150, 21);
        JLabel tDestination = new JLabel("To ");
        tDestination.setBounds(20, 70, 150, 21);
        JLabel tName = new JLabel("Name ");
        tName.setBounds(20, 120, 150, 21);
        JLabel tDate = new JLabel("Date ");
        tDate.setBounds(20, 170, 150, 21);
        JLabel tClass = new JLabel("Class ");
        tClass.setBounds(20, 220, 150, 21);
        JLabel tContact = new JLabel("Contact ");
        tContact.setBounds(20, 270, 150, 21);
        JButton findFlight = new JButton("Find Flight");
        findFlight.setBounds(20, 320, 100, 25);
        JTextField tNameField = new JTextField(15);
        tNameField.setBounds(100, 120, 150, 21);
        JTextField tDateField = new JTextField(15);
        tDateField.setBounds(100, 170, 150, 21);
        JTextField tContactField = new JTextField(15);
        tContactField.setBounds(100, 270, 150, 21);
        JLabel tAdults = new JLabel("Adults(12+) ");
        tAdults.setBounds(350, 20, 150, 21);
        JLabel tChildren = new JLabel("Children(2-11) ");
        tChildren.setBounds(350, 70, 150, 21);
        JLabel tInfants = new JLabel("Infants(Under 2) ");
        tInfants.setBounds(350, 120, 150, 21);

        userInputPanel.add(tOrigin);
        userInputPanel.add(tDestination);
        userInputPanel.add(tName);
        userInputPanel.add(tDate);
        userInputPanel.add(tClass);
        userInputPanel.add(tContact);
        userInputPanel.add(findFlight);
        userInputPanel.add(tNameField);
        userInputPanel.add(tDateField);
        userInputPanel.add(tContactField);
        userInputPanel.add(tAdults);
        userInputPanel.add(tChildren);
        userInputPanel.add(tInfants);

        return userInputPanel;
    }
    public void setFromName(String From) {
    	
    }
    public void setToName(String To) {
    	
    }
    
    
    
}